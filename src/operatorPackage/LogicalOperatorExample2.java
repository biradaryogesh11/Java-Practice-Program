package operatorPackage;

public class LogicalOperatorExample2 {
	 public static void main(String args[])
	 {
		 // AND logical 
		 
	System.out.println((445<235)&&(453>456)&&(655<=544)); // f f f =f
	System.out.println((554>443)&&(555<=555)&&(439<6464));// t t t =T
	
	     // OR LOGICAL
	
	System.out.println((7575<6868)||(767>545));//  f t = T
	System.out.println((5446==4646)||(464>=4644)||(446>=232));// f f t = T
	
	    // Nor logical 
	
	System.out.println(!((445<235)&&(453>456)&&(655<=544)));
	System.out.println(!((554>443)&&(555<=555)&&(439<6464)));
	System.out.println(!((7575<6868)||(767>545)));
	System.out.println(!((5446==4646)||(464>=4644)||(446>=232)));
	  
	 // bitwaise logical
	// xor logical
	
	System.out.println(((445<235)^(453>456)^(655<=544))); //  f f f = f f= f
	System.out.println(((554>443)^(555<=555)^(439<6464))); // t t t = t f= t
	System.out.println(((7575<6868)^(767>545)));  //          f t =t
	System.out.println(((5446==4646)^(464>=4644)^(446>=232))); // f f t = f t =t
	
	 }
}
