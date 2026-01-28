/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Products;

/**
 *
 * @author Dell
 */
public abstract class Product {
    public String Id;
    public String Name;
    public double Price;

    public abstract double tinhGia();
    
    public Product(String Id, String Name, double Price) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price * 2;
    }

    public Product() {
        Price = Price * 2;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
}
