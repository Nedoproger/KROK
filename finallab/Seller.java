/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallab;

/**
 *
 * Класс, описывающий продавцов
 */
public class Seller {
    private int id;
    private String name;
    private String surname;
    public Seller(int id, String surname, String name){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }
    public Seller(){
        this.id=0;
        this.name="None";
        this.surname="None";
    }
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String genSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
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
        if (!this.genSurname().equals(other.genSurname()))
            return false;
        return true;
    }
    public String toString(){
        return this.getID()+" "+this.getName()+" "+this.genSurname();
    }
}
