import java.util.*;
public  class fibonaccinumber
{
    public static void main(String args[])
    {
        int first=0;
        int second=1;
        int third=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=2;i<=n;i++)
        {
            third=first+second;
            first=second;
            second=third;
        }
        System.out.println(third);
    }
}