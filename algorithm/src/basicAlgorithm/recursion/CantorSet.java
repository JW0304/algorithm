package basicAlgorithm.recursion;

/*
# 칸토어 집합
독일의 수학자 게오르크 칸토어(Georg Cantor)의 이름을 딴 집합으로,
재귀적인 구조를 가진 가장 대표적인 프랙탈(Fractal) 도형 중 하나임.
전체 선분을 3등분 한 뒤, 가운데 부분을 제거하는 과정을 반복해서 만듦.
 */

// https://www.acmicpc.net/problem/4779

public class CantorSet {
    public static void main(String[] args) {
        cantor(0);
        cantor(1);
        cantor(2);
        cantor(3);
    }

    public static void cantor(int n) {
        String line = "-";
        int num = (int) Math.pow(3, n); // 거듭제곱 (3 ** n)
        for (int i = 0; i < num; i++) {
            System.out.print(line);
        }
        System.out.println();
    }
}
