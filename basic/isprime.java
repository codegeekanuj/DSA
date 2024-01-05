import java.util.Scanner;
public class isprime {
    public class Solution {
        public static String isPrime(int num) {
            int i;
            if(num==1){
            return "NO";
            }
            for (i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return "NO";
                }
            }
            
            return "YES";
        }
        public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            int num =sc.nextInt();
            System.out.println(isPrime(num));
            sc.close();
        }
    }
    
}
