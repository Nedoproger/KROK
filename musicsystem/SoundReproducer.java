/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

/**
 *Абстрактный класс, описывающий звуковоспроизводящее устройство.
 * @author msi
 */
public abstract class SoundReproducer {
    protected Carrier carrier;
    private String currentSong;
    private int songnum;
    /**
     * Конструктор с одним параметром. Устанавливает носитель.
     * @param carrier носитель. Тип String.
     */
    public SoundReproducer(Carrier carrier){
        setCarrier(carrier);
        
    }
    
    
    /**
     * Возвращает носитель
     * @return тип Carrier.
     */
    public Carrier getCarrier(){
        return this.carrier;
    }
    public abstract void setCarrier(Carrier carrier);
    /**
     * Возвращает название текущей песни.
     * @return тип String.
     */
    public String getCurrentSong(){
        return this.currentSong;
    }
    /**
     * Устанавливает песню по номеру.
     * @param i Номер текущей песни в 0 индексации. Тип int.
     */
    public void setCurrentSong(int i){
        if (i>=0 && i<=this.getCarrier().getSongs().length-1){
            this.currentSong=this.getCarrier().getSongs()[i].toString();
            this.songnum=i;
        }
        else{
            System.out.println("Такой песни нет");
        }
    }
    /**
     * Выбирает следующую в списке песню в качестве текущей.
     * Если текущая песня последняя в списке, переключает на первую.
     */
    public void nextSong(){
        this.setCurrentSong((this.songnum+1)%this.getCarrier().getSongs().length);
    }
    
    public boolean equals(Object obj){
        if (this == obj) 
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        SoundReproducer other=(SoundReproducer) obj;
        if (!this.getCarrier().equals(other.getCarrier())){
            return false;
        }
        return true;
    }
    public String toString(){
        return this.getClass().getSimpleName() + "  "+this.getCarrier()+"  "+this.getCurrentSong();
    }
    /**
     * Выдает в консоль информацию о типе звуковоспроизводящего устройства,
     * типе проигрывателя и название текущей песни.
     */
    public void getInfo(){
        System.out.println(this);
    }
    
}
