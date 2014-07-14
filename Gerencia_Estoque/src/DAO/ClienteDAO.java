package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Cliente cliente) throws SQLException {
        String sql = "insert into cliente (cli_nome,cli_celular,cli_telefone,cli_cpf,cli_rg,"
                + "cli_email,cli_rua,cli_numero,cli_bairro,cli_cidade) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCelular());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getCpf());
            stmt.setString(5, cliente.getRg());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getRua());
            stmt.setString(8, cliente.getNumero());
            stmt.setString(9, cliente.getBairro());
            stmt.setString(10, cliente.getCidade());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Cliente> listar(String nome) throws SQLException {
        String sql = "select * from cliente where cli_nome ilike ? order by cli_nome";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Cliente> clientes = new ArrayList<>();

        while (rs.next()) {
            Cliente t = new Cliente();
            t.setNome(rs.getString("cli_nome"));
            t.setCelular(rs.getString("cli_celular"));
            t.setTelefone(rs.getString("cli_telefone"));
            t.setCpf(rs.getString("cli_cpf"));
            t.setRg(rs.getString("cli_rg"));
            t.setEmail(rs.getString("cli_email"));
            t.setRua(rs.getString("cli_rua"));
            t.setNumero(rs.getString("cli_numero"));
            t.setBairro(rs.getString("cli_bairro"));
            t.setCidade(rs.getString("cli_cidade"));
            t.setId(rs.getInt("cli_codigo"));
            clientes.add(t);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from cliente where cli_codigo= ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public void alterar(Cliente cliente) throws SQLException {
        String sql = "update cliente set cli_nome = ?,cli_celular = ?, cli_telefone = ?, cli_cpf = ?,"
                + "cli_rg = ?,cli_email = ?,cli_rua = ?, cli_numero = ?, cli_bairro = ?,cli_cidade = ?"
                + " where cli_codigo = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCelular());
        stmt.setString(3, cliente.getTelefone());
        stmt.setString(4, cliente.getCpf());
        stmt.setString(5, cliente.getRg());
        stmt.setString(6, cliente.getEmail());
        stmt.setString(7, cliente.getRua());
        stmt.setString(8, cliente.getNumero());
        stmt.setString(9, cliente.getBairro());
        stmt.setString(10, cliente.getCidade());
        stmt.setInt(11, cliente.getId());
        stmt.execute();
        stmt.close();
    }
}
