/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulis;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validator {

    private static final Scanner SCANNER = new Scanner(System.in);

    public Validator() {
    }

    public static int getInt(String getMessage, String errorOutOfRange,
            String errorNumber, int min, int max) {
        do {
            try {
                System.out.println(getMessage);
                int number = Integer.parseInt(SCANNER.nextLine());
                if ((number <= min) && (number >= max)) {
                    System.out.println(errorOutOfRange);
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorNumber);
            }
        } while (true);
    }
}
