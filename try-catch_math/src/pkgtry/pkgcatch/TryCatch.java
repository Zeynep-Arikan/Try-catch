package pkgtry.pkgcatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner sc =new Scanner(System.in);
            System.out.println("1.sayiyi giriniz");
            double bolunen=sc.nextDouble();
            System.out.println("2.sayiyi giriniz");
             double bolen = sc.nextDouble();
             double sonuc = bolunen/bolen;
            System.out.println("Sonuc="+sonuc);
        }
        catch(ArithmeticException hata1){
            System.out.println("Bolen sayi 0 olamaz");
        }
        catch(InputMismatchException hata2){
            System.out.println("Lütfen sadece sayi giriniz");
        }
        finally{
            System.out.println("İşlem Sonlandı");
        }
    }
   
    
}
