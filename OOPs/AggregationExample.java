//University and Department
package OOPs;

class Department {
    private String name;
    public Department(String name) {
        this.name = name;
    }
    public void departmentDetails() {
        System.out.println("Department Name: "+name);
    }
}

class University {
    private String name;
    private Department department; //University has-a Department(Aggregation)
    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    public void universityDetails() {
        System.out.println("University Name: "+name);
        department.departmentDetails();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        University uni = new University("VIT University", dept);
        uni.universityDetails();
    }
}
