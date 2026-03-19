public class Student {
	

	private int points;
	private String name;

	public Student(String name) {
		
		if (name == null || name.isBlank()){
			throw new IllegalArgumentException("Name isnt valid");
		}
		if (points < 0){
			throw new IllegalArgumentException("Points cannot be < 0");
		}
		
		this.name = name;
		
		this.points = 0; 
		
	}  // add points 
	
	public void addPoints(int amount) { 
		
		if(amount <= 0 ) {
			throw new IllegalArgumentException("Amount must be positive and not zero");
		}
		
		this.points = points + amount;
	}
	
	public int getPoints()
	{
		return points;
	}

	public String getName()
	{
		return name;
	}

	// Create our own equals() and hashCode()
	// hashSet uses Object
	@Override
	public boolean equals(Object s) {
		// Don't compare addresses
		Student s1 = (Student) s;
		
		if (this == s) {
			return true;
		}
		
		return name.equals(s1.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		System.out.println("Name: " + name + ", Points: " + points);
		return "";
	}
	
}
