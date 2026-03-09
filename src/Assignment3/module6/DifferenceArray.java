package Assignment3.module6;
public class DifferenceArray {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];

        diff[1] += 5;
        diff[4] -= 5;

        int[] arr = new int[n];
        arr[0] = diff[0];

        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + diff[i];
        }

        for(int num : arr)
            System.out.print(num + " ");
    }
}
