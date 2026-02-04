/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Cau1_lab8 {

    public String HoTen;

    public Cau1_lab8(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void print() {
        System.out.println("-" + this.HoTen + "-");
    }

    public void printNoblank() {
        System.out.println("-" + this.HoTen.trim() + "-");
    }

    public int countLetter() {
        int count = this.HoTen.trim().length();
        System.out.println("Số lượng ký tự trong họ tên: " + this.HoTen + count + " ký tự");
        return count;
    }
}
