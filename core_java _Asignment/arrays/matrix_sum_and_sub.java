package arrays;

public class matrix_sum_and_sub {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[][] a=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			
			int [][] b =
				{
						{9,8,7},
						{6,5,4},
						{3,2,1},
						
						
				};
			
			int[][] r =  new int[3][3];
			int[][] q =  new int[3][3];
		    
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					r[i][j]=0;
					q[i][j]=0;
					
					r[i][j] +=  a[i][j] + b[i][j];
					q[i][j] +=  a[i][j] - b[i][j];
					
				}
			}
			
		
		
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(r[i][j]);

				}
				System.out.println();
			}
		
			
			System.out.println("substrection");
			
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(q[i][j]);

				}
				System.out.println();
			}
	}

}
