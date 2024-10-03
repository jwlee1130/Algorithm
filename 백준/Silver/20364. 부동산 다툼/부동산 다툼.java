import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinaryTreeTest<T> {

    private final int SIZE;
    private boolean[] visited;
    private int sucess;

    public BinaryTreeTest(int size) {
        SIZE = size;
        visited = new boolean[SIZE + 1];
        //1부터 저장 할꺼다.
    }

    public void setVisited(int num){
        visited[num]=true;
    }

    public int binarySearch(int duck){
        if(duck==1) return sucess;

        if(visited[duck]) {//방문했던거면 계속 저장
            sucess = duck;
        }
        binarySearch(duck/2);
        return sucess;
    }


    public void setSuccess() {
        sucess=0;
    }
}





public class Main{
    /*
                        재영(1)
            인영(2)             태휘(3)
        성준(4)  영준(5)       은미(6)  7
       8    9     10   11       12  13        14    15
    16 17 18 19 20 21 22 23   24 25  26 27  28 29  30  31
   32

    2의 n제곱 마다 2의n제곱수 만큼 자식 노드가 생기네


     */
    public static void main(String[] args) throws IOException {


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] str = in.readLine().split(" ");

        BinaryTreeTest<Integer> tree = new BinaryTreeTest<>(Integer.parseInt(str[0]) +1);
        //결국 해당하는 번호 부분 선택해서  내려가면 될거 같은데 구분 할 수 있을지
        //그게 안되면 bfs로 위에서 부터 해보기
        //꺼구 bfs 하고 방문했으면 boolean false로 반복문 끊기 일정 num이 오리설정한 번호보다 높으면 못가니까 컷
        //안됨


        //num/2 하면 홀수이든 짝수이든 다 부모 노드로 간다다.
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Integer.parseInt(str[1]);i++){
                int num = Integer.parseInt(in.readLine());
                int result = tree.binarySearch(num);
                
                if(result==0){
                    sb.append(result+"\n");
                    tree.setVisited(num);
                }else {
                    sb.append(result + "\n");
                }
                tree.setSuccess(); //success 초기화하고

        }

        System.out.println(sb.toString());
    }
}