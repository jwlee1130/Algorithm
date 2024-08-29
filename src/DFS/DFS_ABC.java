package DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DFS_ABC {
	static boolean exit;
	static ArrayList<Integer>[] friends;
	static boolean[] visit;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("노드 입력> ");
		int n = sc.nextInt();
		System.out.print("엣지 갯수> ");
		int e = sc.nextInt();
		
		friends = new ArrayList[n];
		visit = new boolean[n];
		for(int i=0; i<friends.length; i++) {
			friends[i]=new ArrayList<Integer>(); 
		}

		
		for(int i=0; i<e; i++) {
			int a = sc.nextInt();
			int b= sc.nextInt();
			friends[a].add(b);
			friends[b].add(a);
		}
		int depth=1;

		for(int i=0; i<n;i++) { //노드가 끊길 수 있으니까 반복해주는거 
			visit[i]=true;    // 모든 노드 한번씩 돌아서 깊이 5인 노드를 찾을꺼라 1번 노드에서 2번노드
			dfs(i,depth);         // 확인했으면 true니까 다음 노드 확인할때 false로 바꾸고 시작 노드는 true로 시작
			visit[i]=false;
			if(exit) //한번이라도 count가 5가 되면 바로 1호출후 반환
				break;
		
		}
		if(exit)
			System.out.println("1");
		else
			System.out.println("0");
	}
	static void dfs(int n,int depth) {
		
		if(depth>=5) {
			exit=true;
             return;
        }
				
			for(int key :friends[n]) {
				if(visit[key]==false) {//방문 안한거면 dfs 재귀 호출로 없을때 까지 반복
					visit[key]=true;
                    dfs(key,depth+1);
                    visit[key]=false;
				}
			}
			
		
	}
	
}