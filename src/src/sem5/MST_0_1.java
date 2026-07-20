package sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MST_0_1{
	
	static HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			map.put(i,  new ArrayList<>());
		}
		for(int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		System.out.print(prims());
	}
	
	public static int prims() {
		PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.cost - y.cost);
		pq.add(new Pair(1,0));
		HashSet<Integer> visited = new HashSet<>();
		int sum=0;
		while (!pq.isEmpty()) {
			// 1. remove
			Pair rp = pq.remove();
			// 2. Ignore if already visited
			if (visited.contains(rp.vtx)) continue;
			// 3. Mark visited
			visited.add(rp.vtx);
			// 4. Self Work
			sum+=rp.cost;
			// 5. Add unvisited nbrs
			for(int nbrs=1; nbrs<=map.size(); nbrs++) {
				if (!visited.contains(nbrs)) {
					int cost = 0;
					if (map.get(rp.vtx).contains(nbrs)) {
						cost++;
					}
					pq.add(new Pair(nbrs, cost));
				}
			}
			
		}
		
		return sum;
	}
	static class Pair{
		int vtx;
		int cost;
		public Pair(int vtx, int cost) {
			this.cost = cost;
			this.vtx = vtx;
		}
	}

}