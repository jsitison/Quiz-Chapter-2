package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.carFinance;

public class carFinanceTest {
	@Test
	public void TestCarFinance() {
		carFinance car = new carFinance(35000, 0, 10, 60);

		double carPayment = car.carPayment();
		double totalInterestPaid = car.totalInterestPaid();
		
		double actualPayment = 743.65;
		double actualInterestPaid = 9618.79;

		if (carPayment != actualPayment || totalInterestPaid != actualInterestPaid) {			
			if (carPayment != actualPayment) {
				if (totalInterestPaid != actualInterestPaid) {
					fail("both failed");
				} else {
					fail("carPayment failed");
				}
			} else {
				fail("totalInterestPaid failed");
			}
		}
	}
}
