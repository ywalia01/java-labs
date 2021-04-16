interface Figure {
    void area(double dist1, double dist2);
}

class Rectangle implements Figure {
    @Override
    public void area(double dist1, double dist2) {
        System.out.println(dist1 * dist2);
    }
}

class Triangle implements Figure {
    @Override
    public void area(double dist1, double dist2) {
        System.out.println(0.5 * dist1 * dist2);
    }
}

public class InterfaceFigure {
    public static void main(String[] args) {
        Figure fig = new Rectangle();
        fig.area(3.14, 2.73);
        fig = new Triangle();
        fig.area(3.14, 2.73);
    }
}
