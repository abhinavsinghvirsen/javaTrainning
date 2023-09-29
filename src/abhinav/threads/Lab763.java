package abhinav.threads;

public class Lab763 {

    public static void main(String[] args) {
         BankAccount bankAccount= new BankAccount();
         AccountThread accountThread= new AccountThread(bankAccount);
    }


}
  class BankAccount{

        private int bal=800;

        public void deposit(int amount){
            bal=bal+amount;

        }

      public synchronized void withdraw(int amount){


              if (bal > amount) {
                  bal = bal - amount;
                  System.out.println(bal + " after " + "deduction" + Thread.currentThread().getName());
              }

      }

      public int getBalance(){

         return bal;
      }


  }


  class AccountThread implements Runnable{

    BankAccount acc=null;


      AccountThread(BankAccount x){
            this.acc=x;

          Thread t1 = new Thread(this,"p1");
          Thread t2 = new Thread(this,"p2");
          t1.start();
          t2.start();

      }



      @Override
      public void run() {


          for (int i=0;i<5;i++){
              acc.withdraw(100);
              if(acc.getBalance()<0){
                  System.out.println("no amount ");
              }
          }



      }
  }




