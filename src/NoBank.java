import javax.print.attribute.IntegerSyntax;

public class NoBank implements RBIInterface{

    private Integer account;
    private String pwd;

    public NoBank(Integer account,String pwd) {

        this.account=account;
        this.pwd = pwd;
    }


    public String depositmoney(int account, String pwd, double amount) {
        return null;
    }

    public double checkbalance(int account, String pwd) {
        return 0;
    }
}
