package musicsystem;

import java.util.Arrays;

/**
 *Класс, описывающий носитель - виниловую пластинку.
 * 
 */
public class Vinyl extends Carrier {
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, хранящихся на устройстве.
     */
    public Vinyl(Song [] songs){
        super(songs);
    }
    /**
     * Возвращает название носителя.
     * @return тип String.
     */
    public String toString(){
        return "виниловая пластинка";
    } 
    
}
