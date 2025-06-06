/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import Modelo.LoginM;
import controle.Database;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class LoginC {
 private Database BD=new Database();
 public ResultSet dadosConsulta;  
 
public void CadastrarADM(LoginM loginM){  
  try{
    BD.conexao();
    String SQL="insert into ADM(login,senha)values ('" + loginM.getLogin() + "','" +loginM.getSenha()+"');";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }
  }

public void CadastrarUsuario(LoginM loginM){  
  try{
    BD.conexao();
    String SQL="insert into usuario(login,senha)values ('" + loginM.getLogin() + "','" +loginM.getSenha()+"');";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }
  }
 
public void atualizarusuarioNome(String login,String Nlogin){
try{
    BD.conexao();
    String SQL="update usuario set login = '"+Nlogin+"' where login='"+login+"'";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }

}
public void atualizarADMNome(String login,String Nlogin){
try{
    BD.conexao();
    String SQL="update ADM set login = '"+Nlogin+"' where login='"+login+"'";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }

}
public void atualizarADMsenha(String login,String Nsenha){
try{
    BD.conexao();
    String SQL="update ADM set senha = '"+Nsenha+"' where login='"+login+"'";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }

}
public void atualizarusuariosenha(String login,String Nsenha){
try{
    BD.conexao();
    String SQL="update usuario set senha = '"+Nsenha+"' where login='"+login+"'";
    BD.getStatement().execute(SQL);
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }

}

public void deletarUsuario(String login){
try{
    BD.conexao();
    String SQL="DELETE FROM usuario WHERE login = '"+login+"';";
    BD.getStatement().execute(SQL);
    System.out.println("Usuario deletado");
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }
}

public void deletarADM(String login){
try{
    BD.conexao();
    String SQL="DELETE FROM ADM WHERE login = '"+login+"';";
    BD.getStatement().execute(SQL);
    System.out.println("ADM deletado");
    BD.desconectar();
    
  }catch(Exception tipoExcessao){
      System.out.println("ERRO");
     tipoExcessao.printStackTrace();
  }
}

public ResultSet consultaUsuario(String login){
try{
    BD.conexao();
    String SQL="select *from usuario where login='"+login+"'";
    dadosConsulta=BD.getStatement().executeQuery(SQL);
    BD.desconectar();
    
  }catch(Exception erro){
     erro.printStackTrace();
  }
return dadosConsulta;
}

public ResultSet consultaADM(String login){
try{
    BD.conexao();
    String SQL="select *from ADM where login='"+login+"'";
    dadosConsulta=BD.getStatement().executeQuery(SQL);
    BD.desconectar();
    
  }catch(Exception erro){
     erro.printStackTrace();
  }
return dadosConsulta;
}
public ResultSet consultaTodosUsuarios() {
    try {
        BD.conexao();
        String SQL = "select * from usuario";
        dadosConsulta = BD.getStatement().executeQuery(SQL);
    } catch (Exception erro) {
        erro.printStackTrace();
    }
    return dadosConsulta;
}

public ResultSet consultaTodosADMs() {
    try {
        BD.conexao();
        String SQL = "select * from ADM";
        dadosConsulta = BD.getStatement().executeQuery(SQL);
    } catch (Exception erro) {
        erro.printStackTrace();
    }
    return dadosConsulta;
}
}
