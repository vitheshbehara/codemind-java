import java.util.Scanner;
public class Main
{
  public static void findevenbetweeneven(int x[],int size)
  {
    int count=0;
    for(int i=1;i<size-1;i++)
    {
      if(x[i]%2==0 && x[i-1]%2==0 && x[i+1]%2==0)
       count++;
    }
    System.out.println(count);
  }
  public static void main(String args[])
  {
    int n,x[];
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    x=new int[n];
    for(int i=0;i<n;i++)
      x[i]=sc.nextInt();
    findevenbetweeneven(x,n);
  }
}