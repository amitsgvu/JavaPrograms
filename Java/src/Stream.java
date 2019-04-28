import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Stream {
	public static void main(String[] args) {
		/*
		 * java.util.List<Integer> list = new ArrayList<>();
		 * 
		 * list.add(0); list.add(10); list.add(20); list.add(25);
		 */
		// System.out.println(list);
		// list.forEach(System.out::println);

		// list.stream().forEach(i->System.out.println(i));

		// java.util.List<Integer> list1 = list.stream().filter(i ->
		// i>=10).collect(Collectors.toList());
		// System.out.println(list1);

		// java.util.List<Integer> list1 =
		// list.stream().map(i->i*2).collect(Collectors.toList());
		// System.out.println(list1);

		// Set<Integer> set1 = list.stream().filter(i ->
		// i>=10).collect(Collectors.toSet());
		// System.out.println(set1);

		// Creating a TreeSet
		// Creating a TreeSet with a custom Comparator (Case Insensitive Order)
		// Creating a TreeSet with a custom Comparator (Descending Order)
		TreeSet<Employee> employees = new TreeSet<Employee>(Comparator.comparing(Employee::getName));

		// TreeSet uses the compareTo() method of the Employee class to compare two
		// employees and sort them
	//	employees = new ArrayList();

		/*employees.add(new Employee(1010, "Rajeev"));
		employees.add(new Employee(1011, "rajeev"));
		employees.add(new Employee(1005, "Sachin"));
		employees.add(new Employee(1008, "Chris"));
		employees.add(new Employee(1008, "Chris"));*/

		System.out.println("\nEmployees (sorted based on the supplied Comparator)");

	
		//System.out.println(employees);
		
		 TreeMap<Employee,String> map = new TreeMap<Employee, String>(new MyNameComp());
		  map.put(new Employee("david",50), "david");
		  map.put(new Employee("joy",20), "joy");
		  map.put(new Employee("abel",70), "abel");
		  map.put(new Employee("ruby",90), "ruby");
		//  Map<String, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	      //                  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		  

	}
}
 class MyNameComp implements Comparator<Employee>{

	 @Override
	 public int compare(Employee obj1, Employee obj2) {
	        
	  // Sort TreeMap based on name
	  //return obj1.getName().compareTo(obj2.getName());
	  
	  // Sort TreeMap based on salary
	  if(obj1.getId() > obj2.getId()) return 1;
	  else if(obj1.getId() < obj2.getId()) return -1;
	  else return 0;
	    } 
	}
	

class Employee implements  Comparator<Employee>{
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee( String name,int id) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	 @Override
	 public int compare(Employee obj1, Employee obj2) {
	        
	  // Sort TreeMap based on name
	  //return obj1.getName().compareTo(obj2.getName());
	  
	  // Sort TreeMap based on salary
	  Integer i1=obj1.getId();
	  Integer i2=obj2.getId();
	  return i1.compareTo(i2);
	    } 

	
	
	

}
