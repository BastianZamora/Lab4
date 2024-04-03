package Calculadora;
import java.util.Scanner;

public class Menu {
    public void getMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. División");
            System.out.println("5. Validar Palíndromo");
            System.out.println("6. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSumar");
                    Metodos.Suma(scanner);
                    break;
                case 2:
                    System.out.println("\nRestar");
                    Metodos.Resta(scanner);
                    break;
                case 3:
                    System.out.println("\nMultiplicar");
                    Metodos.Multiplicacion(scanner);
                    break;
                case 4:
                    System.out.println("\nDividir");
                    Metodos.Division(scanner);
                    break;
                case 5:
                    System.out.println("\nValidar Palíndromo");
                    Scanner leer = new Scanner(System.in);
                    System.out.println("Ingrese una palabra, sin tildes: ");
                    String palabra = leer.nextLine().toLowerCase();

                    if(Metodos.Palindromo(palabra)){
                        System.out.println("Si es palindromo");
                    }else{
                        System.out.println("No es palindromo");
                    }
                    break;
                case 6: 
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 6");
                    break;
            }
        } while (opcion != 6);
        scanner.close();
    }
}
