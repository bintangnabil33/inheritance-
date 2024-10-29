package Inheritance;

import java.util.Scanner;

class Driver {
    
    public static void main(String[] args) {
        String choice;
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner s = new Scanner(System.in);
        System.out.print("CD/DVD: ");
        choice = s.nextLine();

        if (choice.equalsIgnoreCase("CD")){
            cd.print();
        }else if (choice.equalsIgnoreCase("DVD")){
            dvd.print();
        }
        s.close();
    }

    
}