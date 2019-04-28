package array;

public class FirstNonRepeatedElement {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;

				}

			}

			if (count == 1) {

				System.out.println("first non duplicate " + a[i]);
				break;
			}
		}
	}*/
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;

				}

			}

			if (count!= 1) {

				System.out.println("first  duplicate " + a[i]);
				break;
			}
		}
	}*/
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;

				}

			}

			if (count== 1) {

				System.out.println("Appears once " + a[i]);
				
			}
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = i+1; j < a.length; j++) {

				if (a[i] != a[j]) {
					count++;

				}

			}

			if (count== 0) {

				System.out.println("Appears first non  duplicate " + a[i]);
				
			}
		}
	}

}
