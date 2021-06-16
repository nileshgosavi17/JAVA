import java.util.Scanner;

/*
 * @author nilesh
 *
 */
public class union_and_intersection_of_two_sorted_arrays_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int n;
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter your array 1 size");
        n= s.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter "+ n +" elemets in array 1");
        for(int i=0; i<n;i++)
        {
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter your array 2 size");
        int m= s.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter "+ m +" elements in array 2");
        for(int j=0; j<m; j++)
        {
            arr2[j]=s.nextInt();
        }
        int union[]=new int[n+m];
                                                                  
      
        
	}

}
