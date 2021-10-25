/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicsystem;
import java.util.Scanner;
/**
 * Класс для тестов
 * 
 */
public class MusicSystem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Song[] old=new Song[5];
        old[0]=new Song("Группа 1","песня1");
        old[1]=new Song("Группа 2","песня 2");
        old[2]=new Song("Группа 3","песня 3");
        old[3]=new Song("Группа 4","песня 4");
        old[4]=new Song("Группа 5","песня 5");
        for (int i=0;i<5;i++){
            System.out.println(old[i]);
        }
        Carrier vin=new Carrier("виниловая пластинка",old);
        SoundReproducer cd=new SoundReproducer("сд проигрыватель",vin);// выдает сообщение о неподходящем устройстве
        SoundReproducer ms=new SoundReproducer("универсальный плеер",vin);
        //проверка работы методов
        ms.setCurrentSong(4);
        ms.getInfo();
        ms.nextSong();
        ms.getInfo();
        ms.setCurrentSong(12);
        
    }
    
}
