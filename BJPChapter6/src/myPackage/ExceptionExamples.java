/**
 * 
 */
package myPackage;

/**
 * @author user
 *
 */
public class ExceptionExamples {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		JobType manager = new JobType("Manager", 6);
		Person employee = new Person("Bob Little", 47, manager);
		// Print the employee
		printPerson(employee);
	}
	// Method
	public static void printPerson(Person myPerson){
		System.out.println(myPerson.name + " is " + myPerson.age + " years old and works as a " + myPerson.job.jobName);
	}
}
// Class
class Person{
	String name;
	int age;
	JobType job;
	// Constructor
	Person(String name, int age, JobType job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
}
// Class
class JobType{
	String jobName;
	int salaryBand;
	// Constructor
	JobType(String jobName, int salaryBand){
		this.jobName = jobName;
		this.salaryBand = salaryBand;
	}
}
