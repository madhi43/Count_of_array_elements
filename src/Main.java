import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int result = count(A);
        System.out.println("Number of elements with at least 1 element greater than itself: " + result);
    }
    public static int count(int[] A) {
        int count = 0;
        int max = 0;
        for (int j : A) {
            max = Math.max(max, j);
        }
        for (int j : A) {
            if (j < max) {
                count++;
            }
        }
        return count;
    }
}
