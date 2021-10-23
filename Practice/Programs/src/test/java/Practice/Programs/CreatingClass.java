package Practice.Programs;

//public class ClassName or Classname

class CreatingClass
{
  public static void main(String[] args)
  {
    int result;
    
    //Creating Calculator Object
    Calculator calc=new Calculator();
    //Calling Add() method
    result=calc.Add(12,18);
    
    //Creating PrintData Class Object
    PrintData pdata=new PrintData();
    //Calling print() method
    pdata.print(result);
  }
}

//Defining Class Calculator
class Calculator
{
  public int Add(int num1, int num2)
  {
    System.out.println("Calculator Class Started...");
    return num1 + num2;
  }
}

//Defining Class PrintData
class PrintData
{
  public void print(int value)
  {
    System.out.println("PrintData Class Started.. ");
    System.out.println(value);
  }
}