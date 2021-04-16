class Box{
    int a,b;
    Box(int i, int j){
        a=i;
        b=j;
    }
    boolean equalTo(Box o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
class test {
    public static void main(String args[])
    {
    Box ob1 = new Box(100, 22);
    Box ob2 = new Box(100, 22);
    Box ob3 = new Box(-1, -1);
    System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
    System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}