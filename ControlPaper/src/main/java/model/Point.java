package model;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Point{
    private int id;
    private int idWorker;
    private String description;
    private Date date;
    private Time time;
    
    public Point(){}
    public Point(Calendar c){
        date = new Date(c.getTime().getTime());
        time = new Time(c.getTime().getTime());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    public String getFormatedTime(){
        DateFormat dfHour = DateFormat.getTimeInstance();
        return dfHour.format(time);
    }
    
    public String getFormatedDate(){
       DateFormat dfDate = DateFormat.getDateInstance(DateFormat.LONG);
       return dfDate.format(date);
    }
    
    @Override
    public String toString(){
        DateFormat dfDate = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat dfHour = DateFormat.getTimeInstance();
        return String.format("%s %s",dfDate.format(date),dfHour.format(time));
    }
}
