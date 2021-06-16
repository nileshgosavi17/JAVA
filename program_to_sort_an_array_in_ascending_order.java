import java.util.Scanner;


/**
 * @author nilesh
 *
 */
public class program_to_sort_an_array_in_ascending_order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int temp=0, n;
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter your array size");
        n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+ n +" array elemets");
        for(int i=0; i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0; i<n;i++)
        {
        	for(int j=0; j<n-i-1;j++)
	        {
	            if(arr[j+1]<arr[j]){
	            	temp =arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	            
	            
	        }
        	
        }
        for(int i=0; i<n;i++)
        {
        	System.out.println(arr[i]);
        	
        }

	}

}
