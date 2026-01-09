/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class PerSon {

    // KHAI BÁO DANH SÁCH CÁC 
    // THUỘC TÍNH CỦA LỚP PERSON
    /*============================*/
    public String unique_id;
    public String name;
    public int age;
    public String city;
    public String gender;

    /*============================*/
    //KHAI BÁO CONSTRUCTOR KHÔNG CÓ THAM SỐ ĐẦU VÀO
    public PerSon() {

    }

    public PerSon(String unique_id, String name, int age, String city, String gender) {
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public PerSon(String unique_id, String name) {
        this.unique_id = unique_id;
        this.name = name;
    }

    public String getPersonInformation() {
        return this.unique_id + " - " + this.name + " - " + this.gender + " - " + this.city;
    }

    // KHAI BÁO CÁC PHƯƠNG THỨC 
    // CỦA LỚP PERSON
    public void Eat() {
        System.out.println("Eating ...");
    }

    public void Study() {
        System.out.println("Studying ...");
    }

    public void Sleep() {
        System.out.println("Sleeping ...");
    }

    public void Play() {
        System.out.println("Playing ...");
    }
} // END OF PERSON CLASS
