/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Service {

    public ArrayList<Book> ds_book = new ArrayList<>();

    public Service(ArrayList<Book> ds_book) {
        this.ds_book = ds_book;
    }

    public Service() {
    }

    public ArrayList<Book> getDs_book() {
        return ds_book;
    }

    public void setDs_book(ArrayList<Book> ds_book) {
        this.ds_book = ds_book;
    }

    public void Nhap(Scanner scan) {
        Book book = new Book();
        System.out.println("Nhập ID: ");
        book.setID(scan.nextLine());
        System.out.println("Nhập Name: ");
        book.setName(scan.nextLine());
        System.out.println("Nhập Author: ");
        book.setAuthor(scan.nextLine());
        System.out.println("Nhập Year: ");
        book.setYear(Integer.parseInt(scan.nextLine()));
        this.ds_book.add(book); // âdd thông tin đó vào array list.

    }

    ;
    public void Xuat() {
        for (Book b : this.ds_book) {
            System.out.println("ID: " + b.getID());
            System.out.println("Name: " + b.getName());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("Year: " + b.getYear());
        }
    }

    ;
    public void TimKiem(Scanner scan) {
        System.out.println("Nhập ID sách cần tìm: ");
        String findID = scan.nextLine();
        boolean found = false;

        for (Book b : this.ds_book) {
            if (b.getID().equalsIgnoreCase(findID)) {
                System.out.println("~~~ Kết quả tìm thấy ~~~");
                System.out.println("ID: " + b.getID() + " | Tên: " + b.getName() + " | Năm: " + b.getYear() + " | Tác giả: " + b.getAuthor());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách có ID: " + findID);
        }
    }

    ;
    public void Xoa(Scanner scan) {
        System.out.println("Nhập ID sách cần xóa: ");
        String findID = scan.nextLine();
        boolean found = false;

        for (int i = 0; i < ds_book.size(); i++) {
            if (ds_book.get(i).getID().equalsIgnoreCase(findID)) {
                System.out.println("~~~ Kết quả tìm thấy ~~~");
                System.out.println("ID: " + ds_book.get(i).getID() + "| Tên: " + ds_book.get(i).getName() + "| Năm: " + ds_book.get(i).getYear() + "| Tác giả: " + ds_book.get(i).getAuthor());
                ds_book.remove(i);
                System.out.println("Xóa thành công sách có ID: " + findID);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách để xóa.");
        }
    }

    public void Update(Scanner scan) {
        System.out.println("Nhập ID sách cần sửa: ");
        String findID = scan.nextLine();
        boolean found = false;

        for (Book b : ds_book) {
            if (b.getID().equalsIgnoreCase(findID)) {
                System.out.println("~~~ Đã tìm thấy sách ~~~");
                System.out.println("Tên hiện tại: " + b.getName());
                System.out.println("Tác giả hiện tại: " + b.getAuthor());
                System.out.println("\n Nhập tên mới: ");
                String newName = scan.nextLine();
                b.setName(newName);
                System.out.println("Nhập tác giả mới: ");
                String newAuthor = scan.nextLine();
                b.setAuthor(newAuthor);
                System.out.println("Cập nhật thành công!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách có ID: " + findID);
        }
    }
}
