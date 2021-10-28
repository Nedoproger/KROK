/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

/**
 *Класс, описывающий тип песни.
 * 
 */
public class Song {
    private String group;
    private String song;
    /**
     * Конструктор с 2мя параметрами типа String
     * @param gr - группа, исполняющая песню
     * @param song  - название песни
     */
    public Song(String gr, String song ){
        this.group=gr;
        this.song=song;
    }
    /**
     * 
     * @return возвращает название группы/имя исполнителя типа String.
     */
    public String getGroup(){
        return this.group;
    }
    /**
     * 
     * @return  возвращает название песни типа String
     */
    public String getSong(){
        return this.song;
    }
    /**
     * Метод, устанавливающий название группы/имя исполнителя
     * @param gr название группы. Тип String.
     */
    public void setGroup(String gr){
        this.group=gr;
        
    }
    /**
     * Метод, устанавливающий название песни
     * @param s  название песни. Тип String.
     */
    public void setSong(String s){
        this.song=s;
    }
    public String toString(){
        return this.group+" - "+this.song;
    }
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Song other=(Song) obj;
        if (!this.getGroup().equals(other.getGroup())){
            return false;
        }
        if (!this.getSong().equals(other.getSong())){
            return false;
        }
        return true;
    }
    
}
