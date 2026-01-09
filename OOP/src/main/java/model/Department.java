/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class Department {
    String dept_ID;
    String Dept_Name;
    String Dept_Location;

    public Department() {
    }

    public Department(String dept_ID, String Dept_Name, String Dept_Location) {
        this.dept_ID = dept_ID;
        this.Dept_Name = Dept_Name;
        this.Dept_Location = Dept_Location;
    }

    public String getDept_ID() {
        return dept_ID;
    }

    public void setDept_ID(String dept_ID) {
        this.dept_ID = dept_ID;
    }

    public String getDept_Name() {
        return Dept_Name;
    }

    public void setDept_Name(String Dept_Name) {
        this.Dept_Name = Dept_Name;
    }

    public String getDept_Location() {
        return Dept_Location;
    }

    public void setDept_Location(String Dept_Location) {
        this.Dept_Location = Dept_Location;
    }
    
    public String getDeptInformation(){
        return this.dept_ID + " - " + this.Dept_Name + " - " + this.Dept_Location;
    }    
}
