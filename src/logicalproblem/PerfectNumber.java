package logicalproblem;

public class PerfectNumber
{
    public static void main(String args[])

{       int n =28;

      int mod;
      int add=0;
  for(int i=1;i<=n-1;i++)

{       mod=n%i;

     if( mod==0)
{
           add= add+i;
}
}
if(add==n)
{
  System.out.println(n+"  this is a perfect number") ;
}
else
{
System.out.println(n+"  this is not a perfect number") ;

}

}
}


