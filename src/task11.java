public class task11 {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
      int n=20;
      int sayac=0;
        for(int sayi=2;sayi<n;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0)
            {
                System.out.print(sayi+" ");
                sayac++;
            }
        }

    }
}
