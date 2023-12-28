import java.util.*;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = n;
        int ans = 0;

        while (cur > 0) {
            int d = cur % 10;
            if (d != 0) {
                ans += (n % d == 0) ? 1 : 0;
            }
            cur = cur / 10;
        }

        System.out.println(ans);
        sc.close();
    }
}
