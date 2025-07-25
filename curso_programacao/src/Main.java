import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // aula leitura de dados ---------------------------------------------------------------------------------------

//        int y = 31;
//        double x = 10.36775;
//
//        String nome = "Maria";
//        int idade = 18;
//        double salario = 4000.00;
//
//
//        System.out.println(y);
//        Locale.setDefault(Locale.US);
//        System.out.println(x);
//        System.out.printf("%.2f%n", x);
//
//        System.out.println("Resultado " + x + " metros");
//        System.out.printf("Resultado %.2f metros%n", x);
//
//        System.out.printf("%s tem %d anos e recebe R$%.2f de renda%n", nome, idade, salario);
//        -------------------------------------------------------------------------------------------------------------
//        AULA ENTRADA DE DADOS
        Locale.setDefault(Locale.US); // PARA DOUBLE
        Scanner sc = new Scanner(System.in);
//        DOUBLE ----------------
//        double x;
//        x = sc.nextDouble();
//        System.out.println(x);

//        TEXTO SEM ESPAÇOS --------------
//        String x;
//        x = sc.next();
//        System.out.println(x);

//        INTEIRO ----------------
//        int x;
//        x = sc.nextInt();
//        System.out.println(x);


//        CHAR ----------------
//        char x;
//        x = sc.next().charAt(0);
//        System.out.println(x);
//        sc.close();

//        VÁRIOS TIPOS ----------------
//        String x;
//        int y;
//        double z;
//        System.out.println("Digite uma string");
//        x = sc.next();
//        System.out.println("Digite um inteiro");
//        y = sc.nextInt();
//        System.out.println("Digite um double");
//        z = sc.nextDouble();
//
//        System.out.printf("x = %s, y = %d, z = %.2f%n", x, y, z);
//        int x;
//        String a, b, c;
//
//        x = sc.nextInt();
//        a = sc.nextLine();
//        b = sc.nextLine();
//        c = sc.nextLine();
//
//        System.out.println("Dados digitados");
//        System.out.println(x);
//        System.out.println(a);
//        System.out.println(b);;
//        System.out.println(c);

//        FUNÇÕES MATEMÁTICAS------------------------------------------------------------------------------------------

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double A, B, C;

//        RAIZ QUADRADA
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " é " + A);
        System.out.println("Raiz quadrada de " + y + " é " + B);
        System.out.println("Raiz quadrada de " + z + " é " + C);

//        Elevado
        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(z, 3.0);

        System.out.println(x + " elevado a " + y + " é igual a " + A);
        System.out.println(y + " elevado ao quadrado é igual a " + B);
        System.out.println(z + " elevado ao cubo é igual a " + C);

//        ABSOLUTO
        A = Math.abs(x);
        B = Math.abs(y);
        C = Math.abs(z);

        System.out.println("O valor absoluto de " + x + " é igual a " + A);
        System.out.println("O valor absoluto de " + y + " é igual a " + B);
        System.out.println("O valor absoluto de " + z + " é igual a " + C);
    }
}