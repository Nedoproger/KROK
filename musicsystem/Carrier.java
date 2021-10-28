package musicsystem;

import java.util.Arrays;

/**
 * Абстрактный класс, описывающий носители.
 * 
 */
public abstract class Carrier {
    private Song[] songs;
    /**
     * Конструктор с одним параметром.
     * @param songs список песен, хранящихся на устройстве. Массив типа Song.
     */
    public Carrier(Song [] songs){
        this.songs=songs;
    }
    /**
     * Устанавливает песня, хранящиеся на устройстве.
     * @param songs массив типа Song.
     */
    public void setSongs(Song[] songs){
        this.songs=songs;
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
        if (!Arrays.equals(this.getSongs(), other.getSongs())){
            return false;
        }
        return true;
    } 
}
