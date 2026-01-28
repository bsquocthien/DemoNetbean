/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Products;

/**
 *
 * @author Dell
 */
public class Electronic extends Product {

    public Electronic(String Id, String Name, double Price) {
        super(Id, Name, Price);
    }

    public Electronic() {
    }

    @Override
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void infor() {
        System.out.println(this.Id + " - " + this.Name + " - " + this.Price);
    }

    @Override
    public double tinhGia() {
        this.Price = this.Price * 1.3;
        System.out.println(this.Price);
        return this.Price;
    }

}
