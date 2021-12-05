package com.company;

/**
 *
 * Класс, описывающий товары.
 */
public class Product {
    private int id;
    private String name;

    /**
     * Конструктор с параметрами
     * @param id - номер продукта
     * @param name - имя продукта
     */
    public Product(int id, String name){
        this.id=id;
        this.name=name;
    }

    /**
     * Конструткор по умолчанию
     */
    public Product(){
        this.id=0;
        this.name="None";
    }

    /**
     * Метод для получения id
     * @return возвращает номер продукта
     */
    public int getID(){
        return this.id;
    }

    /**
     * Метод для установки id
     * @param id - номер продукта
     */
    public void setID(int id){
        this.id=id;
    }

    /**
     * Метод для получения имя
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Метод для установки id
     * @param name
     */
    public void setName(String name){
        this.name=name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (!this.getName().equals(other.getName()))
            return false;
        if (this.getID()!=other.getID())
            return false;
        return true;
    }
    @Override
    public String toString(){
        return this.getID()+" "+this.getName();
    }

}
