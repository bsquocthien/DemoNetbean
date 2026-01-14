/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.oop;

import model.Department;
import model.PerSon;

/**
 *
 * @author Dell
 */
public class OOP {

    public static void main(String[] args) {
        PerSon a = new PerSon();
        System.out.println(a.getAge());
        System.out.println(a.getName());
        a.setName("Nguyễn Văn An");
        a.setAge(10);
        System.out.println(a.getAge());
        System.out.println(a.getName());
    }
}
