/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Views;

import Services.*;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class View {
    public static Scanner scan = new Scanner(System.in);
    public static Service service = new Service();
    public static void main(String[] args) {
        service = new Service();
        while(true){
            System.out.println("Vui lòng nhập giá trị cần làm"
                    + "; ");
            int option = 0;
            option = Integer.parseInt(scan.nextLine());
            switch(option)
            {
                case 1 -> {
                    service.Nhap(scan);
                    service.Xuat();
                }
                case 2 -> service.Xuat();
                case 3 -> System.out.println("Tìm kiếm");
                case 4 -> System.out.println("Thoát.");                    
            }
        }
    }
}
