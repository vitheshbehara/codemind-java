import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,handshakes;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        handshakes=(n-1)*n/2;
          System.out.println(handshakes);
    }
}