import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task04 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String>renkler=new ArrayList<String>(List.of("yellow" , "red" , "blue" , "red" , "blue"));

        String s1="blue";
        String s2="red";
        changeInArraylist(renkler,s1,s2);
        System.out.println("changeInArraylist(renkler,s1,s2) = " + changeInArraylist(renkler, s1, s2));
    }
    private static ArrayList changeInArraylist(ArrayList<String> renkler, String s1, String s2) {
        ArrayList<String>yeniRenk=new ArrayList<>();

        for (int i = 0; i < renkler.size() ; i++) {

            if (renkler.get(i)==s1) {

                yeniRenk.add(s2);

            }else yeniRenk.add(renkler.get(i));
        }

        return yeniRenk;

        //foreach() ile de çözülür
    }
}
