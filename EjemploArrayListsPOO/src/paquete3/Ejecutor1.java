/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor1 {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        String marcaC;
        String marcaP;
        String marcaM;
        double costoP;
        double costoM;
        ArrayList<Computador> computadoras = new ArrayList<>();
        int numeroComputadoras;

        // Ingreso de valores por teclado
        System.out.println("CALCULO DE VENTA DE COMPUTADORAS");
        System.out.print("Ingrese el número de computadoras a comprar: ");
        numeroComputadoras = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < numeroComputadoras; i++) {
            System.out.printf("Ingrese marca de la computadora%d\n", i + 1);
            marcaC = sc.nextLine();
            System.out.printf("Ingrese marca del procesador %d\n", i + 1);
            marcaP = sc.nextLine();
            System.out.printf("Ingrese el costo del procesador %d\n", i + 1);
            costoP = sc.nextDouble();
            Procesador p1 = new Procesador(marcaP, costoP);
            System.out.printf("Ingrese marca de la memoria %d\n", i + 1);
            marcaM = sc.nextLine();
            System.out.printf("Ingrese el costo de la memoria %d\n", i + 1);
            costoM = sc.nextDouble();

        }
    }
}
