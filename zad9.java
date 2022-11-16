import java.util.Scanner;
import static java.lang.System.*;

public class zad9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(in);
        out.println("Здравствуйте! Мы проводим опрос от компании N");
        String x = "";
        while (!(x.equals("Да") || x.equals("да"))) {
            out.println("Пройдите опрос отвечая кратко и честно.");
            out.println("Всё ли понятно? Ответьте да или нет.");
            x = scn.next();
        }

        out.println("Отлично! Введите сначала имя потом фамилию.");
        String nm = scn.next();
        String fm = scn.next();
        out.println("Сколько вам лет?");
        int old = scn.nextInt();
        if (old > 25) {
            out.println("Вас устраивают рабочие условия?Да(1) или нет(2).");
            int ans1 = scn.nextInt();
            switch (ans1) {
                case 1:
                    out.println("Что вы считаете наилучшим в компании?");
                    String ans11 = scn.next();
                    out.println("Опоздали лы вы сегодня на работу?Да(1) или нет(2).");
                    int ans10 = scn.nextInt();
                    if (ans10 == 1) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) опоздал.");
                    } else if (ans10 == 2) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) пришел вовремя.");
                    } else {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) не умеет читать.");
                    }
                    out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) считает наилучшим в компании " + ans11);
                    break;
                case 2:
                    out.println("Что вас в них не устраивает?");
                    String ans12 = scn.next();
                    out.println("Опоздали лы вы сегодня на работу?Да(1) или нет(2).");
                    int ans13 = scn.nextInt();
                    if (ans13 == 1) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) опоздал");
                    } else if (ans13 == 2) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) пришел вовремя.");
                    } else {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) не умеет читать.");
                    }
                    out.println("Сотрудника " + fm + " " + nm + "(" + old + " лет/года) не устраивает в компании " + ans12);
                    break;
                default:
                    out.println("Некорректные данные");
            }
        } else {
            out.println("Желаете ли вы продолжить работу в нашей компании? Да(1) или нет(2)");
            int ans2 = scn.nextInt();
            switch (ans2) {
                case 1:
                    out.println("Опоздали лы вы сегодня на работу?Да(1) или нет(2).");
                    int ans10 = scn.nextInt();
                    out.println("Что вы считаете наилучшим в компании?");
                    String ans11 = scn.next();
                    if (ans10 == 1) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) опоздал.");
                    } else if (ans10 == 2) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) пришел вовремя.");
                    } else {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) не умеет читать.");
                    }
                    out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) считает наилучшим в компании " + ans11);
                    break;
                case 2:
                    out.println("Опоздали лы вы сегодня на работу?Да(1) или нет(2).");
                    int ans13 = scn.nextInt();
                    out.println("Что именно вас не устраивает в компании?");
                    String ans12 = scn.next();
                    if (ans13 == 1) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) опоздал.");
                    } else if (ans13 == 2) {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) пришел вовремя.");
                    } else {
                        out.println("Сотрудник " + fm + " " + nm + "(" + old + " лет/года) не умеет читать.");
                    }
                    out.println("Сотрудника " + fm + " " + nm + "(" + old + " лет/года) не устраивает в компании " + ans12);
                    break;
                default:
                    out.println("Некорректные данные");
            }
        }
    }
}

