public class Main {
	public static void main(String[] args) {
		Student Eli = new Student("Eli Fassler");
		
		EventCheckInQuest eliEvent1 = new EventCheckInQuest(1, "Check in Volunteering 3/19", 3, "Tour");
		VolunteerQuest eliEvent2 = new VolunteerQuest(2, "Eli Volunteering 3/19", 10, 8);
		
		eliEvent1.completeFor(Eli);
		eliEvent2.completeFor(Eli);
		System.out.println(Eli);
	}
}
