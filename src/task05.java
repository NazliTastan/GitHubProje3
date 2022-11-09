import java.util.ArrayList;

public class task05 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("New jersey");
        list.add("New york");
        list.add("Atlanta");
        list.add("Florida");
        list.add("Ohio");

        System.out.println("list = " + list);
        for(int i = list.size(); i >= 0; i--){
            System.out.println(list.get(i));


        }
        
    }

}


