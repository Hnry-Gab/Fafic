package Atividade1;

public class psvm {
    
    public static void soma (int num1, int num2) {
        System.out.print("O resultado da soma foi: ");
        System.out.println( num1 + num2 );
    }
    public static void subt (int num1, int num2) {
        System.out.print("O resultado da subtração foi: ");
        System.out.println( num1 - num2 );
    }
    public static void mult (int num1, int num2) {
        System.out.print("O resultado da multiplicação foi: ");
        System.out.println( num1 * num2 );
    }
    public static void div (int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Não é possivel efetuar divisão com divisor 0");
        } else {
            System.out.print("O resultado da divisão foi: ");
            System.out.println( num1 / num2 );
        }
    }
    public static void exp (int num1, int num2) {
        System.out.print("O resultado da exponenciação foi: ");
        System.out.println( Math.pow(num1, num2) );
    }

    public static void main(String[] args) {

        String ope = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        switch (ope) {
            case "+" -> soma(num1, num2);
            case "-" -> subt(num1, num2);
            case "x" -> mult(num1, num2);
            case ":" -> div(num1, num2);
            case "^" -> exp(num1, num2);
        }
    }
}
