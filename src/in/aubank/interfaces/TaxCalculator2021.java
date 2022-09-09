package in.aubank.interfaces;

public class TaxCalculator2021 implements TaxCalculator {
	
	double taxableIncome;
	
	TaxCalculator2021(double taxableIncome){
		this.taxableIncome = taxableIncome;
	}
	
	@Override
	public double calculateTax() {
		return this.taxableIncome * 0.3;
	}

}
