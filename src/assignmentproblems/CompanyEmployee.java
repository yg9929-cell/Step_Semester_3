package assignmentproblems;
class CompanyEmployee {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    CompanyEmployee(String name, double sal) {
        empName = name;
        salary = sal;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        new CompanyEmployee("Ravi", 40000);
        new CompanyEmployee("Priya", 45000);
        new CompanyEmployee("Arjun", 35000);

        CompanyEmployee.printCompanyInfo();
    }
}