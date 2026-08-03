package in.azam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Data{
	public static void main(String[] args) {
		List<Demo> name = new ArrayList<Demo>();
		Demo d1 = new Demo(101, "Mike", 20, "male", "It", "Mumbai", 01/01/2020, 35000.0);
		Demo d2 = new Demo(102, "Jack", 22, "male", "Marketing", "Delhi", 23/01/2025, 45000.0);
		Demo d3 = new Demo(103, "Tom", 21, "male", "Sale", "Patna", 17/04/2020, 30000.0);
		Demo d4 = new Demo(104, "Rock", 25, "male", "Security", "Noida", 9/12/2024, 25000.0);
		Demo d5 = new Demo(105, "Din", 19, "male", "Hr", "Chennai", 10/07/2010, 33000.0);
		Demo d6 = new Demo(106, "Janney", 23, "female", "Hr", "Bangalore", 05/30/2021, 55000.0);
		Demo d7 = new Demo(107, "womini", 22, "female", "It", "hydrabad", 10/06/2025, 41000.0);
		Demo d8 = new Demo(108, "vendra", 26, "female", "Hr", "Gurgaon", 05/03/2026, 38000.0);
		
	List<Demo> list = Arrays.asList(d1,d2,d3,d4,d5,d6,d7,d8);
	/*
	 * Map<String, Long> collect =
	 * list.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()
	 * )); System.out.println(collect);
	 */
//		list.stream().map(e->e.deprtment).distinct().forEach(e->System.out.println(e));
	/*
	 * Map<String, Double> ave =
	 * list.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.
	 * averagingDouble(e->e.age))); System.out.println(ave);
	 */
	/*
	 * Optional<Demo> salaryMax =
	 * list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
	 * System.out.println(salaryMax);
	 */
//		list.stream().filter(e->e.dateOfJoining > 2024).map(n->n.name).forEach(p->System.out.println(p));
	/*
	 * Map<String, Long> count =
	 * list.stream().collect(Collectors.groupingBy(e->e.deprtment,Collectors.
	 * counting())); System.out.println(count);
	 */
	Map<String, Double> aveSalary = list.stream().collect(Collectors.groupingBy(e->e.deprtment,Collectors.averagingDouble(e->e.salary)));
	System.out.println(aveSalary);
	}
}

public class Demo {
	int id;
	String name;
	 int age;
	 String gender;
	 String deprtment;
	 String location;
	 int dateOfJoining;
	 double salary;
	public Demo(int id, String name, int age, String gender, String deprtment, String location, int dateOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deprtment = deprtment;
		this.location = location;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deprtment=" + deprtment
				+ ", location=" + location + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + "]";
	}
	
}
