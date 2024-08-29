package DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Graph{
	class Node{
		int data;//노드번호
		LinkedList<Node> adjacent; //인접노드를 리스트 저장
		boolean marked; //방문여부
		
		Node (int data){  //노드 생성자
			this.data= data; //값 생성
			this.marked = false; //방문 안했어
			adjacent = new LinkedList<Node>(); //일단 깡 생성
			
		}
	}

	Node[] nodes; //총 노드를 배열로 표현 
	Graph(int size){ //노드 갯수 받아서
		nodes = new Node[size];//총 노드수를 배열로 만들고
		for(int i =0; i<size; i++) { //각 배열안에 인접할 수 있는 것도
			nodes[i] = new Node(i); //총 배열에 번호 값으로 매김
		}
	}
	void addEdge(int i1, int i2) {
		Node n1 = nodes[i1]; // n1은 총노드 배열의 하나 = node 같다.
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) { //n1 근접 노드에 n2가 있디먄 추가해라
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)){
			n2.adjacent.add(n1);
		}
	
	}
	
	void dfs() {
		dfs(0);
	}
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked=true;
		
		while(!stack.isEmpty()) { //빌떄 까지 진행할꺼고
			Node node = stack.pop(); //스택에서 하나뺴고
			for(Node n : node.adjacent) { //해당 노드 안에 인접 노드 정보 있냐
				  //있으면 꺼내야겠지
				if(n.marked==false) {
					n.marked=true;
					stack.push(n);
				}
			}
			visit(node);
	
		}
		
	}
	
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		root.marked=true;
		
		
		while(!queue.isEmpty()) {
			Node n = queue.remove();
			for(Node node : n.adjacent) { //레벨 탐색이니까 싹다 조회하고 간다이
				if(node.marked==false) {
					node.marked=true;
					queue.add(node);
				}
			}
			visit(n);
			
		}
		
		
	}
	void dfsR(Node r) {
		Stack<Node> stack = new Stack<Node>();;

		if(r == null ) return;
		stack.push(r);
		r.marked=true;
		visit(r);

		while(!stack.isEmpty()) {
			Node rootNode = stack.pop();
			for(Node n : rootNode.adjacent) {
				if(n.marked==false) {
					dfsR(n);
				}
					
			}
		}
		
	}
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	void visit(Node n) {
		System.out.println(n.data+ " ");
	}
	
}
public class Search {

	public static void main(String[] args) {
			Graph g = new Graph(9);
			g.addEdge(0, 1);
			g.addEdge(1, 2);
			g.addEdge(1, 3);
			g.addEdge(2, 4);
			g.addEdge(2, 3);
			g.addEdge(3, 4);
			g.addEdge(3, 5);
			g.addEdge(5, 6);
			g.addEdge(5, 7);
			g.addEdge(6, 8);
			
			g.dfs(3);
			
			
	}

}
