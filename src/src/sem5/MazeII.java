package sem5;
import java.util.*;
public class MazeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] maze = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		int[] start = new int[2];
		start[0] = sc.nextInt();
		start[1] = sc.nextInt();
		int[] destination = new int[2];
		destination[0] = sc.nextInt();
		destination[1] = sc.nextInt();
//		Solution sol = new Solution();
		int ans = shortestDistance(maze, start, destination);
		System.out.println(ans);

	}
	
//	class Solution {
		public static int shortestDistance(int[][] maze, int[] start, int[] destination) {
			PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
			boolean[][] visited = new boolean[maze.length][maze[0].length];
			pq.add(new int[] {start[0], start[1], 0});
			int[] r = {-1,-1,0,0};
			int[] c = {0,0,-1,1};
			while(!pq.isEmpty()) {
				//1. remove 
				int[] curr = pq.poll();
				//2. ignore if already visited
				if(visited[curr[0]][curr[1]]) continue;
				//3. mark visited
				visited[curr[0]][curr[1]] = true;
				//4. self work
				if(curr[0] == destination[0] && curr[1] == destination[1]) {
					return curr[2];
				}
				//5. add unvisited nbrs
				for(int i=0; i<4; i++) {
					int x = curr[0];
					int y = curr[1];
					while (x+r[i] >= 0 && x+r[i] < maze.length && y+c[i] >= 0 && y+c[i] < maze[0].length && maze[x+r[i]][y+c[i]] == 0) {
						x += r[i];
						y += c[i];
						
					}
					if (x!=curr[0] || y!=curr[1]) {
						int cost = Math.abs(x-curr[0]) + Math.abs(y-curr[1]);
						pq.add(new int[] {x,y,curr[2] + cost} );
					}
				}
				
			}
			return -1;
		}
//	}

}