package Controle;

import Modelo.ContratoM;
import controle.Database;
import java.sql.ResultSet;

public class ContratosC {
    private Database BD = new Database();
    public ResultSet dadosConsulta;

    // Inserir novo contrato
   public void inserirContrato(ContratoM contrato) {
        try {
            BD.conexao();
            String SQL = "INSERT INTO Contratos (data_inicio, data_fim, valor, id_inquilino, id_propriedade, dia_vencimento) VALUES ('"
                       + contrato.getDataInicio() + "','" + contrato.getDataFim() + "'," 
                       + contrato.getValor() + "," + contrato.getIdInquilino() + "," 
                       + contrato.getIdPropriedade() + "," + contrato.getDiaVencimento() + ")";
            
            System.out.println("Executando SQL: " + SQL); // Para debug
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao inserir contrato");
            e.printStackTrace();
        }
    }

    // Atualizar contrato
    public void atualizarContrato(int id, ContratoM contrato) {
        try {
            BD.conexao();
            String SQL = "UPDATE Contratos SET data_inicio='" + contrato.getDataInicio()
                       + "', data_fim='" + contrato.getDataFim()
                       + "', valor=" + contrato.getValor()
                       + ", id_inquilino=" + contrato.getIdInquilino()
                       + ", id_propriedade=" + contrato.getIdPropriedade()
                       + ", dia_vencimento=" + contrato.getDiaVencimento()
                       + " WHERE id_contrato=" + id;
            
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar contrato");
            e.printStackTrace();
        }
    }

    // Deletar contrato
    public void deletarContrato(int id) {
        try {
            BD.conexao();
            String SQL = "DELETE FROM Contratos WHERE id_contrato=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao deletar contrato");
            e.printStackTrace();
        }
    }

    // Consultar contrato por ID
    public ResultSet consultarContrato(int id) {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Contratos WHERE id_contrato=" + id;
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }

    // Consultar todos contratos
    public ResultSet consultarTodosContratos() {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Contratos";
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
}