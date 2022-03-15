import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner wpisz = new Scanner(System.in);
    int liczba1;
    int liczba2;
    System.out.print("Podaj liczbe pierwsza: ");
    liczba1=wpisz.nextInt();
    System.out.print("Podaj liczbe druga: ");
    liczba2=wpisz.nextInt();

    System.out.println("Twoja suma to: " + (liczba1+liczba2));
    
  }
}