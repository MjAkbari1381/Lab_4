import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("A");
        choices.add("B");
        choices.add("C");

        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("Your favorite option?", false, 1, choices);

        Person person1 = new Person("Ahmad", "Ahmadi");
        ArrayList<String> person1Votes = new ArrayList<>();
        person1Votes.add("A");
        person1Votes.add("B");

        Voting voting = votingSystem.getVoting(0);
        if (voting != null) {
            voting.vote(person1, person1Votes);
            voting.printResults();
            voting.printVoters();
        }
    }
}
