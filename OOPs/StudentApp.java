package OOPs;

class Student{
    //Data security
    private int rollNo;
    private String name;
    private String address;

    //Setter Methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Getter Methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();

        //Calling Setter Methods
        s1.setRollNo(18);
        s1.setName("Ritik Raj");
        s1.setAddress("Varanasi");

        //Calling Getter Methods
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
    }
}
