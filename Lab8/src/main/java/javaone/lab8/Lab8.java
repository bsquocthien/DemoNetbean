/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.lab8;

import Models.Cau1_lab8;
import Models.Cau2_lab8;
import Models.Cau3_lab8;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab8 {

    public static void main(String[] args) throws Exception {
        Cau3_lab8 cau3 = new Cau3_lab8();
        Scanner in = new Scanner(System.in);
        int tuoi = -1;
        do {
            System.out.println("Vui lòng nhập tuổi: ");
            try {
                tuoi = Integer.parseInt(in.nextLine());
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Lỗi nhập sai định dạng số: "
                        + e.getMessage());
                continue;
            } finally {
                if (tuoi < 0) {
                    throw new Exception("Tuổi âm");
                }
                cau3.tuoi = tuoi;
                System.out.println("Hoàn thành.");
            }
            break;
        } while (true);

        System.out.println("Tuổi đúng định dạng: " + cau3.tuoi);
        /*
        Cau1_lab8 cau1 = new Cau1_lab8("   Nguyễn Văn An   ");
        cau1.print();
        cau1.printNoblank();
        cau1.countLetter();
        Cau2_lab8 cau2 = new Cau2_lab8();
        //String regex_ID = cau2.regex_ID;     
        String regex_Email = cau2.regex_Email;     
        String ID;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Vui lòng nhập Email: ");
            ID = in.nextLine();
            if(ID.matches(regex_Email))
            {
                cau2.setEmail(ID);
                break;
            }
        }while(true);
         */
    }

}
