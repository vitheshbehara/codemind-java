import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],i,k,c=0;
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
          x[i]=Sc.nextInt();
        k=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==k)
            c++;
        }
        System.out.println(c);
    }
}