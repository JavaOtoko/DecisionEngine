package io.zipcoder;

/**
 * Class named Person that will hold customers basic
 * information for loan decision.
 * Created by pcano on 10/16/15.
 */

public class Person {

    private String name;
    private String Address;
    private String lengthAtResidence;
    private double rent;
    private boolean isEmployed;
    private double salary;
    private double monthlyIncome;
    private String maritalStatus;
    private double disposableIncome;
    private int FICO;
    private String collateral;
    private String capital;


    public void setEmployed(boolean a){
        isEmployed = a;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getLengthAtResidence() {
        return lengthAtResidence;
    }

    public double getRent() {
        return rent;
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public double getSalary() {
        return salary;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public double getDisposableIncome() {
        return disposableIncome;
    }

    public int getFICO() {
        return FICO;
    }

    public String getCollateral() {
        return collateral;
    }

    public String getCapital() {
        return capital;
    }


}
