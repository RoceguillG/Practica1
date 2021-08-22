package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//menu inicial
//inicio del menu
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;


        do {

            //desplegar el menu
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println(" 1. Iniciar Juego ");
            System.out.println(" 2. Renaudar Juego ");
            System.out.println(" 3. Generar Reportes ");
            System.out.println(" 4. Salir ");
            System.out.println(" Ingrese la opción que desea realizar: ");
            opcion = entrada.nextInt();

//estructura del Switch para realizar las operaciones




        }while (opcion!=4);



    }
}
