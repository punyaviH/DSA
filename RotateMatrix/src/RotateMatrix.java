import java.util.*;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = 0;
		int[][] a = null;
		for(int i = 0; i < m ; i++)
		{
			n = s.nextInt();
			a = new int[n][n];
			int p = n-1;
			for(int j = 0; j < n; j++)
			{
				for(int k = 0; k < n; k++)
				{
					a[k][p] = s.nextInt();
				}
				p--;
			}
			
			
			/*
			 * int[][] temp = new int[n][n]; int p = n-1; for(int j = 0; j < n; j++) {
			 * for(int k = 0; k < n; k++) { temp[k][p] = a[j][k]; } p--; }
			 */
			 
			for(int h = 0; h < n; h++)
			{
				for(int t = 0; t < n; t++)
				{
					System.out.print(a[h][t] + " ");
				}
				System.out.println();
			}
		}
	}

}
