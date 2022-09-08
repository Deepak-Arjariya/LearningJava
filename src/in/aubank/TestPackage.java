package in.aubank;
public class TestPackage {
	public static void main(String[] args) {
		
		Address ad = new Address();
		
		int a = ad.add();
		System.out.println(a);
	}
}

//	if inside this package do we still need to import the packages