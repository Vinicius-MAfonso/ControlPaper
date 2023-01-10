package util;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Point;

public class PointsTableModel extends AbstractTableModel{
    String[] columns = {"Data","Hora","Descrição"};
    List<Point> points;
    
    @Override
    public int getRowCount() {
        return points.size();
    }
    @Override
    public String getColumnName(int indice) {
        return columns[indice];
    }
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Point point = this.points.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return point.getFormatedDate();
            case 1:
                return point.getFormatedTime();
            case 2:
                return point.getDescription();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Point point = this.points.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                point.setTime((Time) aValue);
                break;
            case 1:
                point.setDate((Date) aValue);
                break;
            case 2:
                point.setDescription(aValue.toString());
                break;
        }
        
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class;
            case 1 -> String.class;
            case 2 -> String.class;
            default -> String.class;
        };
    }

    public List<Point> getPoints() {
        return points;
    }
    
    public PointsTableModel(List<Point> points){
        this.points = points;
    }
    public PointsTableModel(){
        this.points = new ArrayList<>();
    }
    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
}
