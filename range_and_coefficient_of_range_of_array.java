import java.util.Scanner;

/**
 * 
 */

/**
 * @author nilesh
 *
 */
public class range_and_coefficient_of_range_of_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int min, max=0,n;
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter your array size");
        n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+ n +" array elemets");
        for(int i=0; i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        min=arr[0];
        for(int i=0; i<n;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        float range = max-min;
        float coeff = range/(max + min);
        System.out.println("Range of array is :"+range );
        System.out.println("coeffecient of array is :"+ coeff);
       
	}

}
