import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    static int[] numbers = new int[10];
    static int[] test  = new int[10];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");

        for(int i=0; i<10; i++){
            test[i] = Integer.parseInt(str[i]);
        }
        dice1(0);
        System.out.println(count);
    }

    public static void dice1(int cnt){

        if(cnt==10) {
            int sum =0;
            for(int i=0; i<10; i++){
                if(i>=2){
                    if(numbers[i]==numbers[i-1] && numbers[i]==numbers[i-2]){
                        return;
                    }
                }
                if(numbers[i]==test[i]){
                    sum++;
                }
            }
            if(sum>=5)
                count++;
            return;

        }
        for(int i=1; i<=5; i++) { //1~5 반복
            numbers[cnt] =i;  //현자리에 선택한 수 저장
            dice1(cnt+1);// 다음자리의 수 뽑기
        }

    }



}
