class parentClass {

    public void newMethod() {

        System.out.println("Hello from the parent class");

    }

}

class subClass extends parentClass {

    @Override

    public void newMethod() {

        System.out.println("Hello from the sub-class");

    }

}

class annotationExample {

    public static void main(String[] args) {

        subClass s1 = new subClass();

        s1.newMethod();

    }

}