import java.util.Scanner;
public class Main
{
  public static void findoddbetweenodd(int x[],int size)
  {
    int count=0;
    for(int i=1;i<size-1;i++)
    {
      if(x[i]%2==1 && x[i-1]%2==1 && x[i+1]%2==1)
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
    findoddbetweenodd(x,n);
  }
}
  