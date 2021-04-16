class a{
    private final void fun(){
        System.out.println("A");
    }
}

public class B extends A{
    public void fun(){
        System.out.println("Clidlet");
    }
    public static void main(Static []args){
        a a1 = new a();
        a1.fun();
    }
}