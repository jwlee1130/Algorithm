package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bfs {
	static boolean exit;
	static ArrayList<Integer>[] friends;
	static boolean[] visit;
	
	static Queue<Integer> que = new LinkedList<Integer>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(que);
		System.out.print("노드 입력> ");
		int n = sc.nextInt();
		System.out.print("엣지 갯수> ");
		int e = sc.nextInt();
		System.out.print("시작 노드 > ");
		int k = sc.nextInt();
		
		friends = new ArrayList[n];
		visit = new boolean[n];
		for(int i=0; i<friends.length; i++) {
			friends[i]=new ArrayList<Integer>(); 
		}

		for(int i=0; i<e; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			friends[a-1].add(b-1);
			friends[b-1].add(a-1);
		}
		
		
		bfs(k-1);//k번쨰 노드 시작
		
		
		
	}
	static void bfs(int node) {
		
		que.add(node);
		visit[node]=true; //시작 노드는 방문 했겠지
		while(!que.isEmpty()) {
			int no = que.remove();
			System.out.print(no+1+" -> ");
			for(int value :friends[no]) { //근접노드 확인할꺼임
				if(!visit[value]) { //visit[value] 인접 노드의 방문이 true면 패스하고 false면 접근
					que.add(value);//인접 노드를 que에 넣어라!
					visit[value]=true;// 방문했으니 true
			
				}
			
			}//다 넣으면
			//	그러면 이제 하나 꺼내야지 꺼내면서 그 해당 노드 의 인접을 넣어
			// 근데 큐니까 넣으면 알아서 뒤로 감 
			
		}
		
	}
	static void dfs(int n) {
		for(int key :friends[n]) {
			if(visit[key]==false) {//방문 안한거면 dfs 재귀 호출로 없을때 까지 반복
				visit[key]=true;
                   dfs(key);
                visit[key]=false;
			}
		}
			
		
	}
	
}