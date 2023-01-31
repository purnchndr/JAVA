package practice;

public class Use {
	
	public static void ratInMaze(int[][] maze) {
		ratInMaze(maze, 0, 0);
	}
	
	public static void ratInMaze(int[][] maze, int row, int col) {
		if(row >= maze[0].length || col >= maze.length )
			return;
		if(maze[row][col] == 0)
			return;
		if(row == maze[0].length-1 && col >= maze.length-1) {
			System.out.println("Path found");
			return;
		}
		
		ratInMaze(maze, row+1, col);
		ratInMaze(maze, row, col+1);
		
	}
	
	private static void sum(int[] arr, int index) {
		if(index == arr.length)
			return;
		
		sum(arr,index+1);
		int sum = 0;
		for(int i= 0; i< arr.length;i++) {
			if(index  == i)
				continue;
			sum += arr[i];
		}
		arr[index] = sum;
		
	}
	
	
	public static void print(int[] arr) {
		for(int i : arr)
			System.out.print(i+", ");
		System.out.println();
	}

	public static void main(String[] args) {
//		int[][] maze = {{1,0,0},{1,1,1},{0,0,1}};
//		ratInMaze(maze);
		int[] arr = {1,2,3,4,5};
		print(arr);
		sum(arr,0);
		print(arr);

		
	}
}
