import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b;
        float Average;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        
        Average=(float)(a+b)/2;
        
        System.out.format("%.4f",Average);
    }
}