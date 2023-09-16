package learning;

public class patternNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=3; i++) {
			for (int s=2; s>=i; s--) {
				System.out.print(" ");
			}
			for (int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for (int k=2; k<=i; k++) {
			System.out.print(k);
		}
			System.out.println("");
		}
	}

}
