public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Eli Fassler");
		Student s2 = new Student("Liam Jolles");
		Student s3 = new Student("Eli Fassler");
		
		QuestBoard board = new QuestBoard();
		
		Quest q1 = new EventCheckInQuest(1, "Attend Tutoring", 10, "Math Tutoring");
		Quest q2 = new EventCheckInQuest(2, "Do Service for the Food Bank", 15, "Food Bank Service");
		Quest q3 = new VolunteerQuest(3, "Volunteer as a TA", 8, 3);
		Quest q4 = new VolunteerQuest(4, "Volunteer as a tutor", 10, 2);
		Quest q5 = new StreakQuest(5, "Attend Tutoring", 10, 3);
		Quest q6 = new StreakQuest(6, "Do Service for the Food Bank", 15, 4);
		
		board.addQuest(q1);
		board.addQuest(q2);
		board.addQuest(q3);
		board.addQuest(q4);
		board.addQuest(q5);
		board.addQuest(q6);
		
		board.assignQuest(s1, 1);
		board.assignQuest(s1, 2);
		board.assignQuest(s2, 3);
		board.assignQuest(s2, 4);
		
		board.printAllQuests();
		board.printAssignmentsFor(s1);
		
	}
}
