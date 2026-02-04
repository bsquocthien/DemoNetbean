/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Cau2_lab8 {

    public String ID;
    public String Name;
    public String Phone;
    public String Email;

    public String regex_ID = "^SV[0-9]{3}$";
    public String regex_Name = "^[a-zA-Z ]+$";
    public String regex_Phone = "^0[0-9]{9}$";
    public String regex_Email = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public Cau2_lab8(String ID, String Name, String Phone, String Email) {
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getRegex_ID() {
        return regex_ID;
    }

    public int setRegex_ID(String regex_ID) {
        if (regex_ID.matches(this.regex_ID)) {
            this.regex_ID = regex_ID;
            System.out.println("Đã nhập đúng định dạng yêu cầu");
            return 1;
        }
        System.out.println("Không đúng định dạng yêu cầu");
        return 0;
    }

    public String getRegex_Name() {
        return regex_Name;
    }

    public void setRegex_Name(String regex_Name) {
        this.regex_Name = regex_Name;
    }

    public String getRegex_Phone() {
        return regex_Phone;
    }

    public void setRegex_Phone(String regex_Phone) {
        this.regex_Phone = regex_Phone;
    }

    public String getRegex_Email() {
        return regex_Email;
    }

    public int setRegex_Email(String regex_Email) {
        this.regex_Email = regex_Email;
        if (regex_ID.matches(this.regex_ID)) {
            this.regex_Email = regex_Email;
            System.out.println("Đã nhập đúng định dạng yêu cầu");
            return 1;
        }
        System.out.println("Không đúng định dạng yêu cầu");
        return 0;

    }

    public Cau2_lab8() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
