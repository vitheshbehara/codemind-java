import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int simpleintrest,p,t,r;
        Scanner Sc=new Scanner(System.in);
        p=Sc.nextInt();
        t=Sc.nextInt();
        r=Sc.nextInt();
        simpleintrest=(p*t*r)/100;
        System.out.println(simpleintrest);
    }
}