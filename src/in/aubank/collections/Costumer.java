package in.aubank.collections;

public class Costumer implements Comparable<Costumer> {
	
	private int id;
	private String name;
	private String email;
	private float balance;
	
	public Costumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Costumer(int id, String name, String email, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Costumer [id=" + id + ", name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Costumer o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}
	
	
}
