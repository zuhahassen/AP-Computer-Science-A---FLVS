/**
 * Purpose: Use sorting algorithms to sort through an entry of products
 *
 * @author Zuha Hassen
 * @version 05/24/2022
 */

public class Product
{
    private String name;
    private double price;
    private int number, quantity;
    
    public Product(String name, int number, double price, int quantity){
        this.name = name;
        this.price = price;
        this.number = number;
        this.quantity = quantity;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public void setNum(int n){
        number = n;
    }
    
    public void setQuantity(int q){
        quantity = q;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getNum(){
        return number;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public String toString(){
        return String.format("%-15s%10s%14s%12s", name, number, "$" + price, quantity);
    }
}
