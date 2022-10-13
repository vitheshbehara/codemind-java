import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int tracks,sectors,blocks,maximumcapacity;
        Scanner Sc=new Scanner(System.in);
        tracks=Sc.nextInt();
        sectors=Sc.nextInt();
        blocks=Sc.nextInt();
        
        maximumcapacity=(tracks*sectors*blocks*512)*2;
          System.out.println(maximumcapacity/1024+"KB");
    }
}