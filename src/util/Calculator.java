/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

public class Calculator {

    public static void calculate() {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("enter the operation: 1+, 2-,3*,4/");
        int operation = sc.nextInt();
        double result = 0;
        if (operation == 1) {
            result = MathUtil.total(a, b);
        } else if (operation == 2) {
            result = MathUtil.difference(a, b);
        } else if (operation == 3) {
            result = MathUtil.product(a, b);
        } else if (operation == 4) {
            result = MathUtil.division(a, b);
        }

        System.out.println("result=" + result);
    }
}
