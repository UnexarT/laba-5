import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте количество чисел после запятой(не более 8):");
        int x = scn.nextInt();
        double z = Math.sqrt(2);
        switch (x){
            case 0:
                System.out.printf("z = %.0f", z);
                break;
            case 1:
                System.out.printf("z = %.1f", z);
                break;
            case 2:
                System.out.printf("z = %.2f", z);
                break;
            case 3:
                System.out.printf("z = %.3f", z);
                break;
            case 4:
                System.out.printf("z = %.4f", z);
                break;
            case 5:
                System.out.printf("z = %.5f", z);
                break;
            case 6:
                System.out.printf("z = %.6f", z);
                break;
            case 7:
                System.out.printf("z = %.7f", z);
                break;
            case 8:
                System.out.printf("z = %.8f", z);
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
