import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<>();

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, isAnonymous);
        for (String choice : choices) {
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    public Voting getVoting(int index) {
        return index >= 0 && index < votingList.size() ? votingList.get(index) : null;
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void printResults(int index) {
        Voting voting = getVoting(index);
        if (voting != null) {
            voting.printResults();
        } else {
            System.out.println("Invalid voting index.");
        }
    }

    public void printVoters(int index) {
        Voting voting = getVoting(index);
        if (voting != null) {
            voting.printVoters();
        } else {
            System.out.println("Invalid voting index.");
        }
    }
}
