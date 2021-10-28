/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

/**
 *
 * Класс, описывающий тип носителя - сд.
 */
public class CD extends Carrier {
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, хранящихся на устройстве.
     */
    public CD(Song[] songs){
        super(songs);
    }
    /**
     * Возвращает название носителя.
     * @return тип String.
     */
    public String toString(){
       return "сд";
    }
}
