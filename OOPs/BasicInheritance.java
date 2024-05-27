package OOPs;

//ParentClass/ BaseClass/ SuperClass
class person{
    public String name;
    public String address;
    public int age;
}
//ChildClass/ DerivedClass/ SubClass
class StudentExample extends person{
    public int marks;
    public String grade;

    //Constructor
    StudentExample(String name, String address, int age, int marks, String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp(){
        System.out.println("Name is    :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is     :: "+age);
        System.out.println("Marks is   :: "+marks);
        System.out.println("Grade is   :: "+grade);
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        StudentExample s1 = new StudentExample("Ritik Raj","Varanasi",20,71,"A");
        s1.disp();
    }
}
