package interview;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMissingNumber(new int[] { 1, 2, 3, 4, 6 });
	}

	private static void printMissingNumber(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			//System.out.println("first element is" + array[i]);
			
			if(i!=array.length-1)
			{
			for (int j = 1 + i; j<=j; ++j) {

				if(array[j]-array[i]!=1) {
					System.out.println(array[j]);
					System.out.println(array[i]);
					System.out.println("missing number is"+ (array[i]+1));
					break;
				}
				break;
			}
		}

		}
	}

}
