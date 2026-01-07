package basicAlgorithm.recursion;

// https://www.acmicpc.net/problem/10870

import java.util.Scanner;

public class Fibonacci5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n >= 2) {
            return fib(n - 2) + fib(n - 1);
        } else {
            return -1;
        }
    }
}
