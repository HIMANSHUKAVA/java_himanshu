package arrays;

public class matrix 
{
public static void main(String[] args) 
{
	
	int[][] r =  new int[3][3];

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
	
        
     
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 r[i][j]=0;
	         for(int k=0;k<3;k++)
	         {
	        	 r[i][j] += a[i][k] * b[k][j];
	         }
			 
			 
			 
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

}
}