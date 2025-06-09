package Modelo;

public class ContratoM {
    private int idContrato;
    private String dataInicio;
    private String dataFim;
    private double valor;
    private int idInquilino;
    private int idImovel;

    // Construtores
    public ContratoM() {}

    public ContratoM(String dataInicio, String dataFim, double valor, int idInquilino, int idImovel) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.idInquilino = idInquilino;
        this.idImovel = idImovel;
    }

    public ContratoM(int idContrato, String dataInicio, String dataFim, double valor, int idInquilino, int idImovel) {
        this.idContrato = idContrato;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.idInquilino = idInquilino;
        this.idImovel = idImovel;
    }

    // Getters e Setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }
}
