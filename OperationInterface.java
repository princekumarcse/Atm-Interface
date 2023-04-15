
 package atmmachine;


 public interface OperationInterface {
     public void CheckBalance();
     public void withdrawAmount(double withdrawAmount);
     public void Transfer();
     public void DepositeAmt(double depositeAmt);
     public void MiniStatement();
 }
