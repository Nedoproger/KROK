/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;

/**
 *Класс, описывающий звуковоспроизводящее устройство.
 * @author msi
 */
public class SoundReproducer {
    private String type;
    private Carrier carrier;
    private String currentSong;
    private int songnum;
    /**
     * Конструктор с двумя параметрами. Устанавливает тип звуковоспроизводящего устройства и носитель.
     * @param type тип звуковоспроизводящего устройства. Тип String.
     * @param carrier носитель. Тип String.
     */
    public SoundReproducer(String type, Carrier carrier){
        setType(type);
        setCarrier(carrier);
    }
    /**
     * Возвращает тип звуковоспроизводящего устройства.
     * @return тип String
     */
    public String getType(){
        return this.type;
    }
    /**
     * Устанавливает тип звуковоспроизводящего устройства
     * @param type тип String.
     */
    public void setType(String type){
        this.type=type;
        if (this.carrier!=null){
            setCarrier(this.carrier);     // Проверка вызывается ли из конструктора.
        }
    }
    /**
     * Возвращает носитель
     * @return тип Carrier.
     */
    public Carrier getCarrier(){
        return this.carrier;
    }
    /**
     * Метод, устанавливающий носитель. Внутри проверка на совместимость типа звуковоспроизводяего устройства и типа носителя.
     * @param carrier тип Carrier.
     */
    public void setCarrier(Carrier carrier){
        if ((this.type.toLowerCase()=="виниловая вертушка"&&carrier.getType().toLowerCase()=="виниловая пластинка")
         ||(this.type.toLowerCase()=="сд проигрыватель"&&carrier.getType().toLowerCase()=="сд") 
         || (this.type.toLowerCase()=="универсальный плеер")){
            this.carrier=carrier;
            setCurrentSong(0);
        }
        else{
            System.out.println("Данный носитель не поддерживается на устройстве");
        }
    }
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
        if (!this.getType().equals(other.getType())){
            return false;
        }
        if (!this.getCarrier().equals(other.getCarrier())){
            return false;
        }
        return true;
    }
    public String toString(){
        return this.type + "  "+this.getCarrier().getType()+"  "+this.getCurrentSong();
    }
    /**
     * Выдает в консоль информацию о типе звуковоспроизводящего устройства,
     * типе проигрывателя и название текущей песни.
     */
    public void getInfo(){
        System.out.println(this);
    }
    
}
