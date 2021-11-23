

package java6path;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


public class Java6Path {
    /**
     * Метод, нормализующий путь
     * @param path - исходный путь, тип String.
     * @return - нормализованный путь
     */
    public static String getNormPath(String path){
        List<String> ls=List.of(path.split("/"));
        Deque<String> ds=new ArrayDeque<>();
        for (String s:ls){
            if (s.equals("..")){
                //если стек пустой или последний элемент выход из дирректории
                if(ds.isEmpty()||ds.getLast().equals("..")){
                    ds.addLast(s);
                }
                else{
                    ds.removeLast();
                }
            }
            else if(!s.equals(".")){
                ds.addLast(s);
            }
        }
        //перевод стека в строку
        String result="";
        for (String s:ds){
            result+=s+"/";
        }
        return result.substring(0, result.length()-1);
    }
    
    public static void main(String[] args) {
        String path="КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
        System.out.println(getNormPath(path));
    }
    
}
