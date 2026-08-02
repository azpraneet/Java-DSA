import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



class EmpData{
	public static void main(String[] args) {
		List<Demo> emp=new ArrayList<Demo>();
		emp.add(new Demo(1, "Azam", 26, "male", "It", 2022, 30000.0));
		emp.add(new Demo(2, "Shweta", 22, "Female", "It", 2020, 35000.0));
		emp.add(new Demo(3, "Saidul", 27, "male", "Marketing", 2019, 40000.0));
		emp.add(new Demo(4, "Talib", 23, "male", "Finance", 2025,45000.0));
		emp.add(new Demo(5, "Ibran", 23, "male", "HR", 2024, 36000.0));
		emp.add(new Demo(6, "Anupa", 27, "Female", "Finance", 2020, 28000.0));
		emp.add(new Demo(7, "Praneet", 25, "male", "It", 2022, 25000.0));
		emp.add(new Demo(8, "Vinay", 26, "male", "sale", 2018, 18000.0));
		emp.add(new Demo(9, "Mike", 20, "male", "Security", 2025, 15000.0));
		emp.add(new Demo(10, "Konika", 24, "Female", "HR", 2022, 30000.0));
		emp.add(new Demo(11, "Surbhi", 27, "Female", "Marketing", 2021, 23000.0));
		emp.add(new Demo(12, "Rock", 29, "male", "Security", 2020, 16000.0));
		emp.add(new Demo(13, "Manish", 26, "male", "Marketing", 2018, 31000.0));
		emp.add(new Demo(14, "Mohan", 25, "male", "sale", 2023, 25000.0));
		emp.add(new Demo(15, "Anu", 27, "Female", "HR", 2021, 27000.0));
		
//		Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(e->e.gender,Collectors.counting()));
//		System.out.println(collect);
		emp.stream().map(d->d.department).distinct().forEach(e->System.out.println(e));;
	}
}
public class Demo {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	public Demo(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
}