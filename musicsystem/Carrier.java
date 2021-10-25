/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

import java.util.Arrays;

/**
 * Класс описывающий тип проигрывателя.
 * 
 */
public class Carrier {
    private String type;
    private Song[] songs;
    /**
     * Конструктор с двумя параметрами.
     * @param type тип проигрывающего устройства. Задается String.
     * @param songs список песен, хранящихся на устройстве. Массив типа Song.
     */
    public Carrier(String type, Song [] songs){
        this.type=type;
        this.songs=songs;
    }
    /**
     * Устанавливает тип носителя.
     * @param type тип String.
     */
    public void setType(String type){
        this.type=type;
    }
    /**
     * Устанавливает песня, хранящиеся на устройстве.
     * @param songs массив типа Song.
     */
    public void setSongs(Song[] songs){
        this.songs=songs;
    }
    /**
     * Возвращает тип устройства
     * @return  тип String.
     */
    public String getType(){
        return this.type;
    }
    /**
     * Возвращает песни, хранящиеся на устройстве.
     * @return массив типа Song.
     */
    public Song[] getSongs(){
        return this.songs;
    }
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Carrier other=(Carrier) obj;
        if (!this.getType().equals(other.getType())){
            return false;
        }
        if (!Arrays.equals(this.getSongs(), other.getSongs())){
            return false;
        }
        return true;
    }
    public String toString(){
        return this.getType();
    }  
}
