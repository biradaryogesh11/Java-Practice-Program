package logicalproblem;

public class HcfLcm 
{
     public static void main(String args[])
     {
    	 int HCF=1;
    	 int n1=12;
    	 int n2=16;
    	 int n3=20;
    	 for(int i=1;i<=n1;i++)
    	 {
    		 int a=n1%i;
    		 int b=n2%i;
    		 int c=n3%i;
    		 if(a==0&&b==0&&c==0)
    		 {
    			 HCF=i;
    		 }
    		 
    	 }
    	 System.out.println(HCF);
    	 int LCM=(n1*n2*n3)/HCF;
    	 System.out.println(LCM);
     }
}
