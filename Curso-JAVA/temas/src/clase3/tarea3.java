package clase3;

import java.util.Scanner;

public class tarea3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("¿Desea concatenar cadenas dentro de un array? (s/n): ");
        String opcionArray = teclado.nextLine();
        
        String[] arrayCadenas = null;
        String total = "";
        boolean concatenarEnArray = false;
        
        if (opcionArray.equalsIgnoreCase("s")) {
            concatenarEnArray = true;
            System.out.print("Ingrese la cantidad de cadenas que tendrá el array: ");
            int cantidadCadenas = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea pendiente
            arrayCadenas = new String[cantidadCadenas];
            
            for (int i = 0; i < cantidadCadenas; i++) {
                System.out.print("Ingrese la cadena " + (i+1) + " del array: ");
                arrayCadenas[i] = teclado.nextLine();
            }
        }
        
        boolean seguirIngresando = true;
        while (seguirIngresando) {
            System.out.print("Ingrese una cadena: ");
            String cadena = teclado.nextLine();
            
            if (concatenarEnArray) {
                for (int i = 0; i < arrayCadenas.length; i++) {
                    total += arrayCadenas[i] + " ";
                }
                concatenarEnArray = false;
            }
            
            total += cadena + " ";
            
            System.out.print("¿Desea ingresar otra cadena? (s/n): ");
            String opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                seguirIngresando = false;
            }
        }
        
        System.out.println("Cadenas concatenadas: " + total.trim());
        teclado.close();
    }
}
