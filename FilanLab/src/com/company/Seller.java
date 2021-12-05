package com.company;

/**
 *
 * Класс, описывающий продавцов
 */
public class Seller {
    private int id;
    private String name;
    private String surname;

    /**
     * Конструктор продавца
     * @param id номер продавца
     * @param surname - фамилия продавца
     * @param name - имя продаца
     */
    public Seller(int id, String surname, String name){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    /**
     * Конструктор по умолчанию
     */
    public Seller(){
        this.id=0;
        this.name="None";
        this.surname="None";
    }

    /**
     * Метод для получения номера продавца
     * @return номер продавца
     */
    public int getID(){
        return this.id;
    }

    /**
     * Метод для установки номера продавца
     * @param id номер продавца
     */
    public void setID(int id){
        this.id=id;
    }

    /**
     * Метод для возвращения имени продавца
     * @return имя продавца
     */
    public String getName(){
        return this.name;
    }

    /**
     * Метод для установки имени продавца
     * @param name имя продавца
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Метод для получения фамилии продавца
     * @return фамилия продавца
     */
    public String getSurname(){
        return this.surname;
    }

    /**
     * Метод для установки фамилии продавца
     * @param surname фамилия продавца
     */
    public void setSurname(String surname){
        this.surname=surname;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Seller other = (Seller) obj;
        if (!this.getName().equals(other.getName()))
            return false;
        if (this.getID()!=other.getID())
            return false;
        if (!this.getSurname().equals(other.getSurname()))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return this.getID()+" "+this.getName()+" "+this.getSurname();
    }
}
