
public class reversecode {

	public static void main(String[] args) 
	{
		String name = "ABCD";
		String reverseStr = "";
		 
		for(int i= name.length()-1; i >=0; i--){
			reverseStr = reverseStr + name.charAt(i);
		}
		
		
		System.out.println("Reverse of given string: " + reverseStr);
	}
} 
	  
		
