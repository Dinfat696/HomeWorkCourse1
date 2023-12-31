package HomeWorkCourse1.CourseWork1.medium;


public class Main {
    public static void addEmployee(Employee[] employee, Employee newEmployee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
                break;
            }
        }
    }

    public static void listOfEmployees(Employee[] employee, int department) {
        System.out.println("List of all employees by department");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment()) {
                System.out.println("Full Name is: " + employee[i].getName() + ", salary is: " +
                        employee[i].getSalary() + ", id is: " + employee[i].getId());
            }
        }
        System.out.println();
    }

    public static void monthlySalaryExpenses(Employee[] employee, int department) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment()) {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты по отделу в месяц составляет " + sum);
        System.out.println();
    }

    public static void minSalary(Employee[] employee, int department) {
        int min = Integer.MAX_VALUE;
        String employeeWithMinSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment() && employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                employeeWithMinSalary = employee[i].getName();
            }
        }
        System.out.println("Сумма минимальной зарплаты по отделу в месяц составляет " + min +
                " и это сотрудник " + employeeWithMinSalary);
        System.out.println();
    }

    public static void maxSalary(Employee[] employee, int department) {
        int max = Integer.MIN_VALUE;
        String employeeWithMaxSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment() && employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                employeeWithMaxSalary = employee[i].getName();
            }
        }
        System.out.println("Сумма максимальной зарплаты по отделу в месяц составляет " + max +
                " и это сотрудник " + employeeWithMaxSalary);
        System.out.println();
    }


    //        4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    public static void averageSalary(Employee[] employee, int department) {
        float sum = 0;
        float average = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment()) {
                sum = sum + employee[i].getSalary();
            }
            average = sum / employee.length;
        }
        System.out.println("Средняя сумма затрат на зарплаты по отделу в месяц составляет " + average);
        System.out.println();
    }


    //    5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void salaryIndexing(Employee[] employee, int department, int salaryIndex) {
        int employeeSalary;
        String employeeName;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && department == employee[i].getDepartment()) {
                employee[i].setSalary((employee[i].getSalary() + (employee[i].getSalary() * salaryIndex) / 100));
                employeeSalary = employee[i].getSalary();
                employeeName = employee[i].getName();
                System.out.println("Зарплата сотрудника " + employeeName + " после индексации равно "
                        + employeeSalary);
            }
        }
        System.out.println();
    }


    // 1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void employeesWithSalaryLessThenNumber(Employee[] employee, int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < number) {
                System.out.println("Зарплата сотрудников с номером " + employee[i].getId() + ", именем։ " +
                        employee[i].getName() + ", зарплатой: " + employee[i].getSalary()
                        + " меньше чем данное число " + number);
            }
        }
        System.out.println();
    }


    //2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void employeesWithSalaryMoreThenNumber(Employee[] employee, int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= number) {
                System.out.println("Зарплата сотрудников с номером " + employee[i].getId() + ", именем։ " +
                        employee[i].getName() + ", зарплатой: " + employee[i].getSalary()
                        + " больше или равно чем данное число " + number);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        addEmployee(employee, new Employee("Иванов Иван Иванович 1", 1, 50000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 2", 2, 60000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 3", 3, 10000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 4", 4, 80000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 5", 5, 90000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 6", 1, 20000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 7", 2, 30000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 8", 3, 40000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 9", 4, 70000));
        addEmployee(employee, new Employee("Иванов Иван Иванович 10", 5, 100000));


        listOfEmployees(employee, 1);

        monthlySalaryExpenses(employee, 2);

        minSalary(employee, 3);

        maxSalary(employee, 4);

        averageSalary(employee, 5);

        salaryIndexing(employee, 2, 100);

        employeesWithSalaryLessThenNumber(employee, 50000);

        employeesWithSalaryMoreThenNumber(employee, 50000);
    }
}