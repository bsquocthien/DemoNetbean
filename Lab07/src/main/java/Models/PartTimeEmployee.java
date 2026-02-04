/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class PartTimeEmployee extends Employee {
    public int workHours; 
    public double salaryPerHour;

    public PartTimeEmployee(String id, String name,int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    public PartTimeEmployee(int workHours, double salaryPerHour) {
        super();// Mặc định gọi
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }
    
    

    @Override
    public double getSalary() {
        return this.workHours * this.salaryPerHour;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + this.id 
                + " - Họ và Tên: " + this.name;
    }
    
}
