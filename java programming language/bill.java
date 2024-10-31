import java.util.*;
public class bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=pencil+pen+eraser;
        System.out.println(bill);

       float total=pencil+pen+eraser;
        //gst
        float bill1=(total)+(0.18f*total);
        System.out.println(bill1);
    }
}