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

        // Corrigir data (esperado: yyyy-MM-dd)
        String data = inquilino.getDataDeNascimento();
        String dataFormatada = null;

        if (data != null && !data.isEmpty()) {
            data = data.replaceAll("[^0-9]", ""); // remove caracteres não numéricos
            if (data.length() == 8) { // Ex: 01012000
                dataFormatada = data.substring(4, 8) + "-" + data.substring(2, 4) + "-" + data.substring(0, 2);
            } else {
                dataFormatada = "2000-01-01"; // fallback padrão
            }
        } else {
            dataFormatada = "2000-01-01"; // se em branco
        }

        // Protege valores null ou campos vazios
        String nome = inquilino.getNomeCompleto() == null ? "" : inquilino.getNomeCompleto().replace("'", "''");
        String cpf = inquilino.getCPF() == null ? "" : inquilino.getCPF();
        String rg = inquilino.getRG() == null ? "" : inquilino.getRG();
        String telefone = inquilino.getTelefone() == null ? "" : inquilino.getTelefone();
        String email = inquilino.getEmail() == null ? "" : inquilino.getEmail().replace("'", "''");
        String profissao = inquilino.getProfissao() == null ? "" : inquilino.getProfissao().replace("'", "''");
        String estadoCivil = inquilino.getEstadoCivil() == null ? "" : inquilino.getEstadoCivil();
        float renda = inquilino.getRendaMensal();

        // Monta SQL
        String SQL = "INSERT INTO Inquilinos (nome_completo, cpf, rg, data_nascimento, telefone, email, profissao, renda_mensal, estado_civil) VALUES ('"
                   + nome + "','" + cpf + "','" + rg + "','" + dataFormatada + "','" + telefone + "','"
                   + email + "','" + profissao + "'," + renda + ",'" + estadoCivil + "')";

        // Debug: imprime a query no console
        System.out.println("SQL gerado:\n" + SQL);

        // Executa e desconecta
        BD.getStatement().execute(SQL);
        BD.desconectar();

    } catch (Exception e) {
        System.out.println("Erro ao inserir inquilino:");
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