/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        // agregar valores a los atributos de h1 y h2, por teclado
        Scanner entrada = new Scanner(System.in);

        String nombreHospital;
        int camasHospital;
        double presupuestoHospital;

        System.out.println("Ingrese nombre hospital");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese número de camas");
        camasHospital = entrada.nextInt();

        System.out.println("Ingrese presupuesto");
        presupuestoHospital = entrada.nextDouble();
        entrada.nextLine();

        Hospital h1 = new Hospital();
        h1.establecerNombre(nombreHospital);
        h1.establecerNumeroCamas(camasHospital);
        h1.establecerPresupuesto(presupuestoHospital);

        System.out.println("Ingrese nombre hospital(2)");
        nombreHospital = entrada.nextLine();

        System.out.println("Ingrese número de camas(2)");
        camasHospital = entrada.nextInt();

        System.out.println("Ingrese presupuesto(2)");
        presupuestoHospital = entrada.nextDouble();

        Hospital h2 = new Hospital();
        h2.establecerNombre(nombreHospital);
        h2.establecerNumeroCamas(camasHospital);
        h2.establecerPresupuesto(presupuestoHospital);

        System.out.printf("%s \n", "Hola desde el main");

        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
}
