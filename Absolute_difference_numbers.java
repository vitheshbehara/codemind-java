import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,d,len,d1,d2;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        d=Sc.nextInt();
        len=(int)Math.log10(n)+1;
        
        d2=n%(int)Math.pow(10,d);
        d1=n/(int)Math.pow(10,len-d);
        
        System.out.println(Math.abs(d1-d2));
        Sc.close();
    }
}