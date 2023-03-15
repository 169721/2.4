//kalkulator
//1. pole prostokąta
//2. pole trójkąta prostokątnego
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wybor;
    int a, b;
    System.out.println("podaj wybor:");
      wybor = sc.nextInt();
    switch(wybor){
      case 1:
        
        System.out.println("podaj a");
        a = sc.nextInt();
        System.out.println("podaj b");
        b = sc.nextInt();
        System.out.println("wynik: "+(a*b));
        break;
      case 2:
        
        System.out.println("podaj a");
        a = sc.nextInt();
        System.out.println("podaj b");
        b = sc.nextInt();
        System.out.println("wynik: "+((a+b)/2));
        break; 
    
    
    }
  }
}