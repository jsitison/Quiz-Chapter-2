package pkgCore;

import java.lang.Math;

public class carFinance {

	private int TotalPrice;
	private int DownPayment;
	private int LengthOfLoan;
	private int InterestRate;
	
	public carFinance(int totalPrice, int downPayment, int interestRate, int lengthOfLoan) {
		super();
		TotalPrice = totalPrice;
		DownPayment = downPayment;
		InterestRate = interestRate;
		LengthOfLoan = lengthOfLoan;
	}
	public double carPayment() {
		int principal = this.TotalPrice - this.DownPayment;
		double interestRate = (double) this.InterestRate/100;
		double numerator = principal*(interestRate/12);
		double denomenator = 1-Math.pow(1+(interestRate/12),-this.LengthOfLoan);
		double payment = numerator/denomenator;
		return Math.round(payment*100)/(double)100;
		}

	public double totalInterestPaid() {
		int principal = this.TotalPrice - this.DownPayment;
		double interestRate = (double) this.InterestRate/100;
		double numerator = principal*(interestRate/12);
		double denomenator = 1-Math.pow(1+(interestRate/12),-this.LengthOfLoan);
		double total = this.LengthOfLoan*numerator/denomenator - principal;
		return Math.round(total*100)/(double)100;
	}
}
