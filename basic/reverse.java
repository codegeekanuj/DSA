import java.util.*;
public class reverse {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        while(t!=0){
        int rem=t%10;
        rev=10*rev+rem;
        t=t/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
