
package lab3;
import java.util.Scanner;
/**
 * 
 * Класс для тестов.
 */
public class Lab3 {

    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            ChessSquare ch=new ChessSquare('a',1);
            System.out.println(ch.getX());
            System.out.println(ch.getY());
            while(true){
                int x,y;
                x=in.nextInt();
                y=in.nextInt();
                ChessSquare ch1=new ChessSquare(x,y);
                System.out.println(ch1);
                System.out.println(ch1.getColor());
        }
        }
        catch(IncorrectCoordsException e){
            System.out.println(e.getMessage());
            
        }
    }
    
}
