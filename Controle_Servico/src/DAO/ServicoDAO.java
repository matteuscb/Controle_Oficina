/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import Modelo.Servico;
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
public class ServicoDAO {

    private Connection conexao;

    public ServicoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void adicionar(Servico servico) throws SQLException {
        String sql = "insert into servicos (ser_cliente,ser_servico,ser_data)"
                + "values (?,?,?)";
        try {
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, servico.getCliente());
            stmt.setString(2, servico.getServico());
            stmt.setDate(3, new java.sql.Date(servico.getData().getTime()));

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Serviço Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }

    public List<Servico> listar(java.util.Date dataI, java.util.Date dataF) throws SQLException {
        String sql = "select * from servicos where ser_data >=? and ser_data <=? order by ser_data";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);
        pstmt.setDate(1, new java.sql.Date(dataI.getTime()));
        pstmt.setDate(2, new java.sql.Date(dataF.getTime()));

        ResultSet rs = pstmt.executeQuery();
        List<Servico> clientes = new ArrayList<>();

        while (rs.next()) {
            Servico servico = new Servico();
            servico.setCliente(rs.getString("ser_cliente"));
            servico.setServico(rs.getString("ser_servico"));
            servico.setData(rs.getDate("ser_data"));
            servico.setCodigo(rs.getInt("ser_codigo"));
            clientes.add(servico);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public List<Servico> listarTudo() throws SQLException {
        String sql = "select * from servicos order by ser_data";
        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        List<Servico> clientes = new ArrayList<>();

        while (rs.next()) {
            Servico servico = new Servico();
            servico.setCliente(rs.getString("ser_cliente"));
            servico.setServico(rs.getString("ser_servico"));
            servico.setData(rs.getDate("ser_data"));
            servico.setCodigo(rs.getInt("ser_codigo"));
            clientes.add(servico);
        }
        rs.close();
        pstmt.close();
        return clientes;
    }

    public void alterar(Servico servico) throws SQLException {
        String sql = "update servicos set ser_cliente = ?,ser_servico = ? where ser_codigo = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, servico.getCliente());
        stmt.setString(2, servico.getServico());
        stmt.setInt(3, servico.getCodigo());
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Serviço alterado com sucesso!");
    }
    public void alterarData(Servico servico) throws SQLException {
        String sql = "update servicos set ser_data = ? where ser_codigo = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setDate(1, new java.sql.Date(servico.getData().getTime()));
        stmt.setInt(2, servico.getCodigo());
        
        stmt.execute();
        stmt.close();
        JOptionPane.showMessageDialog(null, "Serviço alterado com sucesso!");
    }

    public void remover(int id) throws SQLException {
        String sql = "delete from servicos where ser_codigo=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
    }
}
