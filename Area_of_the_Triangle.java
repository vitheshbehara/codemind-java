import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c;
        float s,Area;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        
        s=(float)(a+b+c)/2;
        
        Area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.format("%.2f",Area);
    }
}