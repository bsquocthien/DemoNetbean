/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.lab07;

import Models.*;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Lab07 {

    public static void main(String[] args) {
        System.out.println("ARRAYLIST LỚP EMPLOYEE");
        ArrayList<Employee> list = new ArrayList();
        FullTimeEmployee fulltime1 = new FullTimeEmployee("FT001", "Nguyễn An Nam", 10000000);
        FullTimeEmployee fulltime2 = new FullTimeEmployee("FT002", "Minh Tú", 20000000);
        PartTimeEmployee parttime1 = new PartTimeEmployee("PT001", "Ngô Bảo Khoa", 20, 50000);
        PartTimeEmployee parttime2 = new PartTimeEmployee("PT002", "Gia Phúc", 20, 90000);
        list.add(fulltime1);
        list.add(fulltime2);
        list.add(parttime1);
        list.add(parttime2);
        for (Employee e : list) {
            System.out.println(e.toString());
            System.out.printf("Lương: %f \n", e.getSalary());
        }

        System.out.println("ARRAYLIST INTERFACE Payment");
        ArrayList<CashPayment> list_pm = new ArrayList<>();
        CashPayment c1 = new CashPayment(3000);
        CashPayment c2 = new CashPayment(5500.44);
        CashPayment c3 = new CashPayment(7400);
        CashPayment c4 = new CashPayment(8700);
        CashPayment c5 = new CashPayment(9000);

        list_pm.add(c1);
        list_pm.add(c2);
        list_pm.add(c3);
        list_pm.add(c4);
        list_pm.add(c5);
        double amount = 2000.00;
        for(CashPayment cp : list_pm)
        {
            amount = amount + 1000;
            cp.pay(amount);
            cp.pay();
        }
        
        Worker wk = new Worker("WK001","Worker 001",50000000);
        System.out.println(wk.toString());
        System.out.println(wk.getSalary());
        
        
    }
}
