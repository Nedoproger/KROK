
package lab3;

/**
 * Класс, описывающий координаты шахматной клетки.
 * 
 */
public class ChessSquare {
    private int x;
    private int y;
    /**
     * Конструктор с двумя параметрами, задающий координаты шахматной клетки
     * @param x - тип int. Коордианты клетки по оси X.
     * @param y - тип int. Координаты клетки по оси Y.
     * @throws IncorrectCoordsException
     */
    public ChessSquare(int x, int y) throws IncorrectCoordsException{
        setCoord(x,y);
    }
    /**
     * Перегруженный конструктор для ввода координат в буквенно-числовом виде.
     * @param x - тип char. Координаты по по оси x в буквенном виде.
     * @param y - тип int. Координаты по оси y в числовом виде.
     */
    public ChessSquare(char x, int y) throws IncorrectCoordsException{
        setCoord(x,y);
    }
    /**
     * Метод, устанавливающий координаты шахматной клетки.
     * @param x - тип int. Координаты клетки по оси x.
     * @param y - тип int. Координаты клетки по оси y.
     * @throws IncorrectCoordsException 
     */
    public void setCoord(int x,int y) throws IncorrectCoordsException{
        if (x>7||x<0||y>7||y<0){
            throw new IncorrectCoordsException("Некорректно указаны коордианты. Клетки пронумерованы от 0 до 7");
        }
        else{
            this.x=x;
            this.y=y;
        }
    }
    /**
     * Метод, устанавливающий координаты шамхатной клетки в буквенно-числовом виде.
     * @param x - тип char. Координаты клетки по оси x.
     * @param y - тип int. Координаты клетки по оси y.
     * @throws IncorrectCoordsException 
     */
    public void setCoord(char x, int y) throws IncorrectCoordsException{
        setCoord(x-'a',y-1);
    }
    /**
     * Возвращает координату клетки по оси x.
     * @return тип int.
     */
    public int getX(){
        return this.x;
    }
    /**
     * Возвращает координату клетку по оси y.
     * @return тип int.
     */
    public int getY(){
        return this.y;
    }
    /**
     * Устанавливает координату по оси x.
     * @param x - устанавливаемое значение.
     * @throws IncorrectCoordsException 
     */
    public void setX(int x) throws IncorrectCoordsException{
        setCoord(x,this.y);
    }
    /**
     * Устанавливает координату по оси y.
     * @param y - устанавливаемое значение.
     * @throws IncorrectCoordsException 
     */
    public void setY(int y) throws IncorrectCoordsException{
        setCoord(this.x,y);
    }
    /**
     * Возвращает координаты клетки в формате: номер колонки от 'a' до 'h',
     * номер строки начиная с 1.  
     */
    public String toString(){
        return (char)('a'+this.x)+""+(char)('1'+this.y);
    }
    /**
     * Возвращает цвет текущей клетки.
     * @return тип String.
     */
    public String getColor(){
        if ((this.x+this.y)%2==0){
            return "Black";
        }
        else{
            return "White";
        }
    }
}
