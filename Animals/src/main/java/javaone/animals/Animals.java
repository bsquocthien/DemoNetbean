/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.animals;

import Models.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class Animals {

    public static void main(String[] args) {
        ArrayList<Animal_2chi> listAnimal = new ArrayList<>();

        // 2. Thêm dữ liệu
        listAnimal.add(new Animal_2chi("Dog"));
        listAnimal.add(new Animal_2chi("Cat"));
        listAnimal.add(new Animal_2chi("Elephant"));

        // 3. Sắp xếp theo Name (A → Z)
        Comparator <Animal_2chi> sosanh = new Comparator<Animal_2chi>(){
            @Override
            public int compare(Animal_2chi o1, Animal_2chi o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        Collections.sort(listAnimal, sosanh);

        // 4. In kết quả
        for (Animal_2chi a : listAnimal) {
            System.out.println(a.getName());
        }
    }

    public Animals() {
    }
}
