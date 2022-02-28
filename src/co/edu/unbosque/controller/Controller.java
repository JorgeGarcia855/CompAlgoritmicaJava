package co.edu.unbosque.controller;

import co.edu.unbosque.model.Algoritmos;

import java.util.Scanner;

public class Controller {
    private final Algoritmos algoritmos;
    private final Scanner scan;

    public Controller() {
        algoritmos = new Algoritmos();
        scan = new Scanner(System.in);
        metodoEuclides();
        metodoFactoresPrimos();
        metodoCalculoDivisores();
    }

    public void metodoEuclides() {
        System.out.println("Algoritmo de euclides:");
        System.out.println("Ingrese primer numero: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = scan.nextInt();
        long start1 = System.currentTimeMillis();
        System.out.println("MCD de" + num1 + "y" + num2 + " es: " + algoritmos.euclides(num1, num2));
        long end1 = System.currentTimeMillis();
        System.out.println("Duracion del metodo: "+ (end1 - start1) + " microsegundos");
    }

    public void metodoFactoresPrimos() {
        System.out.println("Factores primos:");
        System.out.println("Ingrese primer numero: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = scan.nextInt();
        long start1 = System.currentTimeMillis();
        algoritmos.factoresPrimos(num1);
        long end1 = System.currentTimeMillis();
        System.out.println("Duracion del metodo: "+ (end1 - start1) + " microsegundos");

        long start2 = System.currentTimeMillis();
        algoritmos.factoresPrimos(num2);
        long end2 = System.currentTimeMillis();
        System.out.println("Duracion del metodo: "+ (end2 - start2) + " microsegundos");
    }

    public void metodoCalculoDivisores() {
        System.out.println("Calculo de divisores:");
        System.out.println("Ingrese primer numero: ");
        int num1 = scan.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = scan.nextInt();
        long start1 = System.currentTimeMillis();
        algoritmos.calcDivisores(num1);
        long end1 = System.currentTimeMillis();
        System.out.println("Duracion del metodo: "+ (end1 - start1) + " microsegundos");

        long start2 = System.currentTimeMillis();
        algoritmos.calcDivisores(num2);
        long end2 = System.currentTimeMillis();
        System.out.println("Duracion del metodo: "+ (end2 - start2) + " microsegundos");
    }
}
