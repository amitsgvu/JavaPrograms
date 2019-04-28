package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		List<Integer> count ;
		list.add("rabbit");
		list.add("bribe");
		list.add("dog");
	String str = null;
		char[] chararray = "bi".toCharArray();
		System.out.print("The given strings are: ");

			

				for (String st:list) {
					count= new ArrayList<Integer>();
					str=st;
					for (int j = 0; j < chararray.length; j++) {
					if (st.indexOf(chararray[j]) != -1) {
						
						count.add(st.indexOf(chararray[j]));
						if (st.indexOf(chararray[j]) != st.lastIndexOf(chararray[j])) {
							
							count.add(st.lastIndexOf(chararray[j]));
						}

					}

				}
			
				
				Collections.sort(count);
				for(Integer n:count) {
					System.out.print(str.charAt(n));
				}
				
				

			}

		}
}
