public class StreakQuest extends AbstractQuest
{
	
	private int days;

	public StreakQuest(int id, String title, int basePoints, int days) 
	{
		
		super(id, title, basePoints);
		
		
		if (days <= 0) {
			throw new IllegalArgumentException("days has to be > 0");
		}
		
		
		this.days = days;
	}
	
	@Override 
	public int completeFor(Student s) 
	{
		
		markCompleted();
		
		// Linear Bonus
		int points = getBasePoints() + (days * 2);
		s.addPoints(points);
		
		return points;
	}
	
	
}
