import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, startPrice = 10, minPrice = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = startPrice + (perKM * km);
        total = (total < minPrice) ? minPrice : total;

        System.out.print("Taksi Ücreti : " + total);
    }
}