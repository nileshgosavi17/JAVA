public class reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.print(reverse(20));

	}
public static long reverse(int x) {
	long result =0;
	long remaining = Math.abs(x);
	while(remaining !=0) {
		result *=10;
		result +=remaining %10;
		remaining /=10;
	}
	return x<0 ? -result:result;
}
}

