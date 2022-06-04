package exercise17;

import java.util.ArrayList;
import java.util.Arrays;

public class Candidate {

    private String name;
    private String party;
    private int numberOfVotes;


    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String toString (){
        return name + ", " + party + ", " + numberOfVotes;
    }


    public static void main(String[] args) {
        Election election = new Election();

        Candidate candidate1 = new Candidate("Bob","Lidt til højre",20);
        Candidate candidate2 = new Candidate("Else","Lidt til venstre",20);
        Candidate candidate3 = new Candidate("Per","Lidt til højre",20);


        election.setCandidates(candidate1);
        election.setCandidates(candidate2);
        election.setCandidates(candidate3);
        System.out.println(election.getCandidates());
        System.out.println(election.getCandidatesFromParty("Lidt til højre"));
        election.getTotalVotes();

    }


}
