import java.util.ArrayList;
import java.util.List;

public class task06 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(List.of(5,4,6,2,1));
        System.out.println("hillNum(list) = " + hillNum(list));
    }public static int hillNum(ArrayList<Integer>list){
        int i=1;
        int y=0;
        ArrayList<Integer> yeni=new ArrayList<>();
        for ( i = 1; i < list.size()-1; i++) {
            if (list.get(i-1)>list.get(i)&&list.get(i)>list.get(i+1)){
                y=list.get(i);
            }
        }


        return y ;
    }
    }

