import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,a=0,b=1,c,found=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                found=1;
                break;
            }
        a=b;
        b=c;
        c=a+b;
        }
        if(found==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}