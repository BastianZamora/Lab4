package Calculadora;

import java.util.Scanner;

public class Metodos {
    public static void Suma(Scanner scanner) {
        int num1, num2;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        if (Validar(num1, num2)){
            System.out.println("La suma es: "+ (num1 + num2));
        } else {
            System.out.println("Ingrese números distintos");
        }
    }

    public static void Resta(Scanner scanner) {
        int num1, num2;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        if (Validar(num1, num2)){
            System.out.println("La resta es: "+ (num1 - num2));
        } else {
            System.out.println("Ingrese números distintos");
        }
    }

    public static void Multiplicacion(Scanner scanner) {
        int num1, num2;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        if (Validar(num1, num2)){
            System.out.println("El producto es: "+ (num1 * num2));
        } else {
            System.out.println("Ingrese números distintos");
        }
    }

    public static void Division(Scanner scanner) {
        int num1, num2;
        System.out.print("Ingrese primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        num2 = scanner.nextInt();
        if (Validar(num1, num2)){
            if (num2 != 0) {
                double div = num1 / num2;
                System.out.println("El cociente es: "+ div);
            } else {
                System.out.println("No se puede dividir por cero");
            }
        } else {
            System.out.println("Ingrese números distintos");
        }
    }

    public static Boolean Validar(int num1, int num2){
        if (num1 != num2) { //Valida si los numeros son distintos
            return true;
        } else {
            return false;
        }
    }

    public static Boolean Palindromo(String palindromo) {
        if (palindromo.length() <= 1) { //Si es vacia o tiene solo 1 carácter se valida como palindromo
            return true;
        }
        if (palindromo.charAt(0) == palindromo.charAt(palindromo.length() - 1)) { //Comparar 1er y ultimo caracter
            return Palindromo(palindromo.substring(1, palindromo.length() - 1)); //Llama recursivamente a la función
        } else {
            return false;
        }
        
    }
}