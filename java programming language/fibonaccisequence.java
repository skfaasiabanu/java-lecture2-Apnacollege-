import java.util.*;
public class fibonaccisequence
{
    public static void main(String args[])
    {

        int first=0;
        int second=1;
        int third=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter terms");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {    System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
    
    }
}
