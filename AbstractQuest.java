abstract class AbstractQuest implements Quest {
	
	private int id;
	private String title;
	private double basePoints;
	private boolean completed;
	
	public AbstractQuest(int id, String title, double basePoints) {
		if (id <= 0) {
			throw new IllegalArgumentException("id has to be > 0");
		}
		if (title == null || title.isBlank()) {
			throw new IllegalArgumentException("title cannot be null or blank");
		}
		if (basePoints <= 0) {
			throw new IllegalArgumentException("basePoints has to be > 0");
		}
		
		this.id = id;
		this.title = title;
		this.basePoints = basePoints;
		this.completed = false;
	}

	// Getters
	public int getId() {
		return id;
	}
	
	public String getgetTitle() {
		return title;
	}
	
	public int getBasePoints() {
		return basePoints;
	}
	
	public boolean isCompleted() {
		return completed;
	}
	
	// toString
	@Override
	public String toString() {
		System.out.println("ID: " + id + "\nTitle: " + title + "\nBase points: " + basePoints + "\nCompletion status: " + completed);
		
		return "";
	}
}
