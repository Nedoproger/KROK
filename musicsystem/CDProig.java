package musicsystem;

/**
 *Класс, описывающий сд проигрыватель
 * 
 */
public class CDProig extends SoundReproducer {
    /**
     * Конструктор с одним параметром
     * @param carrier - устанавливаемый проигрыватель.
     */
    public CDProig(Carrier carrier){
        super(carrier);
    }
    /**
     * Переопределение метода из родительского класса.
     * Внутри производится проверка на совместимость проигрывателя и носителя.
     * Данный проигрыватель совместим с носителями CD.
     * Текущая песня по умолчанию - 1(или 0 в 0 индексации).
     * @param carrier - устанавливаемый проигрыватель 
     */
    public void setCarrier(Carrier carrier){
        if (carrier instanceof CD){
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
        return "сд проигрыватель "+carrier+" "+this.getCurrentSong();
    }
    
    
}
