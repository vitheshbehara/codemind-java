import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,i,max,lcm;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        if(a>=b)
          max=a;
        else
          max=b;
          
        for(i=max; ;i=i+max)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(i);
    }
}