package DFS;

import java.util.Stack;
import java.util.Vector;

public class Dfs {

	 boolean[] vistor = new boolean[9];
	
	 int[][] graph = {{},{2,3,8},{1,6,8},{1,5},{5,7},{3,4,7},{2},{4,5},{1,2}}; 
	 
	 Stack<Integer> stack = new Stack<Integer>();
	 
	public Dfs() {
		//graph 1번부터 시작 시키기
		stack.push(1);
		// 1번 시작이니 true 만들기
		
		
		while(!stack.isEmpty()) {//1번 시작으로 stack이 비면 모든 노드 거친거
			
			int nodeIndex = stack.pop();//결국 하나씩 뺴서 근접 인덱스 확인할꺼임
			if (vistor[nodeIndex])continue;
			vistor[nodeIndex]=true;

			System.out.print(nodeIndex +" ==>" ); //경로 
			
			
			for (int LinkedNode :graph[nodeIndex]) { //graph[1]에 있는 2,3,8 근접 확인할꺼
				if(vistor[LinkedNode]==false) {  // 일단 접근해도 되는 노드인지 확인(boolean)으로
					stack.push(LinkedNode); // 접근 가능 노드면 stack에 밀어넣기
				}
					//접근 안하면 패스할꺼고 그러면 다시 위로 가서 팝업 하겠지
				//1.1-> 시작하면 1번 pop 2,3,8 true로 바꾸고 stack push(2 ,3, 8) 하겠지
				//2. 2,3,8 true 후  8번 꺼내고 근접 인덱스 1,2 true니까 패스 그후 다시 pop() 3번으로 꺼냄
				//3.2,3 true 에 3번 꺼내고 근접 인덱스 1,5 니까 1번패스 그후 5번 true 하고 넣음
				//4.2,5 이고 ,1,2,3,5,8 true 이고 5번 pop으로 빼고 3,4,7인데 3번 true고 나머지 false 이니 push로 넣음
				//5.2,3,4,7 이고 1,2,3,4,5,7,8 true 7뺌 4,5 ture 패스
				//6.2,3,4 이고 4 뺌 5,7 true 니까 패스
				//7.2,3 이고 3 뺌 1,5 true 니까패스
				//8.2 이고 2뺌 1,6,8,이니 6번 push
				//9.6이고 6번 pop하고  그러면 비니까 끝
				// pop 순서 대로 경로니까 예상 경로 1 ->8 ->3->5->7->4->S2->6
				
			}

			
			
			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new Dfs();
	}

}
