/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class informacoesPessoais {

    private String NomeCompleto;
    private int CPF;
    private int RG;
    private int DataDeNascimento;
    private int telefone;
    private String email;
    private String profissao;
    private float rendaMensal;
    private String estadoCivil;

    public informacoesPessoais(String NomeCompleto, int CPF, int RG, int DataDeNascimento, int telefone, String email, String profissao, float rendaMensal, String estadoCivil) {
        this.NomeCompleto = NomeCompleto;
        this.CPF = CPF;
        this.RG = RG;
        this.DataDeNascimento = DataDeNascimento;
        this.telefone = telefone;
        this.email = email;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.estadoCivil = estadoCivil;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(int DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
