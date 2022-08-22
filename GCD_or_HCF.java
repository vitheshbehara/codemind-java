import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,i,min,gcd=0;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        if(a<b)
          min=a;
        else
          min=b;
          
        for(i=min;i>0;i=i-1)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}