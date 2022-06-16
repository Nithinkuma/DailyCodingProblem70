import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int tem ;
        int sum =sumOfDigits(n);
        if(sum<10){
            tem = 10 -sum;
            return (n*10)+tem;
        }
        else
            return -1;
    }

    private static int sumOfDigits(int n) {
        int sum=0;
        while (n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
}