import java.util.Arrays;
import java.util.Scanner;

public class TimeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        System.out.println(solution(num));
    }

    public static long solution(long num) {
        StringBuffer sb = new StringBuffer();
        char[] strNum =  Long.toString(num+1).toCharArray();

        for(int i=0; i<strNum.length; i++) {
            if(strNum[i] == '0') {
                strNum[i]++;
            }
            sb.append(strNum[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
