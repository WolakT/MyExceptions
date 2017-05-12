package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-05-12.
 */
public class MyScanner {

    private int a;

    public int findInteger(String input) {

        Scanner myScanner = new Scanner(input);
        while (myScanner.hasNext()) {

            System.out.println(myScanner.next());
/*

            try {
                a = myScanner.nextInt();
                myScanner.next();
            } catch (InputMismatchException e) {
            }
*/



        }

        return a;
    }
}
