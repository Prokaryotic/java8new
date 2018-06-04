package modle;

/**
 * @author lijunxue
 * @create 2018-04-29 23:01
 **/
public class TPeople {
    String name;
    int age;
    double salary;
    Status status;
    public  enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
    public TPeople(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public TPeople(String name, int age, double salary, Status status) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name : "+name+" age : "+age+"  salary : "+salary;
    }




}
