package DAO;

import Connection.ConnectionFactory;
import Modelo.Tecido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TecidoDAO {

    private Connection conexao;

    public TecidoDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Tecido t) throws SQLException {

        String sql = "insert into tecidos (tipo,mostruario,artigo,corf,preco,loja,teflon)"
                + "values (?,?,?,?,?,?,?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, t.getTipo());
        stmt.setString(2, t.getMostruario());
        stmt.setString(3, t.getArtigo());
        stmt.setString(4, t.getCorF());
        stmt.setDouble(5, t.getPreco());
        stmt.setString(6, t.getLoja());
        stmt.setString(7, t.getTeflon());

        stmt.execute();
        stmt.close();

    }

    public void adicionarLoja(Tecido t) throws SQLException {

        String sql = "insert into tecidosloja (mostruario,artigo,quant,cor)"
                + "values (?,?,?,?)";

        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, t.getMostruario());
        stmt.setString(2, t.getArtigo());
        stmt.setDouble(3, t.getQuantidade());
        stmt.setString(4, t.getCor());

        stmt.execute();
        stmt.close();

    }

    public List<Tecido> pegarTecido(Tecido tecido) throws SQLException {
        String sql = "select * from tecidos where artigo ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, tecido.getArtigo());
        ResultSet rs = pstmt.executeQuery();
        List<Tecido> tecidos = new ArrayList<Tecido>();
        while (rs.next()) {
            tecido.setTeflon(rs.getString("teflon"));
            tecido.setArtigo(rs.getString("artigo"));
            tecido.setPreco(rs.getDouble("preco"));
            tecido.setCorF(rs.getString("corf"));
            tecido.setTipo(rs.getString("tipo"));
            tecido.setLoja(rs.getString("loja"));
            tecido.setMostruario(rs.getString("mostruario"));
            tecidos.add(tecido);

        }
        rs.close();
        pstmt.close();
        return tecidos;

    }

    public List<Tecido> pegarTecidoEstoque(Tecido tecido) throws SQLException {
        String sql = "select * from tecidosloja where artigo ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, tecido.getArtigo());
        ResultSet rs = pstmt.executeQuery();
        List<Tecido> tecidos = new ArrayList<Tecido>();
        while (rs.next()) {
            tecido.setArtigo(rs.getString("artigo"));
            tecido.setQuantidade(rs.getDouble("quant"));
            tecido.setMostruario(rs.getString("mostruario"));
            tecido.setCor(rs.getString("cor"));
            tecidos.add(tecido);

        }
        rs.close();
        pstmt.close();
        return tecidos;

    }

    public void remover(Tecido t) throws SQLException {
        String sql = "delete from tecidos where artigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, t.getArtigo());
        stmt.execute();
        stmt.close();
    }

    public void removerEstoque(Tecido t) throws SQLException {
        String sql = "delete from tecidosloja where artigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, t.getArtigo());
        stmt.execute();
        stmt.close();
    }

    public void altera(Tecido t) throws SQLException {
        try {
            String sql = "update tecidos set tipo = ?,mostruario = ?,corf=?,preco=?,loja=?,teflon=? where artigo = ?";

            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, t.getTipo());
            stmt.setString(2, t.getMostruario());
            stmt.setString(3, t.getCorF());
            stmt.setDouble(4, t.getPreco());
            stmt.setString(5, t.getLoja());
            stmt.setString(6, t.getTeflon());
            stmt.setString(7, t.getArtigo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Tecido> getLista() throws SQLException {

        String sql = "select * from tecidos order by artigo";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Tecido> tecidos = new ArrayList<Tecido>();

        while (rs.next()) {
            Tecido t = new Tecido();
            t.setArtigo(rs.getString("artigo"));
            t.setLoja(rs.getString("loja"));
            t.setMostruario(rs.getString("mostruario"));
            t.setTipo(rs.getString("tipo"));
            t.setCorF(rs.getString("corf"));
            t.setPreco(rs.getDouble("preco"));
            t.setTeflon(rs.getString("teflon"));

            tecidos.add(t);

        }
        rs.close();
        pstmt.close();
        return tecidos;

    }

    public void alteraEstoque(Tecido t) throws SQLException {
        try {
            String sql = "update tecidosloja set mostruario = ?,quant=?,cor=? where artigo = ?";

            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, t.getMostruario());
            stmt.setDouble(2, t.getQuantidade());
            stmt.setString(3, t.getCor());
            stmt.setString(4, t.getArtigo());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Tecido> getListaEstoque(String artigo) {
        List<Tecido> tecidos = new ArrayList<Tecido>();
        try {
            String sql = "select * from tecidosloja where artigo ilike ? order by artigo";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, artigo);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Tecido t = new Tecido();
                t.setArtigo(rs.getString("artigo"));
                t.setCor(rs.getString("cor"));
                t.setMostruario(rs.getString("mostruario"));
                t.setQuantidade(rs.getDouble("quant"));
                tecidos.add(t);
            }
            rs.close();
            pstmt.close();
            return tecidos;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tecidos;


    }
}
