package musicsystem;

/**
 *Класс, описывающий универсальный плеер.
 * 
 */
public class UniProig extends SoundReproducer {
    /**
     * Конструктор с одним параметром
     * @param carrier - устанавливаемый проигрыватель.
     */
    public UniProig(Carrier carrier){
        super(carrier);
    }
    /**
     * Переопределение метода из родительского класса.
     * Данный проигрыватель совместим со всеми типами носителей.
     * Текущая песня по умолчанию - 1(или 0 в 0 индексации).
     * @param carrier - устанавливаемый проигрыватель 
     */
    public void setCarrier(Carrier carrier){
        this.carrier=carrier;
        this.setCurrentSong(0);
    }
    
}
