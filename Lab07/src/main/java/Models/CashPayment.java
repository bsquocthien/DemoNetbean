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
public class CashPayment implements Payment {

    public double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    public CashPayment() {
        this.amount = 0.0;
    }

    @Override
    public double pay(double amount) {
        System.out.printf("\nTrả bằng tiền mặt không giảm giá."
                + " Số tiền phải trả là: ");
        System.out.println(amount + amount * TAX);
        return amount + amount * TAX;
    }

    public double pay() {
        System.out.printf("\nTrả bằng tiền mặt không giảm giá."
                + " Số tiền phải trả là: ");
        System.out.println(amount + amount * TAX);
        return amount + amount * TAX;
    }

}
