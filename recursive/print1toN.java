import java.util.*;

class Print1toN {
    private static void printN(int N, int[] a) {
        if (N == 0) {
            return;
        }

        a[N - 1] = N;

        printN(N - 1, a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        int[] a = new int[N];
        printN(N, a);

        System.out.print("Printed array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
