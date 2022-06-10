import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Employee {

	private double salary;

	public Employee(int index, String name, double salary) {
        this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

}

// @Tag("fast")
public class StreamsTest {

    private static Employee[] arrayOfEmps = {
        new Employee(1, "Jeff Bezos", 100000.0), 
        new Employee(2, "Bill Gates", 200000.0), 
        new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    // Stream.of(arrayOfEmps);
    private static List<Employee> empList = Arrays.asList(arrayOfEmps);
    
    @Test
    public void whenStreamCount_thenGetElementCount() {
        // empList.stream();
        Long empCount = empList
          .stream()
          .filter(e -> e.getSalary() > 200000)
          .count();

        assertEquals(new Long(1), empCount);
    }
}
