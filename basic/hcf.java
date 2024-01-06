import java.util.Scanner;

public class hcf {
    private static int HCF(int a,int b)
    {
        int m = a,n=b;
        int k=0;
        for(int i=1;i<m || i<n;i++){
        if(m%i==0&&n%i==0)
        
            k=i;
        
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter a second number: ");
        int b = scanner.nextInt();

        int HCF =HCF(a,b);

        System.out.println("HCF of  numbers "+a+","+b+" is: " + HCF);
        scanner.close();
    }

}
