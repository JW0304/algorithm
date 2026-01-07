package basicAlgorithm.recursion;

public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(recursiveSum(3));
        System.out.println(recursiveSum(5));
        System.out.println(recursiveSum(10));
    }

    public static int recursiveSum(int n) {
        // 종료 조건 (기본 케이스, Base Case라 함)
        if (n == 1) {
            return 1; // n이 1이 되면 메서드 종료
        }
        // 재귀 부분 (재귀 케이스, Recursive Case라 함)
        // n이 1이 아닌 경우, f(n-1) + n으로 재귀
        return recursiveSum(n - 1) + n;
    }
}
