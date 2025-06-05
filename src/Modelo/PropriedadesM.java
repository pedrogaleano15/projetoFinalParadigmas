package Modelo;

public class PropriedadesM {
    private int idDono;
    private String endereco;
    private String tipoImovel;
    private double valorAluguel;
    private double area;
    private int quartos;
    private int banheiros;
    private int vagasGaragem;
    private boolean disponivel; 

    public PropriedadesM(int idDono, String endereco, String tipoImovel, double valorAluguel, double area, int quartos, int banheiros, int vagasGaragem, boolean disponivel) {
        this.idDono = idDono;
        this.endereco = endereco;
        this.tipoImovel = tipoImovel;
        this.valorAluguel = valorAluguel;
        this.area = area;
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.vagasGaragem = vagasGaragem;
        this.disponivel = disponivel;
    }

    public int getIdDono() {
        return idDono;
    }

    public void setIdDono(int idDono) {
        this.idDono = idDono;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
}