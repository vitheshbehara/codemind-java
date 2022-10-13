import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],even,c=0;
        n=Sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=Sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x[i]%2==0)
              c++;
        }
        if(c>=n)
          System.out.println("True");
        else
           System.out.println("False");
    }
}