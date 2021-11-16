
package lab5io;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5IO {
    /**
     * Метод находит количество слов в зааданном файле.
     */
    public static int getNumOfWords(File file) throws FileNotFoundException{
        Scanner in=new Scanner(file);
        int counter=0;
        while (in.hasNext()){
            in.next();
            counter++;
        }
        return counter;
        
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Задана пустая строка");
        }
        
        try {
            File file=new File(args[0]);
            int counter=getNumOfWords(file);
            System.out.printf("Количество слов: %d", counter);
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }  
    }
}
