package in.aubank.interfaces;

public class Voter {

	int age;
	String name;
	final String nationality = "Indian";
	String gender;
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) throws Exception {
		if(age > 120 || age < 18) {
			throw new VoterException("you are not under the allowed age limit for voting");
		}
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() throws Exception {
		return gender;
	}



	public void setGender(String gender) throws Exception {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}
		throw new VoterException("please enter correct gender");
		
	}

	public void voted() {
		System.out.println("hurraay your vote is successfully recorded");
		System.out.println("Your Details are: ");
		System.out.println("name : " + this.name);
		System.out.println("age : " + this.age);
		System.out.println("gender : " + this.gender);
		System.out.println("nationality : " + this.nationality);
	}
}
