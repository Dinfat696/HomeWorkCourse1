package HomeWorkCourse1.CourseWork1.hard;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeBook {

    private Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                break;
            }
        }
        System.out.println(newEmployee + " is successfully added");
    }


    public void listOfEmployees(int department) {
        System.out.println();
        System.out.println("List of all employees by department");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                System.out.println("Name: " + employees[i].getName() + ", salary: " +
                        employees[i].getSalary() + ", id: " + employees[i].getId());
            }
        }
        System.out.println();
    }

    public void monthlySalaryExpenses(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                sum = sum + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты по отделу в месяц составляет " + sum);
        System.out.println();
    }

    public void minSalary(int department) {
        int min = Integer.MAX_VALUE;
        String employeeWithMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment() && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeWithMinSalary = employees[i].getName();
            }
        }
        System.out.println("Сумма минимальной зарплаты по отделу в месяц составляет " + min +
                " и это сотрудник " + employeeWithMinSalary);
        System.out.println();
    }

    public void maxSalary(int department) {
        int max = Integer.MIN_VALUE;
        String employeeWithMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment() && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeWithMaxSalary = employees[i].getName();
            }
        }
        System.out.println("Сумма максимальной зарплаты по отделу в месяц составляет " + max +
                " и это сотрудник " + employeeWithMaxSalary);
        System.out.println();
    }

    public void averageSalary(int department) {
        float sum = 0;
        float average = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                sum = sum + employees[i].getSalary();
            }
            average = sum / employees.length;
        }
        System.out.println("Средняя сумма затрат на зарплаты по отделу в месяц составляет " + average);
        System.out.println();
    }

    public void salaryIndexing(int department, int salaryIndex) {
        int employeeSalary;
        String employeeName;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && department == employees[i].getDepartment()) {
                employees[i].setSalary((employees[i].getSalary() + (employees[i].getSalary() * salaryIndex) / 100));
                employeeSalary = employees[i].getSalary();
                employeeName = employees[i].getName();
                System.out.println("Зарплата сотрудника " + employeeName + " после индексации равно "
                        + employeeSalary);
            }
        }
        System.out.println();
    }

    public void employeesWithSalaryLessThenNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < number) {
                System.out.println("Зарплата сотрудников с номером " + employees[i].getId() + ", именем։ " +
                        employees[i].getName() + ", зарплатой: " + employees[i].getSalary()
                        + " меньше чем данное число " + number);
            }
        }
        System.out.println();
    }

    public void employeesWithSalaryMoreThenNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= number) {
                System.out.println("Зарплата сотрудников с номером " + employees[i].getId() + ", именем։ " +
                        employees[i].getName() + ", зарплатой: " + employees[i].getSalary()
                        + " больше или равно чем данное число " + number);
            }
        }
        System.out.println();
    }


    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == employeeId) {
                employees[i] = null;
                System.out.println("The employee with Id number " + employeeId + " is deleted");
            }
        }
    }


    public void changeEmployeeDepartment(String employee, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(employee)) {
                employees[i].setDepartment(department);
                changeEmployeeSalary(employee, salary);
            }
        }
        System.out.println("The employee " + employee + " department now is " + department +
                " and salary now is " + salary);
    }

    public void changeEmployeeSalary(String employee, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(employee)) {
                employees[i].setSalary(salary);
            }
        }
    }

    public void getAllEmployeesByDepartment() {
        System.out.println();
        System.out.println("Get all employees by departments");
        for (int i = 0; i < employees.length; i++) {
            Arrays.sort(employees, 0, employees.length, Comparator.comparing(Employee::getDepartment));
            System.out.println("Department: " + employees[i].getDepartment() +
                    ", Name: " + employees[i].getName());
        }
        System.out.println();
    }

    public String printDepartment() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append("Отдел " + i + ": ");
            for (int j = 0; j < employees.length; j++) {
                if (employees[j].getDepartment() == i) {
                    sb.append(employees[j].getName()).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}

