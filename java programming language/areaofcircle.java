import java.util.*;
public class areaofcircle{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter radius");
        float r =obj.nextFloat();
        float area=3.14f*r*r;
        System.out.println(area);
    }
}