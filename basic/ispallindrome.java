import java.util.*;
public class ispallindrome {
    static boolean ispal(int x)
    {
        String str= Integer.toString(x);
        int left=0,right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(ispal(a));;
        sc.close();
    }
}
