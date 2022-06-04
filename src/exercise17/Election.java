package exercise17;

import java.util.ArrayList;

public class Election {

    private ArrayList <Candidate> candidates = new ArrayList<>();
    private int totalVotes;

    public void setCandidates(Candidate candidate) {
        this.candidates.add(candidate);
    }

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }

    public void getTotalVotes(){
        for (int i = 0; i < candidates.size(); i++) {
            totalVotes += candidates.get(i).getNumberOfVotes();
        }
        System.out.println(totalVotes);
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> candidatesFromPartyList = new ArrayList<>();
        for (int i = 0; i < getCandidates().size(); i++) {
            if (party.equals(candidates.get(i).getParty())){
                candidatesFromPartyList.add(getCandidates().get(i));
            }
        }
        return candidatesFromPartyList;
    }


}
