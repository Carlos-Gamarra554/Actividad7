import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduce la anchura: ");
        int anchura = sc.nextInt();

        for (int a = 0; a < altura; a++){
            System.out.print("\n#");

            for (int b = 0; b < anchura; b++){
                System.out.print("#");
            }
        }

        //a)
        for(int c = 0; c < 5; c++){
            System.out.print("\n*");

            for(int d = 0; d < c; d++)
                System.out.print("*");
        }


        //b)
        for (int e = 0; e <= 5; e++) {
            for (int f = 0; f < e; f++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //c)
        int num;
        for (int g = 1; g <= 5; g++) {
            for (num = g; num > 1; num--)
                System.out.print(num + " ");
                System.out.println(num);
        }

        //d)
        for (int h = 1; h <= 5; h++) {
            for (int i = h; i < 5; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}