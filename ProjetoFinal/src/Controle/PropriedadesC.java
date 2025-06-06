package Controle;

import Modelo.PropriedadesM;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;

public class PropriedadesC {
    private Database BD = new Database();
    public ResultSet dadosConsulta;
    
    // Inserir nova propriedade
    public void inserirPropriedade(PropriedadesM propriedade) {
        try {
            BD.conexao();
            String SQL = "INSERT INTO Propriedades (id_dono, endereco, tipo_imovel, valor_aluguel, "
                       + "area, quartos, banheiros, vagas_garagem) VALUES (" 
                       + propriedade.getIdDono() + ",'" + propriedade.getEndereco() + "','" 
                       + propriedade.getTipoImovel() + "'," + propriedade.getValorAluguel() + "," 
                       + propriedade.getArea() + "," + propriedade.getQuartos() + "," 
                       + propriedade.getBanheiros() + "," + propriedade.getVagasGaragem() + ")";
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao inserir propriedade");
            e.printStackTrace();
        }
    }
    
    // Atualizar propriedade
    public void atualizarPropriedade(int id, PropriedadesM propriedade) {
        try {
            BD.conexao();
            String SQL = "UPDATE Propriedades SET id_dono=" + propriedade.getIdDono() 
                       + ", endereco='" + propriedade.getEndereco() + "', tipo_imovel='" 
                       + propriedade.getTipoImovel() + "', valor_aluguel=" + propriedade.getValorAluguel() 
                       + ", area=" + propriedade.getArea() + ", quartos=" + propriedade.getQuartos() 
                       + ", banheiros=" + propriedade.getBanheiros() + ", vagas_garagem=" 
                       + propriedade.getVagasGaragem() + ", disponivel=" + propriedade.isDisponivel() 
                       + " WHERE id_propriedade=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao atualizar propriedade");
            e.printStackTrace();
        }
    }
    
    // Deletar propriedade
    public void deletarPropriedade(int id) {
        try {
            BD.conexao();
            String SQL = "DELETE FROM Propriedades WHERE id_propriedade=" + id;
            BD.getStatement().execute(SQL);
            BD.desconectar();
        } catch(Exception e) {
            System.out.println("Erro ao deletar propriedade");
            e.printStackTrace();
        }
    }
    
    // Consultar propriedade por ID
    public ResultSet consultarPropriedade(int id) {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Propriedades WHERE id_propriedade=" + id;
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
    
    // Consultar todas propriedades
    public ResultSet consultarTodasPropriedades() {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Propriedades";
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
    
    // Consultar propriedades por dono
    public ResultSet consultarPropriedadesPorDono(int idDono) {
        try {
            BD.conexao();
            String SQL = "SELECT * FROM Propriedades WHERE id_dono=" + idDono;
            dadosConsulta = BD.getStatement().executeQuery(SQL);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return dadosConsulta;
    }
}