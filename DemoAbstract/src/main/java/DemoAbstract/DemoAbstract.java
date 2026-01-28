/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DemoAbstract;

import Models.Animals.Khi;
import Models.Animals.Ga;
import Models.Products.Electronic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class DemoAbstract {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Cho cho = new Cho(); 
        // Không the new Cho(); vì đây là lớp trừu tượng.
        Ga ga = new Ga();
        ga.Keu();
        ga.Chay();
        Khi khi = new Khi();
        khi.Keu();
        khi.Chay();

        Electronic e1 = new Electronic("E001", "Mobiles 1", 6000000);
        Electronic e2 = new Electronic("E003", "Mobiles 3", 8800000);
        Electronic e3 = new Electronic("E002", "Mobiles 2", 5000000);
        ArrayList<Electronic> list = new ArrayList<>();

        list.add(e3);
        list.add(e2);
        list.add(e1);
        System.out.println("Before");
        for (Electronic e : list) {
            e.infor();
        }

        Comparator<Electronic> sosanh
                = new Comparator<Electronic>() {
            @Override
            public int compare(Electronic o1, Electronic o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };

        Collections.sort(list, sosanh);
        //Collections.reverse(list);
        System.out.println("After");
        for (Electronic e : list) {
            e.infor();
        }
    }
}
