import java.util.Scanner;

public class Main {public static void main(String[] args) {
   double kilo , boy , endeks ;
   Scanner input = new Scanner(System.in);
   System.out.println("Lütfen kilo bilgisinizi giriniz");
   kilo = input.nextDouble();
   System.out.println("Lütfen boy bilgisinizi giriniz (metre cinsinden)");
   boy = input.nextDouble();
   endeks = kilo / (boy * boy);
   System.out.println("Vücut kitle endeks oranınız = " + endeks);
}

}