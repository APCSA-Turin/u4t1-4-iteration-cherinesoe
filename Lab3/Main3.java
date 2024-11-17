public class Main3 {
  public static void main(String[] args) {
      // points (2, 5) and (4, 9)
      LinearEquation eq = new LinearEquation(2, 5, 4, 9);
      System.out.println("slope: " + eq.slope());
      System.out.println("y-int: " + eq.yIntercept());

      // different object using same points (2, 5) and (4, 9)
      LinearEquation eq2 = new LinearEquation(2, 5, 4, 9);
      System.out.println("y-int: " + eq2.yIntercept());
      System.out.println("slope: " + eq2.slope());
  }
}