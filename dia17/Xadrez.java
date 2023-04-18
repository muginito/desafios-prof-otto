package desafios.dia17;

import java.util.Arrays;

public class Xadrez {
	
	
	public static void main(String[] args) {
		int[][] grid = new int[8][8];
		int x = 2;
		int y = 2;
		grid[2][0] = 2;
		grid[2][2] = 1;
		grid[2][3] = 1;
		grid[2][4] = 2;
		grid[6][2] = 2;
		grid[7][2] = 2;
		int count = 0;

		
		//vertical
		for (int i = x - 1; i >= 0; i--) {
			if (grid[i][y] == 2) {
				count++;
				break;
			} else if (grid[i][y] == 1) break;
		}
		
		for (int i = x + 1; i < grid.length; i++) {
			if (grid[i][y] == 2) {
				count++;
				break;
			}else if (grid[i][y] == 1) break;
			
		}
		
		//horizontal
		for (int i = y + 1; i < grid.length; i++) {
			if (grid[x][i] == 2) {
				count++;
				break;
			} else if (grid[x][i] == 1) break;
		}
		
		for (int i = y - 1; i >= 0; i--) {
			if (grid[x][i] == 2) {
				count++;
				break;
			} else if (grid[x][i] == 1) break;
		}
		
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));	
		}
		
		System.out.println(count);
		
	}
}
