/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

/**
 *
 * @author Dell
 */
public class Electronic extends Product {

    public Electronic(String ID, String Name, double Price) {
        super(ID, Name, Price);
    }

    public Electronic() {
        super();
    }

    public void inFor(){
        System.out.println(this.getID());
        System.out.println(this.getName());
        System.out.println(this.getPrice());
    }
    
    @Override
    public double tinhGia() {
        return this.getPrice() * 1.3 ;
    }
}
