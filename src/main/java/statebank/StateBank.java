
package statebank;

public class StateBank {
    
    public void depositeMoney(Client x, int money){
        int deposite = x.getDeposite();
        deposite = deposite + money;
        x.setDeposite(deposite);
    }
    public void withdrawMoney(Client x, int money){
        int deposite = x.getDeposite();
        if(deposite > money){
            deposite = deposite - money;
            x.setDeposite(deposite);
            System.out.print("\nWithDraw Successful");
            System.out.print("\nAmount Withdrawn: " + money);
            System.out.print("\nAvailable Balance: " + deposite);
        }else{
            System.out.print("\nInsufficient Balance");
        }
    }
    public static void main(String[] args){
        StateBank sb = new StateBank();
        Client salim = new Client();
        
        salim.setId(1);
        salim.setName("Salim Hossain");
        salim.setMobile(5757);
        salim.setDeposite(0);
        salim.setAddress("Mirpur 12");
        
//        System.out.print(salim.getDeposite());
        sb.depositeMoney(salim, 60000);
        System.out.print("\nAmount: " + salim.getDeposite());
    }
}
