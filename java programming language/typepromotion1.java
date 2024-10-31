public class typepromotion
{
    public static void main(String args[])
    {
        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
       // int g=a+b+c+d;->gives error because int cannot converted to double
        double e=a+b+c+d;
        System.out.println(e);

    }
}