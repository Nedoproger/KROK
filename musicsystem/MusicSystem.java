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
        Song [] songs=new Song[5];
        songs[0]=new Song("группа 1","песня 1");
        songs[1]=new Song("группа 2","песня 2");
        songs[2]=new Song("группа 3","песня 3");
        songs[3]=new Song("группа 4","песня 4");
        songs[4]=new Song("группа 5","песня 5");
        Vinyl v1=new Vinyl(songs);
        System.out.println(v1);
        CD c1=new CD(songs);
        System.out.println(c1);
        Flash f1= new Flash(songs);
        System.out.println(f1);
        System.out.println(f1.getSongs()[4]);
        VinylProig pr1=new VinylProig(c1);
        VinylProig prv=new VinylProig(v1);
        prv.getInfo();
        prv.nextSong();
        prv.getInfo();
        CDProig pr2=new CDProig(c1);
        CDProig pr3=new CDProig(v1);
        pr2.getInfo();
        
    }
    
}
