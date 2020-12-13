package oop.lesson3_IsArelationships;

public class Teacher{
    
    private String teacherID;
    private Double salary;
    
    //Constructor
    public Teacher(String fname, String lname, String id, Double sal){
      super(fname, lname);
      this.salary = sal;
      this.teacherID = id;
    }


    public String getTeacherID(){
        return this.teacherID;
    }
    
    public Double getSalary(){
        return this.salary;
    }
    
    public void setSalary(Double new_salary){
        this.salary = new_salary;
    }
      
}

