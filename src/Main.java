import java.util.Scanner;

public class Main {
    public static void main(String[]args ){
        // Sınıfı Geçme Durumu . Matematik,fizik,türkçe,kimya,müzik dersleri var.Geçme notu 55.
        int mat, fizik, turkce,kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        double avarage = (mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız : "+avarage);
        }else {
            System.out.println("Tebrikler ,sınıfı geçtiniz.");
            System.out.println("Ortalamanız:"+avarage);
        }
    }
}
