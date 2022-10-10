import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int t,a,b,sum=0;
        Scanner Sc=new Scanner(System.in);
        t=Sc.nextInt();
        while(t>0)
        {
            a=Sc.nextInt();
            b=Sc.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
    }
}