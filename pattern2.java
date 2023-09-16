package learning;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3; i++) 
		{
			for(int j=2; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print((char)(k+64));
			}
			for(int l=i-1; l>=1; l--) 
			{
				System.out.print((char)(l+64));
			}
			System.out.println("");
		}
		for (int i=2; i>=1; i--) 
		{
			for(int j=2; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) 
			{
				System.out.print((char)(k+64));
			}
			for(int l=i-1; l>=1; l--) 
			{
				System.out.print((char)(l+64));
			}
			System.out.println("");
		}	
	}

}
