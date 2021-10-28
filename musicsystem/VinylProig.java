/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

/**
 *Класс, описывающий проигрыватель - виниловая вертушка.
 * 
 */
public class VinylProig extends SoundReproducer {
    /**
     * Конструктор с одним параметромю
     * @param carrier - устанавливаемый проигрыватель 
     */
    public VinylProig(Carrier carrier){
        super(carrier);
    }
    /**
     * Переопределение метода из родительского класса.
     * Внутри производится проверка на совместимость проигрывателя и носителя.
     * Данный проигрыватель совместим с носителями Vinyl.
     * Текущая песня по умолчанию - 1(или 0 в 0 индексации).
     * @param carrier - устанавливаемый проигрыватель 
     */
    public void setCarrier(Carrier carrier){
        if (carrier instanceof Vinyl){
            this.carrier=carrier;
            this.setCurrentSong(0);
        }
        else{
            System.out.println("Данный носитель не поддерживается");
        }
    }
    /**
     * Возвращает тип проигрывателя, тип носителя и текущую песня.
     * @return тип String. 
     */
    public String toString(){
        return "виниловая вертушка "+carrier+" "+this.getCurrentSong();
    }
    
}
