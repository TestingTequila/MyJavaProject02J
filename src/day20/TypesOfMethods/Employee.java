package day20.TypesOfMethods;

public class Employee
{
    //Whatever be the salary of an employee, we will provide valentine bonus of $1000

//    What action we want to perform
      public  double calculateSalary(double basicSalary, double travelAllowance)
      {
          double salary =basicSalary+ travelAllowance;
          System.out.println("Salary Without Bonus: " + salary);
          return salary;
      }

//    what we need to perform that action
      // basic Salary, travel allowance

//    Store those things [Variables[global Variable, parameter, local], Arrays] --> parameter

//    Am I going to use the output of this method into some further calculation or manipulations

//    if Yes --> use a return type --> We will use return type

//    if no  --> use void
}
