package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    public static final String URL = "jdbc:mysql://localhost:3306/controlpaper";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String USER = "root";
    public static final String PASS  = "";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("");
            throw new RuntimeException("Erro na conexão com o banco de dados",ex);
        }
    }
    public static void closeConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao fechar a conexão: "+sqle);
        }
    }
    public static void closeConnection(Connection connection, Statement statement){
        try{
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao fechar a conexão: "+ sqle);
        }
    }
    
}
