package atmmachine;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements OperationInterface {

    ATM atm = new ATM();
    Map<Double, String> ministmt = new HashMap<>();

    public void CheckBalance() {
        System.out.println("Available Balance :" + atm.getBalance() + "\n");
    }

    public void withdrawAmount(double withdrawAmount) {
        ministmt.put(withdrawAmount, " Amount Withdraw");
        if (withdrawAmount < atm.getBalance()) {
            System.out.println("Collect Cash " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            CheckBalance();
            System.out.println();
        } else {
            System.out.println("Don't Have Suffiecient Balance !! \n");
        }
    }

    public void Transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Receipent's Name:  ");
        String receipent = sc.nextLine();
        System.out.print("\nEnter amount to transfer: ");
        double amount = sc.nextFloat();
        if (amount < atm.getBalance()) {
            atm.setBalance(atm.getBalance() - amount);
            System.out.println(amount+" Rs Transfered Successfully ");
            CheckBalance();
        }else{
            System.out.println("You Don't have Sufficient Balance");
        }
    }

    public void DepositeAmt(double depositeAmt) {
        ministmt.put(depositeAmt, " Amount Deposited");
        System.out.println(depositeAmt + " Deposited Successfully !!");
        atm.setBalance(atm.getBalance() + depositeAmt);
        CheckBalance();
        System.out.println();
    }

    public void MiniStatement() {
        for (Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
            System.out.println();
        }
    }
}
