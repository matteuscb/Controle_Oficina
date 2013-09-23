package DAO;

import Connection.ConnectionFactory;
import Modelo.Cartao;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CartaoDAO {

    private Connection conexao;

    public CartaoDAO() {
        this.conexao = ConnectionFactory.getConexao();
    }

    public int PegarId() throws SQLException {
        int aux = 0;
        String sql = "select max(car_codigo) as max from cartao";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            aux = rs.getInt("max");
        }

        return aux + 1;
    }

    public void adicionar(Cartao cartao) {
        String sql = "insert into cartao (car_cliente,car_codigo,car_parcela,car_valor,car_datapgto,car_datacompra,car_obs,car_status,car_tipo) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setInt(1, cartao.getId_cliente());
            pstmt.setInt(2, cartao.getId());
            pstmt.setInt(3, cartao.getParcela());
            pstmt.setDouble(4, cartao.getValor());
            pstmt.setDate(5, new java.sql.Date(cartao.getDataPagamento().getTime()));
            pstmt.setDate(6, new java.sql.Date(cartao.getDataCompra().getTime()));
            pstmt.setString(7, cartao.getObs());
            pstmt.setString(8, cartao.getStatus());
            pstmt.setString(9, cartao.getTipo());

            pstmt.execute();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e);
        }
    }

    public List<Cartao> listarGeral(String status) throws SQLException {

        String sql = "select cli_nome,car_codigo,cli_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo"
                + " from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_status ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public List<Cartao> listarCredito(String status) throws SQLException {

        String sql = "select cli_nome,car_codigo,cli_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo "
                + "from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_tipo ilike 'crédito' and car_status ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public List<Cartao> listarDebito(String status) throws SQLException {

        String sql = "select cli_nome,car_codigo,cli_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo "
                + "from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_tipo ilike 'débito' and car_status ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public List<Cartao> listarDia(String status) throws SQLException {

        String sql = "select cli_nome,car_codigo,cli_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo "
                + "from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_datapgto = current_date and car_status ilike ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public List<Cartao> listarMes(String status) throws SQLException {

        String sql = "select cli_nome,car_codigo,cli_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo "
                + "from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_status ilike ? and extract(month from car_datapgto) = extract(month from current_date) "
                + "and extract (year from car_datapgto) = extract (year from  current_date)";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public List<Cartao> listarCPF(String status, String cpf) throws SQLException {

        String sql = "select cli_nome,car_codigo, car_parcela,car_datacompra,car_datapgto,car_valor,car_status,car_obs,car_tipo "
                + "from cartao inner join cliente on cartao.car_cliente = cliente.cli_codigo "
                + "where car_status ilike ? and cli_cpf = ?";

        PreparedStatement pstmt = this.conexao.prepareStatement(sql);

        pstmt.setString(1, status);
        pstmt.setString(2, cpf);

        ResultSet rs = pstmt.executeQuery();

        List<Cartao> cartoes = new ArrayList<>();
        while (rs.next()) {
            Cartao cartao = new Cartao();
            Cliente cliente = new Cliente();
            cliente.setNome(rs.getString("cli_nome"));
            cartao.setCliente(cliente);
            cartao.setParcela(rs.getInt("car_parcela"));
            cartao.setDataCompra(rs.getDate("car_datacompra"));
            cartao.setDataPagamento(rs.getDate("car_datapgto"));
            cartao.setValor(rs.getDouble("car_valor"));
            cartao.setStatus(rs.getString("car_status"));
            cartao.setObs(rs.getString("car_obs"));
            cartao.setTipo(rs.getString("car_tipo"));
            cartao.setId(rs.getInt("car_codigo"));
            cartoes.add(cartao);
        }
        rs.close();
        pstmt.close();
        return cartoes;
    }

    public void PagarParcela() throws SQLException {
        String sql = "select * from cartao where car_datapgto = current_date and car_status ilike 'pendente'";
        List<Cartao> cartoes = new ArrayList<>();
        try {
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Cartao cartao = new Cartao();
                cartao.setId(rs.getInt("car_codigo"));
                cartao.setParcela(rs.getInt("car_parcela"));
                Pagar(cartao);
                cartoes.add(cartao);
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e);
        }
    }

    public void Pagar(Cartao cartao) throws SQLException {
        String sql = "update cartao set car_status = 'Pago' where car_codigo = ? and car_parcela = ?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setInt(1, cartao.getId());
        stmt.setInt(2, cartao.getParcela());
        stmt.execute();
        stmt.close();
    }
}
