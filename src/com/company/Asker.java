

package com.company;

import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in);

    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }

    public static int askId() {
        System.out.println("Please enter ID number you want to delete");
        int id = scan.nextInt();
        return id;
    }

}
