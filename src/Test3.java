import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String[] args) {
		
		int[] numbers = {23,4,5,67,1,45,89};
		Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	    System.out.println(secondHighestNumber);
	}

}
