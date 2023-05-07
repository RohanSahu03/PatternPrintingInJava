import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter: ");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n*2-1;j++) {
				
				if((i==j||i+j==n*2)&&(i<=n)) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.println();
			}

	}

	}}
