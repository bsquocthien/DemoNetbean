/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Interfaces.Payment;

/**
 *
 * @author Dell
 */
public class Worker extends Employee implements Payment {

    public double amount;

    public Worker(String id, String name, double amount) {
        super(id, name);
        this.amount = amount;
    }

    public Worker(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Worker(String id, String name) {
        super(id, name);
    }

    public Worker() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + this.getId()
                + " - Họ và Tên: " + this.getName();
    }

    @Override
    public double pay(double amount) {
        return this.getSalary();
    }
}
