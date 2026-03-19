
public class VolunteerQuest extends AbstractQuest{
	// calling hours, everything else super
	private int hours;
  
	public VolunteerQuest(int id, String title, int basepoints, int hours){
		super(id, title, basepoints);
		
		// Invariant for hours
		if (hours <= 0) {
			throw new IllegalArgumentException("hours has to be greater than 0");
		}
		
		this.hours=hours;
	}
	
	// Getters
	public int getHours() {
		return hours;
	}
		
		
  @Override
	public int completeFor(Student s) {
		if (s == null) {
			throw new IllegalArgumentException("student can't be null");
		}
			
		if (isCompleted()) {
			return 0;
		}
			
		int awarded = getBasePoints() * hours;
			
		// 
		s.addPoints(awarded);
		markCompleted();
		return awarded;
			
	}
	
		
  @Override
	public String toString() {
		return super.toString() + "hours: " + hours;
	}
}
