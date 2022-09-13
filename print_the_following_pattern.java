import java.util.Scanner;
class Main
{
    public static void main(String[] args)
   {
     Scanner Sc=new Scanner(System.in);
     int r,i,j;
     r=Sc.nextInt();
     for(i=r;i>=1;i--)
     {
       for(j=r;j>=1;j--)
       {
         System.out.print(j+" ");
       }
       System.out.println();
     }
   Sc.close();
   }
}