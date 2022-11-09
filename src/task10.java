import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task10 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList<>(List.of(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));

        int min= 20;
        int max=30;

        rangeBtw(list1,min,max);

        System.out.println(rangeBtw(list1, min, max)); //5


    }

    private static int rangeBtw(List<Integer> list1, int min, int max) {
        int count=0;
        Collections.sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)>=min && list1.get(i)<=max){
                count++;
            }
        }
        return count;
    }
}