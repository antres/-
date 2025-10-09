import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание четырех целых чисел A, B, C, D из конссоли
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        // Определение третьего по величине числа
        if (A > B)
            if (C > A)
                if (D > C)
                    out.print(C);
                else
                    if (D > A)
                        out.print(D);
                    else
                        out.print(A);
            else
                if (D > A)
                    out.print(A);
                else
                    if (B > D)
                        if (B > C)
                            out.print(B);
                        else
                            out.print(C);
                    else
                        if (C > D)
                            out.print(C);
                        else
                            out.print(D);
        else
            if (B > C)
                if (D > B)
                    out.print(B);
                else
                    if (A > C)
                        if (A > D)
                            out.print(A);
                        else
                            out.print(D);
                    else
                        if (D > C)
                            out.print(D);
                        else
                            out.print(C);
            else
                if (C > D)
                    if (B > D)
                        out.print(B);
                    else
                        out.print(D);
                else
                    out.print(C);
    }
}
