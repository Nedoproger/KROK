
package finallab;


/**
 *
 * Класс, описывающий товары.
 */
public class Product {
    private int id;
    private String name;
    public Product(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Product(){
        this.id=0;
        this.name="None";
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
    public String toString(){
        return this.getID()+" "+this.getName();
    }
    
}
