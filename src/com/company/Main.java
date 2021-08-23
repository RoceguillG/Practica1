package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //menu inicial
//inicio del menu
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion;


        do {

            //desplegar el menu
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println(" 1. Iniciar Juego ");
            System.out.println(" 2. Renaudar Juego ");
            System.out.println(" 3. Generar Reportes ");
            System.out.println(" 4. Salir ");


            try {
                System.out.println(" Ingrese la opción que desea realizar: ");
                opcion = entrada.nextInt();

//estructura del Switch para realizar las operaciones

                switch (opcion) {
                    case 1:
                        System.out.println("INIO DELL JEUGO  ");


                        break;
                    case 2:
                        System.out.println("RENAUDAR JUEGO");

                        break;
                    case 3:
                        System.out.println("REPORTES");
                        break;
                    case 4:

                        salir = true;

                        System.out.println("SALIR DEL JUEGO");

                        System.out.println("Has salido exitosamente del juego!");
                        break;

                    default:
                        System.out.println("Ha ingresado una opción incorrecta");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡¡Debes insertar un número!!!");
               // utilizar el nombre de la variable de entrada, y solo .next para que jale bien el trycatch
                entrada.next();

            }
        } while (!salir);


    }
}
