package Controle;

import Modelo.informacoesPessoais;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;

public class inquilinosC {
    private Database BD = new Database();
    public ResultSet dadosConsulta;
    
    // Inserir novo inquilino
    public void inserirInquilino(informacoesPessoais inquilino) {
        try {
            BD.conexao();
            String SQL = "INSERT INTO Inquilinos (nome_completo, cpf, rg, data_nascimento, telefone, "
                       + "email, profissao, renda_mensal, estado_civil) VALUES ('" 
                       + inquilino.getNomeCompleto() + "','" + inquilino.getCPF()+ "','" 
                       + inquilino.getRG()+ "','" + inquilino.getDataDeNascimento()+ "','" 
                       + inquilino.getTelefone() + "','" + inquilino.getEmail() + "','" 
                       + inquilino.getProfissao() + "'," + inquilino.getRendaMensal() + ",'" 
                       + inquilino.getEstadoCivil() + "')";
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao inserir inquilino");
            e.printStackTrace();
        }
    }
    
    // Atualizar inquilino
    public void atualizarInquilino(int id, informacoesPessoais inquilino) {
        try {
            BD.conexao();
            String SQL = "UPDATE Inquilinos SET nome_completo='" + inquilino.getNomeCompleto() 
                       + "', cpf='" + inquilino.getCPF()+ "', rg='" + inquilino.getRG()
                       + "', data_nascimento='" + inquilino.getDataDeNascimento()+ "', telefone='" 
                       + inquilino.getTelefone() + "', email='" + inquilino.getEmail() 
                       + "', profissao='" + inquilino.getProfissao() + "', renda_mensal=" 
                       + inquilino.getRendaMensal() + ", estado_civil='" + inquilino.getEstadoCivil() 
                       + "' WHERE id_inquilino=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar inquilino");
            e.printStackTrace();
        }
    }
    
    // Deletar inquilino
    public void deletarInquilino(int id) {
        try {
            BD.conexao();
            String SQL = "DELETE FROM Inquilinos WHERE id_inquilino=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao deletar inquilino");
            e.printStackTrace();
        }
    }
    
    // Consultar inquilino por ID
    public ResultSet consultarInquilino(int id) {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Inquilinos WHERE id_inquilino=" + id;
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
    
    // Consultar todos inquilinos
    public ResultSet consultarTodosInquilinos() {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Inquilinos";
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
}