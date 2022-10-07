import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int i,x[],n,sum=0,average,c=0;
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        average=sum/n;
        for(i=0;i<n;i++)
        {
          if(x[i]>=average)
            c++;
        }
        System.out.println(c);
    }
}