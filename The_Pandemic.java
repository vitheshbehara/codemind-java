import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int h;
        Scanner Sc=new Scanner(System.in);
        h=Sc.nextInt();
        if(h<3)
          System.out.println(h-1);
        else
          System.out.println(2);
    }
}