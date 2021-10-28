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
