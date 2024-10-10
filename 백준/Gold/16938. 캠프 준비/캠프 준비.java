import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    static int[] numbers; //각 자리의 뽑힌 수를 저장  //
    static boolean[] isSelected;   //사용중인지 여부  //n만큼 필요
    static int N;
    static int solution;
    static int L;
    static int R;
    static int X;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        L = Integer.parseInt(str[1]);
        R = Integer.parseInt(str[2]);
        X  = Integer.parseInt(str[3]);

        numbers= new int[N];
        isSelected = new boolean[N];
        String[] level = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(level[i]);
        }

        Arrays.sort(numbers);
        makeSubSet(0);
        System.out.println(solution);


    }
    // 0     0   1   2

    private static void makeSubSet(int idx){
        if(idx==N) {
            int sum =0;
            int max = 0;
            int min = 0;
            int count =0;
            T : for(int i=0;i<N;i++) {
                if(isSelected[i]) {
                    if (count == 0) { //true인 경우만
                        min = numbers[i];
                        count++;
                        sum += numbers[i];
                        continue T;
                    }
                    if (min < numbers[i]) {
                        if(max<numbers[i]) max = numbers[i];
                    }else{
                        min=numbers[i];
                    }
                    sum+=numbers[i];
                    count++;
                }
            }
            if(L<=sum&& sum<=R && count>=2 && (max-min)>=X) {
                solution++;
            }
            return;
        }
        isSelected[idx] = true;
        makeSubSet(idx+1);
        isSelected[idx] = false;
        makeSubSet(idx+1);


    }


}
