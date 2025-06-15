package Modelo;

public class ContratoM {
    private int idContrato;
    private String dataInicio;
    private String dataFim;
    private double valor;
    private int idInquilino;
    private int idPropriedade;
    private int diaVencimento; // Campo adicionado

    // Construtores
    public ContratoM() {}

    public ContratoM(String dataInicio, String dataFim, double valor, 
                   int idInquilino, int idPropriedade, int diaVencimento) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.idInquilino = idInquilino;
        this.idPropriedade = idPropriedade;
        this.diaVencimento = diaVencimento;
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

    public int getIdPropriedade() {
        return idPropriedade;
    }

    public void setIdPropriedade(int idPropriedade) {
        this.idPropriedade = idPropriedade;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
}