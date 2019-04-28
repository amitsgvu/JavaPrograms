import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
	int[] array= {1,2,2,3,3,4};
		findDuplicatesUsingSorting(array);
	}

	private static void findDuplicatesUsingSorting(int[] inputArray) {
	Arrays.sort(inputArray);
	for(int x:inputArray)
System.out.print(x);
	System.out.println();
	int count=inputArray.length - 1;
	//122334
	//1,2,2,3,4
	int j=0;
		for (int i = 0; i <=count; i++) {
			if (inputArray[i] != inputArray[i + 1]) {
				inputArray[j]=inputArray[i];
				j++;
			}
			
			
		}
		inputArray[j]=inputArray[count];
		for(int x:inputArray)
			System.out.print(x);
				System.out.println();
	}
}