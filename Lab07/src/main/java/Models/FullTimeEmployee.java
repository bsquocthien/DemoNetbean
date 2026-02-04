/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class FullTimeEmployee extends Employee {

    public double basicSalary;

    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return this.basicSalary;
    }

    @Override
    public String toString() {
        return "Mã số nhân viên: " + this.id + " - Họ và tên: " + this.name;
    }

}
