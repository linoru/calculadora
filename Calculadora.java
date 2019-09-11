/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double num1, num2;
            System.out.println("Ingrese dos numero para hacer las operaciones matemáticas básicas");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            suma(num1, num2);
            resta(num1, num2);
            multiplicacion(num1, num2);
            division(num1, num2);
            System.out.println("fin :P");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
            //System.out.println("Error");
        }

    }

    public static void suma(double num1, double num2) {
        double suma;
        suma = num1 + num2;
        System.out.println("El resultado de su suma es: " + suma);
    }

    public static void resta(double num1, double num2) {
        double resta;
        resta = num1 - num2;
        System.out.println("El resultado de su resta es: " + resta);
    }

    public static void multiplicacion(double num1, double num2) {
        double multiplicacion;
        multiplicacion = num1 * num2;
        System.out.println("El resultado de su multiplicación es: " + multiplicacion);
    }

    public static void division(double num1, double num2) {
        double division;
        division = num1 / num2;
        System.out.println("El resultado de su división es: " + division);
    }

}
