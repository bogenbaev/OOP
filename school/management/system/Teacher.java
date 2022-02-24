package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    public int getId(int id){
        return id;
    }

    public String getName(String name){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }



    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public int getSalary() {
        return salary;
    }
}
