public class Main {
    public static void countMinSalary(Employee[] employees) {

        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff())
                    emp = employee;
            }
            System.out.println("Employee with the smallest salary is " + emp.getStaff() + " paid " + emp.getSalaryStaff() + " id "+ emp.getId());
        } else
            System.out.println("Array is empty");
    }

    public static void countMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() < employee.getSalaryStaff())
                    emp = employee;

            }
            System.out.println("Employee with the biggest salary is " + emp.getStaff() + " paid " + emp.getSalaryStaff() + " id "+ emp.getId());
        } else
            System.out.println("Array empty");
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public static int countStaffSalary (Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Monthly total expenses on salaries: " + sum);
        return sum;
    }

    public static void averageSalary (Employee[] employees){
        int sum = countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Average salary is " + average);
    }

    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Company's employees: " + employee.getStaff());
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("John Johnson", 55000, 1);
        employee[1] = new Employee("Sam Smith", 65000, 2);
        employee[2] = new Employee("Lia Lewis", 99000, 3);
        employee[3] = new Employee("Jared Wilson", 98000, 4);
        employee[4] = new Employee("Ann Aniston", 120000, 5);
        employee[5] = new Employee("Darren Wade", 130000, 1);
        employee[6] = new Employee("Meg Martins", 200000, 2);
        employee[7] = new Employee("Peter Dins", 33000, 3);
        employee[8] = new Employee("Brian Brown", 78000, 4);
        employee[9] = new Employee("Cal Colson", 140000, 5);

        typeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);
    }
}