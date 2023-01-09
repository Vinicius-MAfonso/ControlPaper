package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Worker;
import util.ConnectionFactory;

public class WorkerController {
    public void save(Worker worker){
        String sql = "INSERT INTO workers(name, role, shift)"
                + "VALUES(?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, worker.getName());
            statement.setString(2, worker.getRole());
            statement.setString(3, worker.getShift());
            statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao salvar: "+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public void update(Worker worker){
        String sql = "UPDATE workers"
                + "SET(name = ?, role = ?, shift = ?)"
                + "WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareCall(sql);
            statement.setString(1, worker.getName());
            statement.setString(2, worker.getRole());
            statement.setString(3, worker.getShift());
            statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao atualizar: " + sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public void delete(Worker worker){
        String sql = "DELETE FROM workers WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, worker.getId());
            statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao deletar: "+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public List<Worker> getAll(){
        String sql = "SELECT * FROM workers";
        PreparedStatement statement = null;
        Connection connection = null;
        List<Worker> workers = null;;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareCall(sql);
            workers = new ArrayList<>();
            ResultSet set = statement.executeQuery();
            while(set.next()){
                Worker worker = new Worker();
                worker.setId(set.getInt("id"));
                worker.setName(set.getString("name"));
                worker.setRole(set.getString("role"));
                worker.setShift(set.getString("shift"));
                workers.add(worker);
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao buscar: " + sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        return workers;
    }
}
