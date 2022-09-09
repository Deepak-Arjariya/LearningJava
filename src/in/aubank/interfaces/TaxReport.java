package in.aubank.interfaces;

public class TaxReport {
	
	double taxableIncome;
	TaxCalculator calculator;
	
//	TaxReport(TaxCalculator calculator){
//		this.calculator = calculator;
//	}
	
	TaxReport(double taxableIncome, int year){
		this.taxableIncome = taxableIncome;
		
		switch (year) {
			case 2022:
				calculator = new TaxCalculator2022(this.taxableIncome);
				break;
			case 2021:
				calculator = new TaxCalculator2021(this.taxableIncome);
				break;
			case 2023:
				calculator = new TaxCalculator2023(this.taxableIncome);
				break;
			default :
				System.err.println(" please input appropriate year ");
		}
				
				
//		calculator = new TaxCalculator(this.taxableIncome);
	}
	
//	TaxCalculator calculator = new TaxCalculator(this.taxableIncome);  // not initializing, here is the problem
	
	public void show() {
		
		double tax = calculator.calculateTax();
		System.out.println("Tax on your " + this.taxableIncome + " income is : ₹" + tax);
	}
}
