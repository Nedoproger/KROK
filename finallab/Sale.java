/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

import java.time.LocalDate;

/**
 *
 * @author msi
 */
public class Sale {
    private int id_sale;
    private int id_seller;
    private int id_product;
    private int quantity;
    private LocalDate date;
    public Sale(int id_sale, int id_seller, int id_product,int quantity, LocalDate date){
        this.id_sale=id_sale;
        this.id_seller=id_seller;
        this.id_product=id_product;
        this.quantity=quantity;
        this.date=date;
    }
   public Sale(){
   }
   public int getId_sale(){
       return this.id_sale;
   }
   public void setId_sale(int id){
       this.id_sale=id;
   }
   public int getId_seller(){
       return this.id_seller;
   }
   public void setId_seller(int id){
       this.id_seller=id;
   }
   public int getId_product(){
       return this.id_product;
   }
   public void setId_product(int id){
       this.id_product=id;
   }
   public int getQuantity(){
       return quantity;
   }
   public void setQuantity(int q){
       this.quantity=q;
   }
   public LocalDate getDate(){
       return this.date;
   }
   public void setDate(LocalDate date){
       this.date=date;
   }
   public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Sale other = (Sale) obj;
        if (this.quantity!=other.getQuantity())
            return false;
        if (this.getId_sale()!=other.getId_sale())
            return false;
        if (this.getId_seller()!=other.getId_seller())
            return false;
        if (this.getId_product()!=other.getId_product())
            return false;
        if (!this.getDate().equals(other.getDate()))
            return false;
        return true;
    }
   public String toString(){
       return String.format("Sale id: %d%nSeller id: %d%nProduct id: %d%nQuantity of sold: %d%nDate: %s%n", this.id_sale, this.id_seller, this.id_product, this.quantity, this.date);
   }
}
