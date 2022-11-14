import static java.lang.Math.*;

public class zad3 {
    public static void main(String[] args) {
        for (double x = -3; x <= 3; x += 0.5){
            if (x >= 1){
                System.out.println("f("+x+") = " + (tan(x)+sin(x)));
            } else {
                System.out.println("f("+x+") = " + (5*x*x - 3));
            }
        }
    }
}


