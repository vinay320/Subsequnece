import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int nA = 1;
        int avgA = arr[0];
        int nB = 0;
        int avgB = 0;
        for (int i = 0; i < n-1; i++) {
            int newAvgA = ((nA * avgA) + arr[i+1]) / (nA + 1);
            int newAvgB = ((nB * avgB) + arr[i+1]) / (nB + 1);

            if ((newAvgA + avgB) > (newAvgB + avgA)) {
                nA = nA + 1;
                avgA = newAvgA;
            } else {
                nB = nB + 1;
                avgB = newAvgB;
            }

        }
        System.out.println(avgA + avgB);
    }
}
