import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i,n;
        double sum=0.0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+(1/(double)i);
            
        }
        System.out.format("%.2f",sum);
    }
}