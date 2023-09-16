package learning;

public class new1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3; i++) {
			for (int s=2; s>=i; s--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for (int j=i-1; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
