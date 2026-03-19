import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// ALL THAT NEEDS TO BE DONE IS INVARIENTS FOR MOST METHODS

public class QuestBoard {
	
	private Map<Integer, Quest> questsById;
	private Map<Student, List<Quest>> assignments;
	
	public QuestBoard() {
		questsById = new HashMap<>();
		assignments = new HashMap<>();
	}
	
	public void addQuest(Quest q) {
		if (questsById.containsKey(q.getId())) {
			throw new IllegalArgumentException("Duplicate id");
		}
		
		questsById.put(q.getId(), q);
	}
	
	public Quest findQuest(int id) {
		return questsById.get(id);
	}
	
	public void assignQuest(Student s, int questId) {
		
		// First find the quest
		Quest q = questsById.get(questId);
		
		if (q == null) {
			throw new IllegalArgumentException("quest isn't there");
		}
		// Get quest list
		List<Quest> studentQuests = assignments.get(s);
		
		if (studentQuests == null) {
			studentQuests = new ArrayList<>();
			assignments.put(s,  studentQuests);
		}
		
		// Decided not to be able to add same quest
		if (!studentQuests.contains(q)) {
			studentQuests.add(q);
		}
	}
	
	public int completeQuest(Student s, int questId) {
		// Get quest from assignments
		List<Quest> studentQuests = assignments.get(s);
		// Search through the list and match id
		for (Quest completedQuest : studentQuests) {
			if (completedQuest.getId() == questId) {
				return completedQuest.completeFor(s);
			}
		}
		
		throw new IllegalArgumentException("Couldn't find id");
	}
	
	public void printAllQuests() {
		// Iterate through all quests
		for (Quest q : questsById.values()) {
			System.out.println(q);
		}
	}
	
	public void printAssignmentsFor(Student s) {
		List<Quest> studentQuests = assignments.get(s);
		
		// Iterate through all student quests
		for (Quest q : studentQuests) {
			System.out.println(q);
		}
	}
}
