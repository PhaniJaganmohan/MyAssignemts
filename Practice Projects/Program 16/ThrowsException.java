package www.jagan.learning;

public class ThrowsException
{
  static void testing() throws ArithmeticException
  {  
    System.out.println("Inside check function");
    throw new ArithmeticException("demo");
  }

  public static void main(String args[])
  {
    try
    {
      testing();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" + e);
    }
  }
}