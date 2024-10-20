import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] list = new ArrayList[n+1];
        int[] degree = new int[n+1];

        for(int i=1; i<=n; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            list[from].add(to);
            degree[to]++;

        }

        List<Integer> sortList = sort(list,degree );

        if(sortList.size() == n){
            StringBuilder sb = new StringBuilder();
            for(int sort : sortList){
                sb.append(sort).append(" ");
            }
            System.out.println(sb.toString());

        }else{
            System.out.println("Cycle");
        }


    }


    private static ArrayList<Integer> sort(ArrayList<Integer>[] list, int[] degree) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=1; i<list.length; i++){
            if(degree[i]==0) {
                queue.offer(i);
                res.add(i);
            }
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();

            for(int adj : list[cur]){
                if(--degree[adj]==0) {
                    queue.offer(adj);
                    res.add(adj);
                }
            }


        }

        return res;
    }

}