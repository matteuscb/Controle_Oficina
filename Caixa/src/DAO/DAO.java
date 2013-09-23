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
import java.util.Date;
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

    public List<Caixa> listarEntrada(java.util.Date DataI, java.util.Date DataF) {
        List<Caixa> caixas = new ArrayList<>();
        String sql = "select * from caixa where cai_data >= ? and cai_data <=? and  cai_tipo = 'E'";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setCliente(rs.getString("cai_cliente"));
                caixa.setData(rs.getDate("cai_data"));
                caixa.setValor(rs.getDouble("cai_valor"));
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
        String sql = "select * from caixa where cai_data >= ? and cai_data <=? and  cai_tipo = 'S'";

        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDate(1, new java.sql.Date(DataI.getTime()));
            pstmt.setDate(2, new java.sql.Date(DataF.getTime()));
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Caixa caixa = new Caixa();
                caixa.setCliente(rs.getString("cai_cliente"));
                caixa.setData(rs.getDate("cai_data"));
                caixa.setValor(rs.getDouble("cai_valor"));
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
}