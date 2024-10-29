package Inheritance;

import java.util.Scanner;

public class Testerinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan Nama CD: ");
        String name = in.nextLine();
        System.out.println("Inputkan Nama artist: ");
        String artist = in.nextLine();
        System.out.println("Inputkan Nama label: ");
        String label = in.nextLine();
        System.out.println("Inputkan Number: ");
        int number = in.nextInt();
        System.out.println("Inputkan Quantity: ");
        int quantity = in.nextInt();
        System.out.println("Inputkan Total Lagu: ");
        int totalsong = in.nextInt();
        System.out.println("Inputkan Harga: ");
        double price = in.nextDouble();

        CD cd1 = new CD(number, name, quantity, price, artist, totalsong, label);
        cd1.print();
    }
}
