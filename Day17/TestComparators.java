import java.util.Arrays;
import java.util.Comparator; 
import java.util.List; 
 
 
// Comparator 1: sorting based on the string length. 
class myComparator implements Comparator<String>{ 
 
    // This compare() method contains our custom sorting logic.
    // It compares two String objects.
    public int compare(String s1 , String s2){ 
        
        // If the result is negative -> s1 comes before s2.
        // If the result is 0 -> both are considered equal.
        // If the result is positive -> s2 comes before s1.
        // Here we are comparing the LENGTH of both strings.
        // Smaller length comes first.
        return  s1.length() - s2.length(); 
    } 
} 
 
// Comparator 2: sorting of integer in descending order. 
class myComparator2 implements Comparator<Integer>{ 
 
    // This compare() method contains our custom sorting logic.
    // Here we want numbers in descending order.
    public int compare(Integer n1 , Integer n2){ 
        
        // n2 - n1 gives descending order.
        //
        // Example:
        // n1 = 3, n2 = 5
        // 5 - 3 = 2 (positive)
        // Therefore 5 comes before 3.
        return n2-n1; 
    } 
    
     
} 
 
public class TestComparators{ 
    public static void main(String [] args){ 
 
        // List of fruits
        List<String> fruits = Arrays.asList("banana","apple","date"); 
 
        // List of numbers
        List<Integer> numbers = Arrays.asList(4,3,5,1,2); 
 
        // Passing null means:
        // Use the natural/default sorting order of Strings.
        // Strings are sorted alphabetically in ascending order.
        fruits.sort(null); 
        
        System.out.println("sorting ascending alphabetically"); 
        System.out.println(fruits); 
 
        // Passing our custom Comparator object.
        // Now fruits will be sorted according to string length.
        fruits.sort(new myComparator()); 
        
        System.out.println("Sorting based on string length: "); 
        System.out.println(fruits); 
 
        // Instead of creating a separate Comparator class,
        // we can directly write the sorting logic using a lambda expression.
        //
        // (a,b) -> a.length() - b.length()
        // means:
        // Compare two strings based on their length.
        fruits.sort((a,b) -> a.length() - b.length());    
 
        // This also can be used:
        // Lambda expression instead of writing a separate Comparator class.
 
        // Passing null means:
        // Use the natural/default sorting order of Integers.
        // Integers are sorted in ascending order.
        numbers.sort(null); 
        
        System.out.println("by default sorting ascending order"); 
        System.out.println(numbers); 
 
        // Passing our custom Comparator object.
        // Now numbers will be sorted in descending order.
        numbers.sort(new myComparator2()); 
        
        System.out.println("List sorted in descending order using comparator"); 
        System.out.println(numbers); 
         
    } 
}