

public class Person {
	private int age;
	private String name;
	private String job;
	
	
	public static void main(String[] args) {
		int new_age; 
		
		Person person1 = new Person();
		Person person2 = new Person(37, "david");
		
		System.out.printf("Age: %d Name: %s Job: %s\r\n", person1.getAge(), person1.getName(), person1.getJob() );
		System.out.printf("Age: %d Name: %s Job: %s\r\n", person2.getAge(), person2.getName(), person2.getJob() );

		person1.setAge(44);
		person1.setName("Adama");
		person1.setJob("Admeral");
		
		System.out.printf("Age: %d Name: %s Work: %s\r\n", person1.getAge(), person1.getName(), person1.getJob() );
		
	}

	public Person() {
		this.age = 0;
		this.name = "";
		this.job = "";		
	}
	
	public Person(int new_age, String new_name ) {
		this.age = new_age;
		this.name = new_name;
		this.job = "";
	}
	
	public Person(int new_age, String new_name, String new_job ) {
		this.age = new_age;
		this.name = new_name;
		this.job = new_job;
	}
	
	public void setAge(int new_age) {
		this.age = new_age;
	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
	
	public void setJob(String new_job) {
		this.job = new_job;
	}
 	
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
}
