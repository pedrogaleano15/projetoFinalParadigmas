package Modelo;

public class DonoImovelM {
    private String nomeCompleto;
    private String cpfCnpj;
    private String rgIe;
    private String telefone;
    private String email;
    private String endereco; 
    private String banco;
    private String agencia; 
    private String conta;
    private String tipoConta;

    public DonoImovelM(String nomeCompleto, String cpfCnpj, String rgIe, String telefone, String email, String endereco, String banco, String agencia, String conta, String tipoConta) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.rgIe = rgIe;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.tipoConta = tipoConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    
    
}