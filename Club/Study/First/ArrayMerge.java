import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {1, 0, 5};
        System.out.println(solution(arrA, arrB));
    }

    public static String solution(int[] arrA, int[] arrB) {
        int[] res = new int[arrA.length + arrB.length];

        for(int i=0; i<arrA.length; i++) res[i] = arrA[i];
        for(int i=0; i<arrB.length; i++) res[arrA.length+i] = arrB[i];
        Arrays.sort(res);

        return Arrays.toString(res);
    }
}
