package Inheritance;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
        System.out.println("How many Objects?");
        int total = in.nextInt();
        System.out.println("Total: "+total);
        } catch (Exception e) {
            System.out.println("System Error, Wrong data type");
        }
        System.out.print("CD/DVD: ");
        String choice = in.next();

        if(choice.equals("CD")) {
        CD c = new CD();
        c.print();
        } else if (choice.equals("DVD")){
        DVD d = new DVD();
        d.print();
        } else {
            System.out.println("System Error");
        }
        in.close();
    }
    
}
