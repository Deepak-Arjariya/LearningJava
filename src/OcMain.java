
public class OcMain {
	
	@SuppressWarnings("static-access")
	public static void main(String[] arg) {
		ObjectCounter oc1 ,oc2, oc3;
		oc1 = new ObjectCounter();
		oc2 = new ObjectCounter();
		oc3 = new ObjectCounter();
		
		oc1.increment();
		oc2.increment();
		oc3.increment();
		
		System.out.println(ObjectCounter.objects);
		ObjectCounter.objects = 122;
		
		System.out.println(oc1.objects);
	}
}


//   can we use int in main;

// what is address of object 
// pass by reference