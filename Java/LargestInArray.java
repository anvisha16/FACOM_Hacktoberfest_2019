import java.util.Arrays;
public class LargestInArray{
	public static void main(String[] args){
        int arr[] = {1,2,4,5};
        System.out.println(largestInIntArray(arr));
	}

    private static int largestInIntArray(int arr[]) {
          Arrays.sort(arr);
          return arr[arr.length-1];
    }
}