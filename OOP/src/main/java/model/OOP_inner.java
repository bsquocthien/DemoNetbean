/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class OOP_inner {

    public static void main(String[] args) {
        PerSon a = new PerSon("TV0001", "Nguyễn Văn An" , 20, "Hồ Chí Minh", "Nam");
        PerSon b = new PerSon("TV0002", "Trần Ngọc Minh", 19, "Bình Dương" , "Nữ");
        System.out.println(a.getAge());
        a.getName();
        a.setAge(10);
        System.out.println(b.getCity());
    }
}