package assignment24;

public class Question5 {

	public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(ugly[p2] * 2, Math.min(ugly[p3] * 3, ugly[p5] * 5));

            if (nextUgly == ugly[p2] * 2)
                p2++;
            if (nextUgly == ugly[p3] * 3)
                p3++;
            if (nextUgly == ugly[p5] * 5)
                p5++;

            ugly[i] = nextUgly;
        }

        return ugly[n - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        int nthUgly = nthUglyNumber(n);
        System.out.println("The " + n + "th ugly number is: " + nthUgly);
    }
}
