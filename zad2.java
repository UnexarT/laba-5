import java.util.Scanner;
import static java.lang.Math.*;

public class zad2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите сравниваемые значения:");
        double a,b,c;
        a = abs(scn.nextDouble());
        b = abs(scn.nextDouble());
        c = abs(scn.nextDouble());
        System.out.println("Максимальное абсолютное значение: "+max(max(a,b),c));
        System.out.println("Минимальное абсолютное значение: "+min(min(a,b),c));
    }
}

