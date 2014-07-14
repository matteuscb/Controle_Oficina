/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Cliente;
import Modelo.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FornecedorDAO {

    private Connection conexao;

    public FornecedorDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Fornecedor fornecedor) throws SQLException {
        String sql = "insert into fornecedor (for_loja,for_vendedor,for_telefone1,"
                + "for_telefone2,for_telefone3,for_telefone4,for_email,for_rua,"
                + "for_numero,for_bairro,for_cidade,for_estado,for_cep,for_obs) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, fornecedor.getLoja());
            stmt.setString(2, fornecedor.getVendedor());
            stmt.setString(3, fornecedor.getTelefone1());
            stmt.setString(4, fornecedor.getTelefone2());
            stmt.setString(5, fornecedor.getTelefone3());
            stmt.setString(6, fornecedor.getTelefone4());
            stmt.setString(7, fornecedor.getEmail());
            stmt.setString(8, fornecedor.getRua());
            stmt.setString(9, fornecedor.getNumero());
            stmt.setString(10, fornecedor.getBairro());
            stmt.setString(11, fornecedor.getCidade());
            stmt.setString(12, fornecedor.getEstado());
            stmt.setString(13, fornecedor.getCep());
            stmt.setString(14, fornecedor.getObs());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Fornecedor> listar(String nome) throws SQLException {
        String sql = "select * from fornecedor where for_loja ilike ? order by for_loja";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setString(1, nome);

        ResultSet rs = pstmt.executeQuery();
        List<Fornecedor> fornecedores = new ArrayList<>();

        while (rs.next()) {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setCodigo(rs.getInt("for_codigo"));
            fornecedor.setLoja(rs.getString("for_loja"));
            fornecedor.setVendedor(rs.getString("for_vendedor"));
            fornecedor.setTelefone1(rs.getString("for_telefone1"));
            fornecedor.setTelefone2(rs.getString("for_telefone2"));
            fornecedor.setTelefone3(rs.getString("for_telefone3"));
            fornecedor.setTelefone4(rs.getString("for_telefone4"));
            fornecedor.setEmail(rs.getString("for_email"));
            fornecedor.setRua(rs.getString("for_rua"));
            fornecedor.setNumero(rs.getString("for_numero"));
            fornecedor.setBairro(rs.getString("for_bairro"));
            fornecedor.setCidade(rs.getString("for_cidade"));
            fornecedor.setEstado(rs.getString("for_estado"));
            fornecedor.setCep(rs.getString("for_cep"));
            fornecedor.setObs(rs.getString("for_obs"));
            fornecedores.add(fornecedor);
        }
        rs.close();
        pstmt.close();
        return fornecedores;
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from fornecedor where for_codigo= ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }

    public void atualizar(Fornecedor fornecedor) throws SQLException {
        String sql = "update fornecedor set for_loja = ?,for_vendedor = ?,"
                + "for_telefone1 = ?, for_telefone2 = ?, for_telefone3 = ?,"
                + " for_telefone4 = ?, for_email = ?, for_rua = ?, for_numero = ?,"
                + " for_bairro = ?, for_cidade = ?, for_estado = ?, for_cep = ?,"
                + " for_obs = ?"
                + " where for_codigo = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, fornecedor.getLoja());
        stmt.setString(2, fornecedor.getVendedor());
        stmt.setString(3, fornecedor.getTelefone1());
        stmt.setString(4, fornecedor.getTelefone2());
        stmt.setString(5, fornecedor.getTelefone3());
        stmt.setString(6, fornecedor.getTelefone4());
        stmt.setString(7, fornecedor.getEmail());
        stmt.setString(8, fornecedor.getRua());
        stmt.setString(9, fornecedor.getNumero());
        stmt.setString(10, fornecedor.getBairro());
        stmt.setString(11, fornecedor.getCidade());
        stmt.setString(12, fornecedor.getEstado());
        stmt.setString(13, fornecedor.getCep());
        stmt.setString(14, fornecedor.getObs());
        stmt.setInt(15, fornecedor.getCodigo());
        stmt.execute();
        stmt.close();
    }
}
