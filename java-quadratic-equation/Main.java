import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;
  
    public QuadraticEquation() {  
      double a = 0;
      double b = 0;
      double c = 0;
    }

    public QuadraticEquation(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    public double discriminant1 = Math.pow(b, 2) - 4 * a * c;
    public double discriminant2 = Math.pow(b, 2) - 4 * a * c;

    public double getA() {
    return a;
    }
    public double getB() {
    return b;
    }   
    public double getC() {
    return c;
    }

    public double getDiscriminant() {
      double discriminant = (b * 2) - (4 * a * c);
      return discriminant;
    }

    public double getRoot1() {
        double r1 = (-1*b) + Math.sqrt(discriminant1) / (2*a);
        return r1;

    }
    public double getRoot2() {
        double r2 = (-1*b) - Math.sqrt(discriminant2) / (2*a);
        return r2;
    }   

    public void setA(double newA1) {
        a = newA1;
    }
    public void setB(double newB1) {
        b = newB1;
    }
    public void setC(double newC1) {
        c = newC1;
    }
}

class TestEquation {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    QuadraticEquation Quadratic = new QuadraticEquation();



        System.out.println("Please enter the values of the following variables: ");

        System.out.println("a: ");
        Quadratic.setA(input.nextDouble());

        System.out.println("b: ");
        Quadratic.setB(input.nextDouble());

        System.out.println("c: ");
        Quadratic.setC(input.nextDouble());

        if (Quadratic.getDiscriminant() < 0) {

            System.out.println("The equation has the following roots:");

            System.out.println("The first one is " + Quadratic.getRoot1());

            System.out.println("The second one is " + Quadratic.getRoot2());


        }
        else if (Quadratic.getDiscriminant() == 0) { 
            System.out.println("The equation has one root:");

            System.out.println(Quadratic.getRoot1());

        }

        else {

        System.out.println("The equation has the no real roots");

        return;

        }
    }

}