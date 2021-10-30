
package lab3;

/**
 * Класс, описывающий исключение: некорректно введенные координаты клетки.
 * Клетка должна иметь координаты от 0 до 7.
 */
public class IncorrectCoordsException extends Exception {
    public IncorrectCoordsException(String message){
        super(message);
    }
}
