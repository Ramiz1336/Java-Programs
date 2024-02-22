
public class sumofidagonals {
	public static void sumofd( int matrix [][]) {
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			sum+=matrix[i][i];
			
			if(i!=matrix.length-1-i) {
				sum+=matrix[i][matrix.length-1-i];
			}
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, 
				{ 5, 6, 7 },
				{ 9, 10, 11}};
		 sumofd(matrix);
		

	}

}
