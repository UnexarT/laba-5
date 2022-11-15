import java.util.Scanner;
import static java.lang.Math.*;

public class zad7_g {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте х в диапазоне [-4,4]:");
        double x = scn.nextDouble();
        if (x >4 || x < -4){
            System.out.println("Неверный х");
        } else if (x == -1){
            System.out.println("x не удовлетворяет ОДЗ");
        } else if (x <= 0) {
            System.out.println("g = "+pow(3*x*x-5,1/6f)/abs(1-x*x));
        } else {
            System.out.println("g = "+(1+cos(x))/(1+exp(2*x)));
        }
    }
}
