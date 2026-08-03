import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TopQuestion {
	public static void main(String[] args) {
		Person p1=new Person(101, "Azam", 26, "male", "IT", "Bengalore", 2019, 32000.0);
		Person p2=new Person(102, "Cq", 22, "female", "IT", "Bengalore", 2020, 45000.0);
		Person p3=new Person(103, "Konika", 23, "female", "Marketing", "Delhi", 2020, 40000.0);
		Person p4=new Person(104, "Saidul", 27, "male", "Marketing", "Patna", 2018, 29000.0);
		Person p5=new Person(105, "Praneet", 26, "male", "Finance", "Chandigarh", 2023, 38000.0);
		Person p6=new Person(106, "Govind", 25, "male", "Finance", "Haryana", 2025, 34000.0);
		Person p7=new Person(107, "Saif", 27, "male", "Sales", "Delhi", 2019, 41000.0);
		Person p8=new Person(108, "Anu", 26, "female", "Sales", "Odisa", 2022, 30000.0);
		Person p9=new Person(109, "Mike", 30, "male", "Security", "Bengalore", 2018, 19000.0);
		Person p10=new Person(1010, "Jhon", 31, "male", "Security", "Hydrabad", 2017, 21000.0);
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
		//list.stream().filter(e->e.gender.equals("male")).forEach(c->System.out.println(c));
		//Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
		//System.out.println(collect);
		//list.stream().map(e->e.department).distinct().forEach(n->System.out.println(n));
		/*
		 * Map<String, Double> ave =
		 * list.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.
		 * averagingInt(n->n.age))); System.out.println(ave);
		 */
		/*
		 * Optional<Person> salary =
		 * list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		 * System.out.println(salary);
		 */
		//list.stream().filter(e->e.dateOfJoining>2020).map(m->m.name).forEach(n->System.out.println(n));
		Map<String, Long> allEmp = list.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
		System.out.println(allEmp);
	}
}
class Person{
	 int id;
	 String name;
	 int age;
	 String gender;
	 String department;
	 String location;
	 int dateOfJoining;
	 double salary;
	public Person(int id, String name, int age, String gender, String department, String location, int dateOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.location = location;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", location=" + location + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary
				+ "]";
	}
}