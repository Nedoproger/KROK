
package lab4;

/**
 * Класс для многопоточного поиска символа в строке
 * 
 */
public class Proc extends Thread {
    private final String s;
    private final String template;
    volatile static private int sum=0;//сумма символов. Используется volatile для корректного суммирования.
    /**
     * Конструктор из двух параметров.
     * @param s - строка для обработки
     * @param template - искомый символ
     */
    public Proc(String s,String template){
        this.s=s;
        this.template=template;
    }
    /**
     * Переопределенный метод run. Ищет количество введенных символов в строку.
     */
    @Override
    public void run(){
        for (int i = 0; i < s.length(); i++) {
            if (Matcher.match(String.valueOf(s.charAt(i)), this.template)) {
                sum++;
            }
        }
    }
    /**
     * Статический метод.
     * @return возвращает количество нужных символов в строке. 
     */
    public static int getSum(){
        return sum;
    }
}
