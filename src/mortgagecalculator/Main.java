package mortgagecalculator;


import java.util.Scanner;//this is a test to see if user input works


class Currency {
  public static void main(String[] args) {
    double interest, principal, timescompounded, years, sum;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type your interest rate:");
    interest = myObj.nextInt(); // interest

    System.out.println("Type your initial balance:");
    principal = myObj.nextInt(); //initial balance
    
    System.out.println("Type how it is compounded, if monthly type 12, if quarterly type 4:");
    timescompounded = myObj.nextInt(); //read user number of times compounded per year
    
    System.out.println("Type how many years it is compounded:");
    years = myObj.nextInt();
    //years compounded
    

    sum = principal * Math.pow((1 + ((interest/100) / timescompounded)),(timescompounded * years));      //equation for compound interest formula           
    System.out.println(+sum);
  }
  
} 