import java.util.Scanner;

/**
 * 
 */

/**
 * @author nilesh
 *
 *find-frequency-number-array
 */
public class find_occurance_of_element_in_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int  count=0,max,n;
		    Scanner s= new Scanner(System.in);
		    System.out.println("Enter your array size");
	        n= s.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter "+ n +" array elemets");
	        for(int i=0; i<n;i++)
	        {
	            arr[i]=s.nextInt();
	        }
	        max= s.nextInt();
	        for(int j=0; j<n;j++)
	        {
	            if(arr[j]== max){
	                count =count+1;
	            }
	            
	            
	        }
      
	        if( max>0){
	        	System.out.println("count = "+count);
            }
            else {
            	System.out.println("Not found");
            }

	       
	}

}
