import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],i,a,b,flag=0;
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=Sc.nextInt();
        int min=9999;
        a=Sc.nextInt();
        b=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<b)
            {
                if(x[i]<min)
                  min=x[i];
                  flag=1;
            }
        }
        if(flag==1)
          System.out.println(min);
        else
          System.out.println(-1);
    }
}