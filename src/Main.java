import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        int x;
//        x = 9;
//        if (x % 2 == 0) {
//
//            System.out.println("Vrednost je parna");
//
//        }else {
//
//            System.out.println("Vrednost nije parna");
//        }
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Unesite broj:");
//        int x=sc.nextInt();
//        if (x % 2 == 0)
//        {
//       System.out.println("Vrednost je parna");
//
//        }else {
//
//           System.out.println("Vrednost nije parna");
//       }

//        boolean heroIsDead = true;
//        if (heroIsDead) {
//            System.out.println("hero is dead");
//            heroIsDead = false;
//        }
//
//        if (!heroIsDead) {
//
//            System.out.println("hero is not Dead");
//
//        }

//        String a = "Marija";
//        double ba = 8.5;
//        double ca = 9.5;
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        if (str.equals(a)) {
//            System.out.print(ba + ca);
//
//        } else
//
//        if (!str.equals(a)) {
//            System.out.print(ba - ca);
//    }

//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Unesite prvi broj");
//    int operand1 = scanner.nextInt();
// System.out.print("Unesite drugi broj");
//    int operand2 = scanner.nextInt();
//
//System.out.print("Unesite racunsku operaciju");
//    String operand = scanner.next();
//    if(operand.equals="")

//        int x = 523134;
//        int y = 325423;
//
//        if (x % y == 0) {
//
//            System.out.println("Ostatak ne postoji");
//
//        } else {
//            if (x % y < 1000) {
//                System.out.println("Ostatak je manji od 1000");
//            } else if (x % y > 1000) {
//                System.out.println("Ostatak je veci od 1000");
//            } else {
//                System.out.println("Ostatak je jednak 1000");}


//        else if
//        (x % y != 0 || x % y < 1000 || x % y > 1000) {
//
//            System.out.println("Ostatk postoji");
//
//        }
//        System.out.println(x%y);

        Scanner sc = new Scanner(System.in);
        System.out.println("Marka automobila je:");
        String markaAutomobila = sc.next();
        String carMake = "Ford";
        int doors = 4;
        if (!markaAutomobila.equalsIgnoreCase(carMake)) {
            System.out.println("Marka automobila nije Ford");
        }
        if (markaAutomobila.equalsIgnoreCase(carMake)) {
            System.out.println("Marka automobila je Ford");
        System.out.println("Broj vrata automobila je:");
        int brojVrataAutomobila = sc.nextInt();


            if (brojVrataAutomobila == 1) {
                System.out.println("Broj vrata na automobilu je 1");
            }

            else if (brojVrataAutomobila == 2) {
                System.out.println("Broj vrata na automobilu je 2");
            }

            else if (brojVrataAutomobila == 3) {
                System.out.println("Broj vrata na automobilu je 3");
            }
            else if (brojVrataAutomobila == 4) {
                System.out.println("Broj vrata na automobilu je 4");
            }
            else if (brojVrataAutomobila >= 5) {
                System.out.println("Broj vrata na automobilu je veci od 4");
            }

        }

    }}



    
