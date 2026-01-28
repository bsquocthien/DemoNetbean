/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

/**
 *
 * @author Dell
 */
public class Food extends Product {

    public Food(String ID, String Name, double Price) {
        super(ID, Name, Price);
    }

    public Food() {
        super();
    }

    
    @Override
    public double tinhGia() {
        return this.getPrice() * 1.1 ;
    }    
}
