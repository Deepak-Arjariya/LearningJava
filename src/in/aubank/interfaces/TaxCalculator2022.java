package in.aubank.interfaces;

public class TaxCalculator2022 implements TaxCalculator {
	
	double taxableIncome;
	
	TaxCalculator2022(double taxableIncome){
		this.taxableIncome = taxableIncome;
	}
	
	@Override
	public double calculateTax() {
		return this.taxableIncome * 0.1;
	}

}
