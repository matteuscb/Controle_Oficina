package Modelo;

import java.util.Date;

public class Cartao {

    private Cliente cliente;
    private Date DataCompra;
    private Date DataPagamento;
    private double valor;
    private Integer parcela;
    private Integer id;
    private Integer id_cliente;
    private String status;
    private String obs;
    private String tipo;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCompra() {
        return DataCompra;
    }

    public void setDataCompra(Date DataCompra) {
        this.DataCompra = DataCompra;
    }

    public Date getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(Date DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
