class Student {
    String name;
    int roll_no;

    Student() {
    }

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

class Test extends Student {
    int test1, test2;

    Test() {
    }

    Test(String name, int roll_no) {
        super(name, roll_no);
    }

    Test(String name, int roll_no, int test1, int test2) {
        super(name, roll_no);
        this.test1 = test1;
        this.test2 = test2;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getRoll_no() {
        return super.getRoll_no();
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setRoll_no(int roll_no) {
        super.setRoll_no(roll_no);
    }
}

interface Sports {
    double sport_wt = 0;

    void put_wt();
}

class Result extends Test implements Sports {

    Result() {
    }

    Result(String name, int roll_no, int test1, int test2) {
        super(name, roll_no, test1, test2);
    }

    @Override
    public void put_wt() {
        System.out.println(sport_wt);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Result result = new Result("A", -1, 90, 87);
        result.put_wt();
    }
}
