package OOPs;

class Employee{
    //Date Security
    private int eid;
    private String ename;
    private int eage;
    private String eaddress;

    //Setter Methods
    public void setEid(int eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    public void setEage(int eage){
        this.eage = eage;
    }
    public void setEaddress(String eaddress){
        this.eaddress = eaddress;
    }

    //Getters Methods
    public int getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
    public int getEage(){
        return eage;
    }
    public String getEaddress(){
        return eaddress;
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        //calling setter methods
        e1.setEid(101);
        e1.setEname("Ritik Raj");
        e1.setEage(20);
        e1.setEaddress("Varanasi");

        //calling getter methods
        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
        System.out.println(e1.getEage());
        System.out.println(e1.getEaddress());
    }
}
