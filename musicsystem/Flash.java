package musicsystem;

/**
 *
 * Класс, описывающий тип носителя - флешку.
 */
public class Flash extends Carrier {
    /**
     * Конструктор с одним параметром
     * @param songs - список песен, хранящихся на устройстве.
     */
    public Flash(Song[] songs){
        super(songs);
    }
    /**
     * Возвращает название носителя.
     * @return тип String.
     */
    public String toString(){
        return "флешка";
    }
    
}
