public class typepromotion
{
    public static void main(String args[])
    {
        char a='a';
        char b='b';
        System.out.println(b-a);

        //char c=a-b;->gives error(int cannot convert to char)

         char d='f';
         short g=200;
        byte r=8;
        byte w=(byte)(d+g+r);
        System.out.println(w);

    }
}