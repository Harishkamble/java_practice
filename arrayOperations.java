package learning;
import java.util.Scanner;

public class arrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner one=new Scanner(System.in);
//		int[] arr = new int[5];
		for(int i=0; i<=4; i++) {
			int arr=one.nextInt();
		}
		int [] arr = new int [] {25, 11, 7, 75, 56};  
        int min = arr[0];    
        for (int i = 0; i < arr.length; i++) {    
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
	}

}
