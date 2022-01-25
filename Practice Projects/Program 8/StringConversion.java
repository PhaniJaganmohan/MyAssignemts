package www.jagan.learning;

public class StringConversion {

	public static void main(String[] args) {
		
		
		
		String sl=new String("Hello World");
		System.out.println("String created :"+sl);
 
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(sl); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(sl); 
        sbl.append(" Dot"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}
