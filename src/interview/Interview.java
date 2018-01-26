package interview;
import java.util.Arrays;

public class Interview {
	public static void main(String[] arg) {
		int orginal=123;
		int reverse=0;
		int rem;
		
		int[] arr= {1,5,6,3,2,4};
		
		String n="kal";
		int n1=n.length()-1;
		StringBuffer rev=new StringBuffer();
		for (int i = 1; i <= n.length(); i++) {
			
				rev.append(n.charAt(n1));
				n1--;
			
		}
		System.out.println(rev);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		while(orginal !=0) {
			rem=orginal % 10;
			reverse= reverse*10+rem;
			orginal= orginal/10;
		}
		System.out.println("Reverse = "+reverse);
		
	}
}
