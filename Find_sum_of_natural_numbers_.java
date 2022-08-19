import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        for(i=1;i<=n;i++)
        {
           sum=sum+i; 
        }
        System.out.println(sum);
        Sc.close();
    }
}