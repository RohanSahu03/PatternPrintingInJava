import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter: ");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int x=n;
		int y=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(j==1||j==n) {
					System.out.print(x+" ");
					
				}
				else {
					System.out.print(y+" ");
					
				}
				
			}
			x--;
			y++;
			System.out.println();
		}
	}

}
