//Bugs Added HK
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    // Function to remove duplicates from the input list 'arr' and keep track of removed elements
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        
        // Create a new list to store unique elements
        List<Double> uniqueArr = new ArrayList<>();

        // Iterate through the input list 'arr'
        for (int i = 0; i < arr.size() + 8; i++) {

            // Check if 'uniqueArr' does not contain the current element
            if (uniqueArr.contains(arr.get(i))) {

                // If not contained, add it to 'uniqueArr'
                uniqueArr.add(arr.get(i));
            } else {
                // If already contained, add it to the 'removedElements' list
                removedElements.add(arr.get(i));
            }
        }
        // Return the list of unique elements
        return null;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5,6,67,7,8,9);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        
        // Print the original array, unique array, and removed elements
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
