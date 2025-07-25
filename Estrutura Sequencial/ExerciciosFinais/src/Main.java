import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  ------------------------------------------  EXERCÍCIO 1  -----------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//
//        int a, b;
//        a = sc.nextInt();
//        b = sc.nextInt();
//
//        System.out.println("SOMA = " + (a + b));
//  ------------------------------------------  EXERCÍCIO 2  -----------------------------------------------------------
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double area, pi, raio;
//        pi = 3.14159;
//        raio = sc.nextDouble();
//        area = pi * Math.pow(raio, 2);
//        System.out.printf("A=%.4f%n", area);
//  ------------------------------------------  EXERCÍCIO 3  -----------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int D = sc.nextInt();
//
//        System.out.println(A * B - C * D);
//  ------------------------------------------  EXERCÍCIO 4  -----------------------------------------------------------
//        Locale.setDefault(Locale.US);
//        int n, hours;
//        double receiveValue, salary;
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        hours = sc.nextInt();
//        receiveValue = sc.nextDouble();
//        salary = hours * receiveValue;
//
//        System.out.println("NUMBER = " + n);
//        System.out.printf("SALARY = U$ %.2f", salary);

//  ------------------------------------------  EXERCÍCIO 5  -----------------------------------------------------------
//        Locale.setDefault(Locale.US);
//        int part1, qtt1, part2, qtt2;
//        double value1, value2, total;
//
//        Scanner sc = new Scanner(System.in);
//
//        part1 = sc.nextInt();
//        qtt1 = sc.nextInt();
//        value1 = sc.nextDouble();
//
//        part2 = sc.nextInt();
//        qtt2 = sc.nextInt();
//        value2 = sc.nextDouble();
//
//        total = qtt1 * value1 + qtt2 * value2;
//
//        System.out.printf("Valor total a pagar: R$%.2f", total);

//  ------------------------------------------  EXERCÍCIO 6  -----------------------------------------------------------
        double A, B, C;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triang = (A * C) / 2;
        double circ = 3.14159 * Math.pow(C, 2);
        double trapez = ((A + B) * C) / 2;
        double quadr = B * B;
        double retang = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triang);
        System.out.printf("CÍRCULO: %.3f%n", circ);
        System.out.printf("TRAPÉZIO: %.3f%n", trapez);
        System.out.printf("QUADRADO: %.3f%n", quadr);
        System.out.printf("RETÂNGULO: %.3f%n", retang);
    }
}