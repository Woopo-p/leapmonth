/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.leapmonth;

/**
 *
 * @author hp 1
 */

import java.util.Scanner;

public class Leapmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        
        boolean isLeapMonth = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        
        if (isLeapMonth) {
            System.out.println("Year " + year + ", Month " + month + " is a leap month.");
        } else {
            System.out.println("Year " + year + ", Month " + month + " is not a leap month.");
        }

        scanner.close();
    }
}
