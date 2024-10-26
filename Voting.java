import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices = new HashMap<>();
    private boolean isAnonymous;
    private ArrayList<Person> voters = new ArrayList<>();

    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<>(choices.keySet());
    }

    public void createChoice(String choice) {
        choices.put(choice, new HashSet<>());
    }

    public void vote(Person voter, ArrayList<String> voterChoices) {
        if (!voters.contains(voter)) {
            voters.add(voter);
            for (String choice : voterChoices) {
                if (choices.containsKey(choice)) {
                    choices.get(choice).add(new Vote(voter));
                } else {
                    System.out.println("Invalid choice: " + choice);
                }
            }
        } else {
            System.out.println("This person has already voted.");
        }
    }

    public void printResults() {
        System.out.println("Choices and Results:");
        for (String choice : choices.keySet()) {
            System.out.println(choice + " = " + choices.get(choice).size());
        }
    }

    public void printVoters() {
        System.out.println("Voters:");
        for (Person voter : voters) {
            System.out.println(voter.getFirstName() + " " + voter.getLastName());
        }
    }
}
