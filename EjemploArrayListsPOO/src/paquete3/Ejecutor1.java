package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor1 {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner sc = new Scanner(System.in);

        String marcaC; // Marca computador
        String marcaP; // Marca Procesador
        String marcaM; // Marca Memoria
        double costoP; // Costo Procesador
        double costoM; // Costo Memoria
        
        ArrayList<Computador> computadoras = new ArrayList<>();
        int numeroComputadoras; // variable para iteraciones en el ciclo

        // Ingreso de valores por teclado
        System.out.println("CALCULO DE VENTA DE COMPUTADORAS");
        System.out.print("Ingrese el número de computadoras a comprar: ");
        numeroComputadoras = sc.nextInt();

        sc.nextLine(); // Limpieza de buffer

        for (int i = 0; i < numeroComputadoras; i++) {
            System.out.printf("\nIngrese marca de la computadora #%d\n", i + 1);
            marcaC = sc.nextLine();
            System.out.printf("Ingrese marca del procesador %d\n", i + 1);
            marcaP = sc.nextLine();
            System.out.printf("Ingrese el costo del procesador %d\n", i + 1);
            costoP = sc.nextDouble();
            
            Procesador p1 = new Procesador(marcaP, costoP);
            // Asignar a un objeto de tipo Procesador la informacion dada por
            // teclado
            sc.nextLine(); // Limpieza de buffer

            System.out.printf("Ingrese marca de la memoria %d\n", i + 1);
            marcaM = sc.nextLine();
            System.out.printf("Ingrese el costo de la memoria %d\n", i + 1);
            costoM = sc.nextDouble();
            
            sc.nextLine(); // Limpieza de buffer
            
            Memoria m1 = new Memoria(marcaM, costoM);
            // Asignar a un objeto de tipo Memoria la informacion dada por
            // teclado
            
            Computador comp1 = new Computador(marcaC, p1, m1);
            // Crear un objeto de tipo computador para enviar los parametros
            comp1.calcularCostoComputador();
            
            computadoras.add(comp1); 
            // Y agregamos ese objeto al arreglo de objetos
        }
        
        /*
        Una vez terminadas las iteraciones, instanciamos un objeto de tipo Venta
        en el cual enviamos como parametro el arreglo de objetos de tipo Computador
        */
        Venta venta1 = new Venta(computadoras);
        venta1.calcularValorVenta(); // Calcular valor de venta final
        
        System.out.printf("%s", venta1);
        // Muestra por pantalla con el metodo toString de la clase Venta
    }
}
