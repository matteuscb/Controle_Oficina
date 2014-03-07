/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Caixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DAO {

    private Connection conexao;

    public DAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Caixa caixa) throws SQLException {
        String sql = "insert into caixa (cai_cliente,cai_data,cai_valor,cai_tipo) values\n"
                + "(?,?,?,?);";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, caixa.getCliente());
            stmt.setDate(2, new java.sql.Date(caixa.getData().getTime()));
            stmt.setDouble(3, caixa.getValor());
            stmt.setString(4, caixa.getTipo());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void alterar(Caixa caixa) throws SQLException {
        String sql = "update caixa set cai_cliente = ?, cai_data = ?, cai_valor = ?, cai_pago = ?"
                + "where cai_id = ?";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, caixa.getCliente());
            stmt.setDate(2, new java.sql.Date(caixa.getData().getTime()));
            stmt.setDouble(3, caixa.getValor());
            stmt.setString(4, caixa.getPago());
            stmt.setLong(5, caixa.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alteração efetuada.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Caixa> listarEntrada(java.util.Date DataI, java.util.Date DataF) {
        List<Caixa> caixas = new ArrayList<>();
        String sql = "select * from caixa where cai_data >= ? and cai_data <=? and  cai_tipo = 'E' order by cai_pago desc,cai_cliente";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setId(rs.getLong("cai_id"));
                caixa.setCliente(rs.getString("cai_cliente"));
                caixa.setData(rs.getDate("cai_data"));
                caixa.setValor(rs.getDouble("cai_valor"));
                caixa.setPago(rs.getString("cai_pago"));
                caixas.add(caixa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return caixas;
    }

    public List<Caixa> listarSaida(java.util.Date DataI, java.util.Date DataF) {
        List<Caixa> caixas = new ArrayList<>();
        String sql = "select * from caixa where cai_data >= ? and cai_data <=? and  cai_tipo = 'S' order by cai_pago desc,cai_cliente";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setId(rs.getLong("cai_id"));
                caixa.setCliente(rs.getString("cai_cliente"));
                caixa.setData(rs.getDate("cai_data"));
                caixa.setValor(rs.getDouble("cai_valor"));
                caixa.setPago(rs.getString("cai_pago"));
                caixas.add(caixa);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return caixas;
    }

    public double TotalSaida(java.util.Date DataI, java.util.Date DataF) {
        double retorno = 0;
        try {
            String sql = "select sum(cai_valor) as totals from caixa "
                    + "where cai_tipo = 'S' and cai_data >=? and cai_data <=?";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                retorno = rs.getDouble("totals");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return retorno;
    }

    public double TotalEntrada(java.util.Date DataI, java.util.Date DataF) {
        double retorno = 0;
        try {
            String sql = "select sum(cai_valor) as totale from caixa "
                    + "where cai_tipo = 'E' and cai_data >=? and cai_data <=?";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                retorno = rs.getDouble("totale");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return retorno;
    }

    public double TotalLiquido(java.util.Date DataI, java.util.Date DataF) {
        double retorno = 0;
        try {
            String sql = "select case when sum(cai_valor) is null then 0.0 else sum(cai_valor) end - \n"
                    + "                (select case when sum(cai_valor) is null then 0.0 else sum(cai_valor) end\n"
                    + "                from caixa where cai_tipo = 'S' and cai_data >=? and cai_data  <=?) as total \n"
                    + "                from caixa where cai_tipo='E' and cai_data >=? and cai_data <=?";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            pstmt.setDate(3, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(4, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                retorno = rs.getDouble("total");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return retorno;
    }

    public Caixa buscarID(Long id) {
        Caixa caixa = new Caixa();
        String sql = "select * from caixa where cai_id = " + id;
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                caixa.setCliente(rs.getString("cai_cliente"));
                caixa.setData(rs.getDate("cai_data"));
                caixa.setValor(rs.getDouble("cai_valor"));
                caixa.setPago(rs.getString("cai_pago"));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
        return caixa;
    }

    public Double TotalSaida() {
        Double resul = .0;
        try {
            String sql = "SELECT SUM(CAI_VALOR) AS SAIDA FROM CAIXA WHERE CAI_TIPO = 'S' AND"
                    + " EXTRACT(YEAR FROM CURRENT_DATE) = EXTRACT(YEAR FROM CAI_DATA)";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                resul = rs.getDouble("saida");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return resul;

    }

    public Double TotalEntrada() {
        Double resul = .0;
        try {
            String sql = "SELECT SUM(CAI_VALOR) AS ENTRADA FROM CAIXA WHERE CAI_TIPO = 'E' AND"
                    + " EXTRACT(YEAR FROM CURRENT_DATE) = EXTRACT(YEAR FROM CAI_DATA)";
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                resul = rs.getDouble("entrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return resul;

    }

    public List<Double> metas() throws SQLException {
        List<Double> resul = new ArrayList<>();
        String sql = "select * from metas";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            resul.add(rs.getDouble("meta_entrada"));
            resul.add(rs.getDouble("meta_saida"));
        }
        return resul;
    }
}
