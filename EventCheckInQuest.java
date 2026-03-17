public EventCheckInQuest extends AbstractQuest {
	
	private String eventName;
	
	public EventCheckInQuest(int id, String title, int basePoints, String eventName) {
		
		if (eventName == null || eventName.isBlank()) {
			throw new IllegalArgumentException("eventName cannot be null or blank");
		}
		
		super(id, title, basePoints);
		this.eventName = eventName;
	}
	
	@Override 
	public int completeFor(Student s) {
		
		markCompleted();
		
		int points = getBasePoints();
		s.addPoints(points);
		
		return points;
	}
	
}
