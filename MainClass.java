package atmmachine;

import java.util.*;

public class MainClass {

    
    public static void main(String args[]) {
        AtmOperation op = new AtmOperation();

        int atmnumber = 123456789;
        int atmPin = 1234;
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE ");
        System.out.println("**********************");
        System.out.println();
        System.out.println("ENTER NAME: ");
        String name = in.nextLine();
        System.out.println("Enter ATM Number: ");
        int atmNumber = in.nextInt();
        System.out.println("******************");
        System.out.println("Enter ATM Pin: ");
        int Pin = in.nextInt();
        System.out.println("*********************");

        //atmnumber and pin validation
        if (atmNumber == atmnumber && Pin == atmPin) {
            System.out.println("Validation Successful ");
            System.out.println("*********************");
            while (true) {
                //users chioce

                System.out.println();
                System.out.println("#################\n");
                System.out.println("1.TRANSACTION HISTORY\n2.WITHDRAW\n3.DEPOSITE\n4.TRANSFER\n5.CHECK BALANCE\n6.QUIT\n");
                System.out.println("#################\n");
                System.out.println("Enter Your Choice");
                int choice = in.nextInt();
                //choice selection

                switch (choice) {
                    case 1: {
                        System.out.println("########################\n");
                        op.MiniStatement();

                        break;

                    }

                    case 2: {
                        System.out.println("########################\n");
                        System.out.println("Enter Amount to Withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);

                        break;
                    }
                    case 3: {
                        System.out.println("########################\n");
                        System.out.print("Enter Amount to Deposite: ");
                        double depositeAmount = in.nextDouble();//5000
                        op.DepositeAmt(depositeAmount);
                        break;
                    }
                    case 4: {
                        System.out.println("########################\n");
                        op.Transfer();
                     
                        break;
                    }
                    case 5: {
                        System.out.println("########################\n");
                        op.CheckBalance();

                        break;
                    }
                    case 6: {
                        System.out.println("########################\n");
                        System.out.print("Collect Your Card\n**Thank You**\nHave a Nice Day!\n");

                        System.exit(0);

                    }

                    default: {
                        System.out.println("########################\n");
                        System.out.println("Invalid Choise");

                        break;
                    }
                }
            }
        } else {
            System.out.println("######################\n");
            System.out.println("Incorrect AtmNumber or Pin\n ");
            System.exit(0);
        }
    }
}
