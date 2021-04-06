package lesson6.work;

public class EmployeeByMonth implements Salary {
    @Override
    public int salary(int salary) {
        salary = salary * 8 * 22;
        System.out.printf("EmployeeByMonth has %s\n", salary);
        return salary;
    }
}
