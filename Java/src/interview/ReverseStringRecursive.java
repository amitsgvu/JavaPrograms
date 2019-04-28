package interview;

public class ReverseStringRecursive {
	String reverse = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringRecursive rsr = new ReverseStringRecursive();
		String blogName = "amit sharm";
		;
		System.out.println("Reverse of java2blog is:" + rsr.recursiveReverse(blogName));

	}

	private String recursiveReverse(String orig) {

		// TODO Auto-generated method stub
		if (orig.length() == 1) {
			reverse = reverse + orig;
		}

		else {

			reverse = reverse + Character.toString(orig.charAt(orig.length() - 1));

			recursiveReverse(orig.substring(0, orig.length() - 1));
		}

		return reverse;

	}

}
