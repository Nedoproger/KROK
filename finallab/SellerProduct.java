/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

/**
 *
 * @author msi
 */
public class SellerProduct {
    private int id_seller;
    private int id_product;
    private int price;
    private int quantity;
    public SellerProduct(int id_sel, int id_prod, int price, int quan){
        this.id_seller=id_sel;
        this.id_product=id_prod;
        this.price=price;
        this.quantity=quan;
        
    }
    public SellerProduct(){
    }
    public int getId_seller(){
        return id_seller;
    }
    public void setId_seller(int id){
        this.id_seller=id;
    }
    public int getId_product(){
        return id_product;
    }
    public void setId_product(int id){
        this.id_product=id;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int q){
        this.quantity=q;
    }
     public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        SellerProduct other = (SellerProduct) obj;
        if (this.getPrice()!=other.getPrice())
            return false;
        if (this.getId_product()!=other.getId_product())
            return false;
        if (this.getId_seller()!=other.getId_seller())
            return false;
        if (this.getQuantity()!=other.getQuantity())
            return false;
        return true;
    }
    public String toString(){
        return id_seller+" "+id_product+" "+price+" "+quantity;
    }
}
