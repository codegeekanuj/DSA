import java.util.Scanner;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=0,ms=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    s=s+j;
                }
            }
            ms=ms+s;
        }
        System.out.println(ms);
        sc.close();
    }
}