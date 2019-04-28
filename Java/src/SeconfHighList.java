import java.util.ArrayList;

public class SeconfHighList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(111);
		list.add(110);
		list.add(115);
		list.add(120);
		list.add(140);
		list.add(139);

		Integer max = list.get(0);// 111
		Integer secondMax = list.get(0);// 111

		for (Integer value : list) {

			if (value > max) {
				secondMax=max;
				max = value;
			
			}

			if (value !=max && value>secondMax) {
				secondMax = value;
			}

		}

		System.out.println("maximam" + max);
		System.out.println(" second maximam" + secondMax);

	}

}
