package com.company;

public class SellerProduct {
    private int id_seller;
    private int id_product;
    private int price;
    private int quantity;

    /**
     * Конструктор с параметрами
     * @param id_sel номер продавца
     * @param id_prod номер продукта
     * @param price цена
     * @param quan количество товаров в наличии
     */
    public SellerProduct(int id_sel, int id_prod, int price, int quan){
        this.id_seller=id_sel;
        this.id_product=id_prod;
        this.price=price;
        this.quantity=quan;

    }

    /**
     * Конструктор по умолчанию
     */
    public SellerProduct(){
    }

    /**
     * Метод для получения номера продавца
     * @return номер продавца
     */
    public int getId_seller(){
        return id_seller;
    }

    /**
     * Метод для установки номера продавца
     * @param id номер продавца
     */
    public void setId_seller(int id){
        this.id_seller=id;
    }

    /**
     * Получения номера продукта
     * @return номер продукта
     */
    public int getId_product(){
        return id_product;
    }

    /**
     * Метод для установки номера продукта
     * @param id номер продукта
     */
    public void setId_product(int id){
        this.id_product=id;
    }

    /**
     *Метод для получения цены
     * @return цена продукта
     */
    public int getPrice(){
        return price;
    }

    /**
     *Метод для установки цены
     * @param price цена продукта
     */
    public void setPrice(int price){
        this.price=price;
    }

    /**
     *Метод для получения количества
     * @return количество
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     *Метод для установки количества
     * @param q количество
     */
    public void setQuantity(int q){
        this.quantity=q;
    }
    @Override
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
    @Override
    public String toString(){
        return id_seller+" "+id_product+" "+price+" "+quantity;
    }
}
