import java.util.*;
public class staircase_search {
	
	public static boolean find(int matrix[][],int key) {
		int row=matrix.length-1;
		int col=0;
		while(col<matrix.length&& row>=0) {
			if(matrix[row][col]==key) {
				System.out.println("found key at"+row +" "+col);
				return true;
			}
			else if(key>matrix[row][col]) {
				col++;
			}
			else {
				row--;
			}
		}
		System.out.println("key not found");
		return false;
	}

	public static void main(String[] args) {
		
		int[][] matrix = { { 10, 20, 30,40 }, 
				{ 15, 25, 35,45 },
				{ 27, 28, 37, 48},
				{32,33,39,50}};
		
		int key=33;
		
		boolean flag=find(matrix,key);

	}

}
