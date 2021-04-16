class A extends Thread{
    public void run(){
        for(int i=5; i>0; i--){
            if(i==1){
               // yield();
            }
            System.out.println("From thread A " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread{
    public void run(){
        for(int i=5; i>0; i--){
            System.out.println("From thread B " + i);
            if(i==3){
               // stop();
            }
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
     public void run()
    {
         for (int i=5;i>0;i--)
            {
            System.out.println("From thread C" +i);
            if(i==3)
                try
                    {
                    sleep(1000);    
                    }
                    catch(Exception e)
                 {

                    }
            }
    System.out.println("Exit from C");
     }
}

class MyThreads
{
    public static void main(String args[])
     {
            A a1=new A();
            B b1= new B();
             C c1=new C();
             c1.setPriority(Thread.MAX_PRIORITY);
             b1.setPriority(a1.getPriority() + 1);
             a1.setPriority(Thread.MIN_PRIORITY);
             //System.out.println("Starting thread A");
             a1.start();
            //System.out.println("Starting thread B");
             b1.start();
            //System.out.println("Starting thread C");
             c1.start();
             System.out.println("Exit Main");
     }
}