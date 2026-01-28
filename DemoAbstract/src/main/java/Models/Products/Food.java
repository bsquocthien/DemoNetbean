/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Products;

/**
 *
 * @author Dell
 */
public class Food extends Product {
    
    public Food(String Id, String Name, double Price) {
        super(Id, Name, Price);
    }

    public Food() {
        super();
    }

    @Override
    public double tinhGia() {
        this.Price = Price * 1.1;
        System.out.println(this.Price);
        return this.Price;
    }
    
}
