import java.util.*;

public class FindMaxMin {
  // Default constructor
  public FindMaxMin() {

  }

  // Getter method for finding the maximum integer in the array
  public int getMax(int[] arr) {
    // Arrays.sort sorts the array passed as the parameter from minimum to maximum
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  // Getter method for finding the minimum integer in the array
  public int getMin(int[] arr) {
    // Arrays.sort sorts the array passed as the parameter from minimum to maximum
    Arrays.sort(arr);
    return arr[0];
  }
}
