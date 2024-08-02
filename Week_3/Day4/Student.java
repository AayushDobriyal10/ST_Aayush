package Week_3.Day4;

public class Student {
    int roll = 0;
    String name = "";
    int semester = 0;
    int year = 0;
    int branch_code = -1;
    Branch branches = new Branch();
    public Student(){}
    public Student(
        int roll,
        String name,
        int semester,
        int branch_code,
        int year
    )
    {
        this.roll = roll;
        this.name = name;
        this.semester = semester;
        this.branch_code = branch_code;
        this.year = year;

    }
}
