import java.util.Scanner;
import static java.lang.Math.*;

public class zad4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте x:");
        double x = scn.nextDouble();
        if (x < -1){
            System.out.println("y("+x+") = " + abs(x-5));
        } else if (x > -1 & x < 2) {
            System.out.println("y("+x+") = " + cos(x-5)/abs(2*x+2));
        } else if (x>2){
            System.out.println("y("+x+") = " + exp(x+E));
        } else {
            System.out.println("y("+x+") = " + 100);
        }
    }
}
