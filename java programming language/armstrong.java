import java.util.*;
public class digitsofnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int sumOfDigits=0;
        int temp=n;
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            sumOfDigits+=(digit*digit*digit);
        }
        if(temp==sumOfDigits)
        {
            System.out.println("armstrong");

        }
        else
        {
            System.out.println(" not armstrong");
        }
    }
}