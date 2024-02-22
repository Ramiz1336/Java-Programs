import java.util.*;
public class Spiral_matrix {
	
	public static void spiral(int matrix[][]) {
		int startr=0 ;
		int startc=0;
		int endr=matrix.length-1;
		int endc = matrix[0].length-1;
		
		while(endr >= startr && endc>=startc) {
			for(int j=startc;j<=endc;j++) {
				System.out.print(matrix[startr][j]+" ");
			}
			for(int i=startr+1;i<=endr;i++) {
				System.out.print(matrix[i][endc]+" ");
			}
			for(int j=endc-1;j>=startc;j--) {
				if(startr== endr) {
					break;
				}
				System.out.print(matrix[endr][j]+" ");
			}
			for(int i=endr-1;i>=startr+1;i--) {
				if(startc == endc) {
					break;
				}
				System.out.print(matrix[i][startc]+" ");
			}
			
			
			startr++;
			startc++;
			endc--;
			endr--;
			
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, 
							{ 5, 6, 7 },
							{ 9, 10, 11},
							{ 13, 14, 15}};
		
		spiral(matrix);

	}

}
