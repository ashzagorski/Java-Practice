public class SalesTax {
  public static void main(String[] args) {
    int salesTax = 10;
    int duty = 5;
    HashMap<String, Boolean> myOrder = new HashMap<String, Boolean>();
    myOrder.put("Book", 12.95);
    myBooks.put("CD", 14.99);
    myBooks.put("TimeIn", true);
    myBooks.put("Chocolate Bar", 0.85);


    if (price <= 0) {
      System.out.println("Please provide item price that is over $0");
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
