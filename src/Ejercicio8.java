import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int num = 1; num <= 50; num++) {
            boolean esPrimo = true;

            if (num >= 2) {
                for (int divisor = 2; divisor < num; divisor++) {
                    if (num % divisor == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                    } else {
                        esPrimo = false;
                    }
                    if (esPrimo) {
                        for (int divisor2 = 1; divisor2 <= num; divisor2++) {
                            int resto = num % divisor2;
                            System.out.println(num + "/" + divisor2 + " = " + num + " resto " + resto);
                        }
                    }
        }
    }

}