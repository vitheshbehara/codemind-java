import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,i,r;
        
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        
        i=(p*t*r)/100;
        System.out.println(i);
    }
}