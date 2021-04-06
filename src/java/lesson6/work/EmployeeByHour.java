package lesson6.work;

public class EmployeeByHour implements Salary {

    @Override
    public int salary(int salary) {
        System.out.printf("EmployeeByHour has %s\n", salary);
        return salary;
    }
}
