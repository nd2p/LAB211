/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validator {

    private static final Scanner SCANNER = new Scanner(System.in);

    private Validator() {

    }

    public static int getInt(String messageInfor, String messageErrorOutOfRange,
            String messageErrorNumber, int min, int max) {
        do {
            try {
                System.out.print(messageInfor);
                int number = Integer.parseInt(SCANNER.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println(messageErrorOutOfRange);
                }
            } catch (Exception e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);

    }

    public static double getDouble(String messageInfor, String messageErrorOutOfRange,
            String messageErrorNumber, double min, double max) {
        do {
            try {
                System.out.print(messageInfor);
                double number = Double.parseDouble(SCANNER.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println(messageErrorOutOfRange);
                }
            } catch (Exception e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);

    }

    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = SCANNER.nextLine();
            if (str.matches(REGEX)) {
                return str;
            } else {
                System.out.println(messageError);
            }
        } while (true);
    }

    public static Date getDate(String messageInfo, String messageErrorOutOfRange,
            String messageDateErrorForm, final String REGEX, Date min, Date max) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(REGEX);
        dateFormat.setLenient(false);
        do {
            System.out.print(messageInfo);
            try {
                Date date = dateFormat.parse(REGEX);
                if (date.compareTo(min) >= 0 && date.compareTo(max) <= 0) {
                    return date;
                } else {
                    System.out.println(messageErrorOutOfRange);
                }
            } catch (Exception e) {
                System.out.println(messageDateErrorForm);
            }
        } while (true);
    }

    public static int getIndex(String messageInfor, String messageErrorOutOfRange,
            String messageErrorNumber, ArrayList<Integer> list) {
        do {
            try {
                System.out.print(messageInfor);
                int number = Integer.parseInt(SCANNER.nextLine());
                for (Integer integer : list) {
                    if (integer == number) {
                        return number;
                    } else {
                        System.out.println(messageErrorOutOfRange);
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(messageErrorNumber);
            }
        } while (true);
    }
}
