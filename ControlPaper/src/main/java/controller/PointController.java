package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Point;
import util.ConnectionFactory;

public class PointController {
    public void save(Point point){
        String sql = "INSERT INTO points(idWorker, description, date, time)"
                + "VALUES(?, ?, ?, ?)";
        PreparedStatement statement = null;
        Connection connection = null;
        try{
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql);
           statement.setInt(1, point.getIdWorker());
           statement.setString(2, point.getDescription());
           statement.setDate(3,  new Date(point.getDate().getTime()));
           statement.setTime(4, point.getTime());
           statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao salvar o ponto: "+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public void update(Point point){
        String sql = "UPDATE points"
                + "SET(idWorker = ?,description = ?, date = ?, time = ?)"
                + "WHERE id = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        try{
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql);
           statement.setInt(1, point.getIdWorker());
           statement.setString(2, point.getDescription());
           statement.setDate(3, (Date) point.getDate());
           statement.setTime(4, point.getTime());
           statement.setInt(5, point.getId());
           statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao atualizar o ponto: "+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public void delete(Point point){
        String sql = "DELETE FROM points WHERE id = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        try{
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql);
           statement.setInt(1, point.getId());
           statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao deletar o ponto: "+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public List<Point> getAll(int idWorker){
        String sql = "SELECT * FROM points WHERE idWorker = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        List<Point> points = null;;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idWorker);
            points = new ArrayList<>();
            ResultSet set = statement.executeQuery();
            while(set.next()){
                Point point = new Point();
                point.setId(set.getInt("id"));
                point.setIdWorker(set.getInt("idWorker"));
                point.setDescription(set.getString("description"));
                point.setDate(set.getDate("date"));
                point.setTime(set.getTime("time"));
                points.add(point);
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao buscar: " + sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        return points;
    }
    
    public List<Point> getAll(int idWorker, Date date){
        String sql = "SELECT * FROM points WHERE idWorker = ? AND date = ?";
        PreparedStatement statement = null;
        Connection connection = null;
        List<Point> points = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idWorker);
            statement.setDate(2, date);
            points = new ArrayList<>();
            ResultSet set = statement.executeQuery();
            while(set.next()){
                Point point = new Point();
                point.setId(set.getInt("id"));
                point.setIdWorker(set.getInt("idWorker"));
                point.setDescription(set.getString("description"));
                point.setDate(set.getDate("date"));
                point.setTime(set.getTime("time"));
                points.add(point);
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao buscar: " + sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        return points;
    }
    public List<Point> getAll(int idWorker, Date date, Date dateUntil){
        String sql = "SELECT * FROM points WHERE idWorker = ? AND date BETWEEN ? AND ?";
        PreparedStatement statement = null;
        Connection connection = null;
        List<Point> points = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idWorker);
            statement.setDate(2, date);
            statement.setDate(3, dateUntil);
            points = new ArrayList<>();
            ResultSet set = statement.executeQuery();
            while(set.next()){
                Point point = new Point();
                point.setId(set.getInt("id"));
                point.setIdWorker(set.getInt("idWorker"));
                point.setDescription(set.getString("description"));
                point.setDate(set.getDate("date"));
                point.setTime(set.getTime("time"));
                points.add(point);
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao buscar: " + sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        return points;
    }
}
