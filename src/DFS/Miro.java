package DFS;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Miro {
	static Queue<Point> que = new LinkedList<Point>();
	static boolean[][] visit = new boolean[4][6];
	static int m;
	static int n;
	static int[][] array = {
           {1, 0, 1, 1, 1, 1},
           {1, 0, 1, 0, 1, 0},
           {1, 0, 1, 0, 1, 1},
           {1, 1, 1, 0, 1, 1}
       };
	
	public static void bfs(int a, int b) {
	      // 상, 하, 좌, 우
        int dx[] = {0, 0, -1, 1};
        int dy[] = {-1, 1, 0, 0};
        que.offer(new Point(a,b));//que에 x,y좌표 넣어주기
        visit[a][b]=true; //방문했으;
        
        
        
        while(!que.isEmpty()) { //que(0,0)들고 시작
        	Point currentPoint = que.poll(); //que안에 들은 좌표를 꺼내기
        	for(int i=0; i<4;i++) { //상하좌우 비교할꺼임
        		int nowX = currentPoint.x+dx[i];
        		int nowY = currentPoint.y+dy[i];
        		//이제 i 한번당 상하 좌우 할꺼고
        		// 그 좌표가 범위 안에 들었는지 0으로 막혀서 못지나가는지 이미 방문했던건지 확인
        		if(nowX<0 || nowY<0 || nowX>=m ||  nowY>=n) { //좌표가 마이너스이거나 좌표가 설정값을 벗어나면 안됨
        			continue; 
        		}
        		if(array[nowX][nowY]==0) {//우리가 갈 좌표가 0이면 길이 막힌거임
        			continue;
        		}
        		if(visit[nowX][nowY]) { //그럼 이제 갈 수 있는곳만 남았는데 거기서 방문 햇으면 못감
        			continue;
        		}
        		//그러면 이제 갈 수 있는곳
        		que.offer(new Point(nowX,nowY));
        		visit[nowX][nowY]=true;
        		//그러면 몇번 가서 봤는지 체크 해야하는데 갈 수 있는곳이 1이니 1씩 더하면 될듯
        		array[nowX][nowY]=array[currentPoint.x][currentPoint.y]+1;// 그전꺼에서 하나더씩 하면서 끝까지 가야한다.
        		
        	}
        	
        }

	}
	
	public static void main(String[] args) {
	       

		Scanner sc = new Scanner(System.in);
		
		System.out.println("마지막 칸");
		m=4;
		n=6;
		bfs(0,0);	
		
		System.out.println(array[m-1][n-1]-1);//벽이 1이 시작이라 -1 해주기
	       
	       
	       
	}

}
