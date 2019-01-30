public class HousePayment {
  public static void main(String[] args) {
    int houseLoan = 335000;
    int loanLength = 30;
    int interestRate = 4;
    int downPayment = 5;


    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid care loan.");
    };

     if (downPayment > houseLoan){
      System.out.println("Please provide valid down payment.");
    } else if (downPayment == houseLoan) {
      System.out.println("House being paid in full.");
    } else {
      int moneyDown = houseLoan * downPayment / 100;
      int remainingBalance = houseLoan - moneyDown;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
         
    };
  }
}