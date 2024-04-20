public class YesBank implements RBIInterface{

    private Integer account;
    private String pwd;

    public YesBank(Integer account,String pwd) {

        this.account=account;
        this.pwd = pwd;
    }
    public String depositmoney(int account, String pwd, double amount) {

        if (this.pwd == pwd) {
            return "Money added to you account";
        } else {
            return "Incorrect password";
        }
    }

    public double checkbalance(int account, String pwd) {
        return 0;
    }
}
