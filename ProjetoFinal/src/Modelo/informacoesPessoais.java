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
    private String CPF;
    private String RG;
    private String DataDeNascimento;
    private String telefone;
    private String email;
    private String profissao;
    private float rendaMensal;
    private String estadoCivil;

    public informacoesPessoais(String NomeCompleto, String CPF, String RG, String DataDeNascimento, String telefone, String email, String profissao, float rendaMensal, String estadoCivil) {
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
