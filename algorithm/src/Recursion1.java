public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(recursiveSum(3));
        System.out.println(recursiveSum(5));
    }

    public static int recursiveSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
