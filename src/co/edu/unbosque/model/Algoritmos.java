package co.edu.unbosque.model;

public class Algoritmos {
    public int euclides(int num1, int num2) {
        if (num1 == 0) return num2;
        return euclides(num2 % num1, num1);
    }

    public void calcDivisores(int num1) {
        int cont = 0;
        for (int i = 1; i <= num1 + 1; i++)
            if (num1 % i == 0) {
                System.out.println(i + " es divisor");
                cont += 1;
            }
        System.out.println("El numero " + num1 + " tiene " + cont + " divisores");
    }

    public void factoresPrimos(int num1) {
        int factor = 2;
        while (factor <= num1) {
            if (num1 % factor == 0) {
                System.out.println(factor);
                num1 /= factor;
            } else factor += 1;
        }
    }
}
