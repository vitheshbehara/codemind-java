import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i,n,x[],a,b,count=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=Sc.nextInt();
        a=Sc.nextInt();
        b=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
          System.out.println("-1");
    }
}