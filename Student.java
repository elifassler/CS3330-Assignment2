public class Student {
	

	private int points;
	private String name;

	public Student(String name) {
		
		if (name == null || name.isBlank()){
			throw new IllegalArgumentException("Name isnt valid");
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
	
}
