package non_recursion;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) 
	{
		 int  number[] = {9,3,4,2,8,7,2,3,4};
		System.out.println("Unsortes list= "+Arrays.toString(number));
		
		int leng=number.length;
		//System.out.println("Length of arrays = "+leng);
		
		for (int i = 0; i < leng; i++) {
			int index=0;
			int smallest=number[i];
			//System.out.println("Smallest number = "+smallest);
			for (int j = i; j < leng; j++) {
				System.out.println("is smaller = "+number[j]);
				if (number[j]<smallest) {
					System.out.println("samllest found "+number[j] +" < " +smallest);
		
					smallest=number[j];
					index=j;
					
					int temp=number[i];
					number[i]=smallest;
					number[index]=temp;
					
					System.out.println("temp = "+temp);
					System.out.println("number["+i+"] = "+number[i]);
					System.out.println("number["+index+"] = "+number[index]);
					System.out.println(Arrays.toString(number));
					System.out.println("==================================================================");
				}
			
			}
		
			
			
		}
		System.out.println("sorted list = "+Arrays.toString(number));
	}
		
	
}
