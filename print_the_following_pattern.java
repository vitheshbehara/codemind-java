import java.util.Scanner;
class Main
{
    public static void main(String[] args)
   {
     Scanner Sc=new Scanner(System.in);
     int r,i,j;
     r=Sc.nextInt();
     for(i=1;i<=r;i++)
     {
       for(j=1;j<=r;j++)
       {
         System.out.print((char)(64+i)+" ");
       }
       System.out.println();
     }
   Sc.close();
   }
}