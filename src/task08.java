import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task08 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList<Integer>arrList= new ArrayList<>(List.of(5,3,4,6,7));
       //
       // System.out.println(arrList);
        secondMax(arrList);

    }
    public static void secondMax(ArrayList arrList) {
        Collections.sort(arrList);

        System.out.println(arrList.get(arrList.size() - 2));
    }

}

