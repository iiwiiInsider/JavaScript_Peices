public class app {

	public static void main(String[] args) {

		int[] Values = { 3, 5, 2343 };

		System.out.println(Values[2]);

		int[][] grid = { { 3, 6, 19},{ 16, 0},{ 3, 9, 16, 90} };

		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);

		String[][] text = new String[2][3];
				
		text[0][1] = "Hello there";
		System.out.println(text[0][1]);
			
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
				}
				
				System.out.println();
				
			}
			
			String[][] words = new String[2][];
			
			System.out.println(words[0]);
			
			words[0] = new String[3];
			
			words[0][1] ="hi there";
			
			System.out.println(words[0][1]);
			
	}
}
