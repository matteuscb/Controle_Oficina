package Modelo;

public class Tecido {

    private String loja;
    private String mostruario;
    private String tipo;
    private String corF;
    private String cor;
    private String teflon;
    private String artigo;
    private Integer id;
    private double preco;
    private double quantidade;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTeflon() {
        return teflon;
    }

    public void setTeflon(String teflon) {
        this.teflon = teflon;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getMostruario() {
        return mostruario;
    }

    public void setMostruario(String mostruario) {
        this.mostruario = mostruario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCorF() {
        return corF;
    }

    public void setCorF(String corF) {
        this.corF = corF;
    }

    public String getArtigo() {
        return artigo;
    }

    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
