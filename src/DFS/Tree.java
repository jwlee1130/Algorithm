package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
	static List<Integer>[] tree;
	static boolean[] visit;
	static int max;
	static Queue< List<Integer>> que = new LinkedList< List<Integer>>();
	static int[] distance;
 	
	public static int bfs(int node) {
		System.out.println("//////////////////// 시작 노드 : "+node);
		int depth =0;
		que.add(tree[node]); //시작 노드 넣고
		visit[node]=true; //방문 했으니 true하고
		int lastNode =node;
		while(!que.isEmpty()){//큐 빌떄까지 레츠고
			List<Integer> currenNode = que.remove();//1이니 [3,2] 들어갈꺼고
			for(int i=0; i<currenNode.size(); i+=2) { //i+2씩 해서  2  1  3 //사이즈2 0부터 시작
				System.out.println("현재 노드: "+currenNode +"든거 :" + que);
				if(visit[currenNode.get(i)-1]) { //방문을 했으면 통과하고 //tree[0] = currentNode
					System.out.println(currenNode.get(i)+"방문했어");
					continue;                  ///
				}
				//방문을 안했으면
				//큐에 인접노드 넣고 i+1로 깊이를 더한다.
				que.add(tree[currenNode.get(i)-1]);//넣었고 방문노드 넣는건데  -1 해줘야해함 0부터 시작이니
				lastNode = que.element().get(i)-1;
				visit[currenNode.get(i)-1]=true;//방문헀고
				distance[currenNode.get(i)-1]=distance[lastNode]+currenNode.get(i+1);// i+1이 거리 비용이니까 더할꺼다. 거리는 -1 안해줘도됨
				

			}  //que에 tree[3]의 정보가 들어갔는데 모든거 -1 해줘야했는데 깜박했다.
			
			for(int k=0; k<distance.length; k++) {
				System.out.println("for문 돌고 현재 노드: "+distance[k]);
			}
		
		}
		
		return depth;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("노드입력");
		int node = sc.nextInt();
		int x=0;
		distance = new int[node];
		
		tree = new ArrayList[node];
		for(int i=0; i<node; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		
		
		
		
		for(int i=0; i<node; i++) {
			int nodeNum =sc.nextInt();
			while(true) {
				x =sc.nextInt();
				if(x==-1)
					break;
				tree[nodeNum-1].add(x);
				
			}
		}
		visit = new boolean[node];

		bfs(1);
		
		int depth =0;
		for(int i=0; i<node;i++) { //모든 노드 시작부터 돌려서 다 체크해보기
			depth =bfs(i);

			if(max<depth) {
				max=depth;
			}
			
		}
		System.out.println("최종 거리 맥스 "+ max);
		
	}

}
