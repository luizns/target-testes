package exercicio02;

import java.util.Scanner;

public class Fibonacci {
    public static long fibonacci(int n) {
        int i = 1;
        int j = 0;
        int t;
        for (int k = 1; k <= n; k++) {
            t = i + j;
            i = j;
            j = t;
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean result = false;
        for (int i = 0; i < N; i++) {
            if (fibonacci(i) == N) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("O número " + N + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + N + " não pertence a sequência de Fibonacci.");
        }
        sc.close();
    }

}
