package in.aubank.interfaces;

public class SquareMain {
	
	public static void main(String[] args) {
		
		Square sq = new Square();
		try {
			sq.setLength(-9);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		sq.area();
		
		System.out.println("/n/n/n-----------------------------------------yoyo--------------------");
		
	}
}
