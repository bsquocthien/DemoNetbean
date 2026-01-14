/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class classOngCo extends Object{
    public String CCCD;
    public String hoTen;
    public String namSinh;

    public classOngCo() {
        System.out.println("Constructor ông Cố");
    }

    public classOngCo(String CCCD, String hoTen, String namSinh) {
        this.CCCD = CCCD;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    
    
}
