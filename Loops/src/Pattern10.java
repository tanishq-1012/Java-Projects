
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n =7;
		 
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 
				 if((j==0&&i>0)||
						 (i==0&&j<n/2)||
						 (j==n/2&&i>0)||
						 (i==n/2&&j<=n/2)) {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}

}
