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
        a.unique_id = "TV0001";
        a.name = "Nguyễn Văn An";
        a.gender = "Nam";
        a.city = "Hồ Chí Minh";
        a.age = 20;
        
        PerSon b = new PerSon("TV0002","Trần Ngọc Minh",
                                            19,"Bình Dương","Nữ");
        System.out.println(a.getPersonInformation());
        System.out.println(b.getPersonInformation());
        
        Department IT = new Department();
        IT.setDept_ID("IT001");
        IT.setDept_Name("Phòng CNTT 1");
        IT.setDept_Location("42 Nguyễn Văn Tiết");
        System.out.println(IT.getDeptInformation());
        IT.getDept_ID();
        IT.getDept_Name();
        IT.getDept_Location();
        
        Department HR = new Department("HR001","Phòng Nhân Sự",
                "42 Nguyễn Văn Tiết");
        System.out.println(HR.getDeptInformation());
    }
}
