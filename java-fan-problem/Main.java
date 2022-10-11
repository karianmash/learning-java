class Fan {
  final int SLOW = 1;
  final int MEDIUM = 2;
  final int FAST = 3;

  public int speed = SLOW;
  public boolean on = false;
  public double radius = 5;
  public String color = new String("blue");

  public Fan() {

  }

  // fan on
  void fanOn() {
    on = true;
  }

  // fan off
  void fanOff() {
    on = false;
  }

  // sets fan speed
  void setSpeed(int speed) {
    this.speed = speed;
  }

  // sets custom radius
  double setRadius(double rad) {
    rad = radius;
    return rad;
  }

  // sets custom color
  void setColor(String colorType) {
    color = colorType;
  }

  // toString() method
  public String toString() {
    return ("Speed: " + speed + "\nRadius: " + radius + "\nColor: " + "\nOn: " + on);
  }
}

// test program
public class Main {
  public static void main(String[] args) {
    Fan fan1 = new Fan();
    fan1.setColor("green");
    fan1.setSpeed(2);
    fan1.setRadius(3.5);
    fan1.fanOff();
    System.out.println(fan1.toString());

  }
}
