/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rf5974
 */
//DAO: Data Access OBject

public class Database {
     // Objeto de COnexão com BD
    public Connection conn;
    // Objeto de Consulta SQL
    public Statement stmt;
    // Objeto com dados SQL
    private ResultSet res;
    private static Database instance;
    
    public void conexao(){                        
       try
       {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:1234/ProjetoFinal","postgres", "1234");
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execu��o");
           e.printStackTrace();
       }
    }
    
    // Método Singleton para obter a instância
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
     public Connection getConnection(){
        return conn;
    }
    
    public Statement getStatement(){
        return stmt;
    }
    
    public void desconectar(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException erro){
                erro.printStackTrace();
            }
            
        }
    }
}