package exam.init;

import exam.base.OrgUnit;

public class School extends OrgUnit {
    private double balance;
    private String logging = "";

    public School(int code, String name) {
        super(code, name);
    }

    public double getBalance() {
        return balance;
    }

    public void earn(double amount) {
        balance += amount;
        logging += "earn(" + amount + ")";
    }

    public void spend(double amount) {
        balance -= amount;
        logging += "spend(" + amount + ")";
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    @Override
    public String getLog() {
        return logging;
    }

    @Override
    public void clearLog() {
        logging = "";
    }

}
