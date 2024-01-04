import java.util.Scanner;
import java.lang.Math;

public class armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int s = 0;
        int digits = (int)(Math.log10(t) + 1);

        while (t != 0) {
            int rem = t % 10;
            s = s + (int)Math.pow(rem, digits);
            t = t / 10;
        }

        if (s == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
		sc.close();
    }
}
