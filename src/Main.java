import java.util.Locale;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Николай Николаевич", 1, 50000);
        employees[1] = new Employee("Петров Александр Андреевич", 2, 60000);
        employees[2] = new Employee("Сидоров Анатолий Иванович", 3, 55000);
        employees[3] = new Employee("Кузнецова Анна Владимировна", 4, 70000);
        employees[4] = new Employee("Смирнов Алексей Дмитриевич", 5, 45000);
        employees[5] = new Employee("Васильева Екатерина Сергеевна", 1, 80000);
        employees[6] = new Employee("Николаев Николай Николаевич", 2, 75000);
        employees[7] = new Employee("Алексеева Ольга Ивановна", 3, 65000);
        employees[8] = new Employee("Дмитриев Дмитрий Дмитриевич", 4, 90000);
        employees[9] = new Employee("Федорова Мария Александровна", 5, 40000);


        printAllEmployees();


        System.out.println("Сумма затрат на зарплаты: " + calculateTotalSalary());


        Employee minSalaryEmployee = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);


        Employee maxSalaryEmployee = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        System.out.println("Средняя зарплата: " + calculateAverageSalary());

        printAllEmployeeNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        return calculateTotalSalary() / employees.length;
    }

    public static void printAllEmployeeNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}