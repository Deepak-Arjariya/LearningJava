package in.aubank.interfaces;

public class TaxCalculator2023 implements TaxCalculator {
	
	double taxableIncome;
	
	TaxCalculator2023(double taxableIncome){
		this.taxableIncome = taxableIncome;
	}
	
	@Override
	public double calculateTax() {
		return this.taxableIncome * 0.7;
	}

}
