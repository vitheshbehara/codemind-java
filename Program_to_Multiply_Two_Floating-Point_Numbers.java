import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float a,b,p;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextFloat();
        b=Sc.nextFloat();
        p=a*b;
        System.out.format("%.2f",p);
    }
}