package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public Student(int id, String name, int grede){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }



    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return this.feesPaid;
    }
    public int getFeesTotal(){
        return this.feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

}
