
package lab4;

/**
 * 
 * Основной класс для обработки 
 */
public class Lab4 {
    //Обработка этой строки без использования многопоточности длится примерно 37 секунд.
    
    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
        " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой" +
        " не зависит ни от того, ни от другого. Поэтому мануфактуры лучше всего процветают там, где" +
        " наиболее подавлена духовная жизнь, так что мастерская может рассматриваться как машина," +
        " части которой составляют люди.";

    
   public static final String TEMPLATE = " ";
   

    
    public static void main(String[] args) throws InterruptedException {
        
        long current = System.currentTimeMillis();
        /*
        Создание потоков для обработки строки. Каждый поток обрабатывает 1/4 часть строки.
        Получается ускорение работы примерно в 4 раза.
        
        */
        Thread p1=new Proc(INPUT_STRING.substring(0, INPUT_STRING.length()/4),TEMPLATE);
        Thread p2=new Proc(INPUT_STRING.substring(INPUT_STRING.length()/4,INPUT_STRING.length()/2),TEMPLATE);
        Thread p3=new Proc(INPUT_STRING.substring(INPUT_STRING.length()/2, INPUT_STRING.length()*3/4),TEMPLATE);
        Thread p4=new Proc(INPUT_STRING.substring(INPUT_STRING.length()*3/4),TEMPLATE);
        //запуск 4 потоков.
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        
        //Основной поток дожидается конца всех побоычных потоков.
        p1.join(); 
        p2.join();
        p3.join();
        p4.join();
        
        System.out.println("Count of space: " + Proc.getSum());// ответ
        
        //время исполнения
        System.out.println("Time: " + (System.currentTimeMillis() - current) / 1000 + " c.");
            
        
       
    }
    
}
