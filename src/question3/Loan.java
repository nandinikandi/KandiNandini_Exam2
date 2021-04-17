/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 * @author Nandini Kandi
 *
 */
public class Loan {

    private double loanAmount;
    private double annualInterestRate;
    private double time;

    public Loan(double loanAmount, double annualInterestRate, double time) {

        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.time = time;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double emiCalculation() {
        annualInterestRate = annualInterestRate / (12 * 100);
        time = time * 12;
        double emi = (loanAmount * annualInterestRate * Math.pow(1 + annualInterestRate, time)) / (Math.pow(1 + annualInterestRate, time) - 1);
        return emi;
    }

    @Override
    public String toString() {
        return "LoanAmount = " + loanAmount + ", AnnualInterestRate = " + annualInterestRate + ", time = " + time
                + "\nEMI = " + emiCalculation();
    }

}
