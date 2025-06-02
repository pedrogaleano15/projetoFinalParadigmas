package Controle;

import Modelo.DonoImovelM;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;

public class DonosC {
    private Database BD = new Database();
    public ResultSet dadosConsulta;
    
    // Inserir novo proprietário
    public void inserirDono(DonoImovelM dono) {
        try {
            BD.conexao();
            String SQL = "INSERT INTO Donos (nome_completo, cpf_cnpj, rg_ie, telefone, email, endereco, "
                       + "banco, agencia, conta, tipo_conta) VALUES ('" + dono.getNomeCompleto() + "','" 
                       + dono.getCPF()+ "','" + dono.getRG()+ "','" + dono.getTelefone() + "','" 
                       + dono.getEmail() + "','" + dono.getEndereco + "','" + dono.getBanco() + "','" 
                       + dono.getAgencia() + "','" + dono.getConta() + "','" + dono.getTipodeconta()+ "')";
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao inserir proprietário");
            e.printStackTrace();
        }
    }
    
    // Atualizar proprietário
    public void atualizarDono(int id, DonoImovelM dono) {
        try {
            BD.conexao();
            String SQL = "UPDATE Donos SET nome_completo='" + dono.getNomeCompleto() + "', cpf_cnpj='" 
                       + dono.getCPF()+ "', rg_ie='" + dono.getRG()+ "', telefone='" 
                       + dono.getTelefone() + "', email='" + dono.getEmail() + "', endereco='" 
                       + dono.getEndereco() + "', banco='" + dono.getBanco() + "', agencia='" 
                       + dono.getAgencia() + "', conta='" + dono.getConta() + "', tipo_conta='" 
                       + dono.getTipodeconta()+ "' WHERE id_dono=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar proprietário");
            e.printStackTrace();
        }
    }
    
    // Deletar proprietário
    public void deletarDono(int id) {
        try {
            BD.conexao();
            String SQL = "DELETE FROM Donos WHERE id_dono=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao deletar proprietário");
            e.printStackTrace();
        }
    }
    
    // Consultar proprietário por ID
    public ResultSet consultarDono(int id) {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Donos WHERE id_dono=" + id;
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
    
    // Consultar todos proprietários
    public ResultSet consultarTodosDonos() {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Donos";
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
}