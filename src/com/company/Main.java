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
                        System.out.println("INiCIO DeL JUeGO\n  ");
                        //inicio del tablero vveamos como queda
                        int[][] tablero = { {1, 2, 3, 4, 5, 6, 7, 8},
                                            {2, 4, 3, 4, 4, 1, 1, 1},
                                            {3, 0, 3, 4, 4, 1, 1, 1},
                                            {4, 1, 3, 4, 4, 1, 1, 1},
                                            {5, 1, 3, 4, 4, 1, 1, 1},
                                            {6, 2, 3, 4, 4, 1, 1, 1},
                                            {7, 3, 3, 3, 4, 1, 1, 1},
                                            {8, 0, 0, 0, 4, 1, 1, 1}};
                        String[][] tablero1 = { {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"|    |    |    |    |    |    |    |    |"},
                                                {"-----------------------------------------"}};







                        //llenado para entender de como se ingresa
                        int nFilas = tablero.length;
                        int nColumna = tablero[0].length;

//
//                        }
                        for (int i = 0; i < tablero1.length; i++) {
                            //System.out.print("|");
                            for (int j = 0; j < tablero1[0].length; j++) {
                                System.out.print(tablero1[i][j] + "");
//                               if(j!= tablero[i].length-1);
//                                    System.out.println("\t");
                            }
                            System.out.print("\n");
                        }


                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");


                        break;
                    case 2:
                        System.out.println("RENaUDAR JUeGO");

                        break;
                    case 3:
                        System.out.println("REPoRTES");
                        break;
                    case 4:

                        salir = true;

                        System.out.println("SAlIR DeL JUeGO");

                        System.out.println("Has salido exitosamente del juego!");
                        break;

                    default:
                        System.out.println("Ha ingresado una opción incorrecta");
                        break;
                }

                } catch(InputMismatchException e){
                    System.out.println("¡¡¡Debes insertar un número!!!");
                    // utilizar el nombre de la variable de entrada, y solo .next para que jale bien el trycatch
                    entrada.next();

                }
            } while (!salir) ;


        }
    }
