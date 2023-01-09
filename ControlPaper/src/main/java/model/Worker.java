package model;

public class Worker {
    private int id;
    private String name;
    private String role;
    private String shift;

    public Worker() {
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;     
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
