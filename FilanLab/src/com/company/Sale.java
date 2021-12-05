package com.company;

import java.util.Date;

public class Sale {
    private int id_sale;
    private int id_seller;
    private int id_product;
    private int quantity;
    private Date date;

    /**
     * Конструктор с параметрами
     * @param id_sale номер продажи
     * @param id_seller номер продавца
     * @param id_product номер продукта
     * @param quantity количество проданного товара
     * @param date дата продажи
     */
    public Sale(int id_sale, int id_seller, int id_product,int quantity, Date date) {
        this.id_sale=id_sale;
        this.id_seller=id_seller;
        this.id_product=id_product;
        this.quantity=quantity;
        this.date=date;
    }

    /**
     * Конструктор по умолчанию
     */
    public Sale(){
    }

    /**
     *Метод для получения номера продажи
     * @return номер продажи
     */
    public int getId_sale(){
        return this.id_sale;
    }

    /**
     *Метод для установки номера продажи
     * @param id номер продажи
     */
    public void setId_sale(int id){
        this.id_sale=id;
    }

    /**
     *Метод для получения номера продавца
     * @return
     */
    public int getId_seller(){
        return this.id_seller;
    }

    /**
     *Методя для установки номера продавца
     * @param id
     */
    public void setId_seller(int id){
        this.id_seller=id;
    }

    /**
     *Метод для получения номера продукта
     * @return
     */
    public int getId_product(){
        return this.id_product;
    }

    /**
     * Метод для установки номера продукта
     * @param id
     */
    public void setId_product(int id){
        this.id_product=id;
    }

    /**
     * Метод для получения количества проданного товара
     * @return
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * Метод для установки проданных товаров
     * @param q
     */
    public void setQuantity(int q){
        this.quantity=q;
    }

    /**
     *Метод для получения даты продажи
     * @return
     */
    public Date getDate(){
        return this.date;
    }

    /**
     *Метод для установки даты продажи
     * @param date
     */
    public void setDate(Date date){
        this.date=date;
    }
    @Override
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
    @Override
    public String toString(){
        return String.format("Sale id: %d%nSeller id: %d%nProduct id: %d%nQuantity of sold: %d%nDate: %s%n", this.id_sale, this.id_seller, this.id_product, this.quantity, this.date);
    }
}
