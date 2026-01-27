package collections.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Voting {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVoteMap = new TreeMap<>();
    private Map<String, Integer> sortedVoteMap = new LinkedHashMap<>();

    //Method to cast a vote
    public void castVote(String candidate) {
        //Updating hashmap
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        //Updating linked hashmap
        if(!orderedVoteMap.containsKey(candidate)){
            orderedVoteMap.put(candidate, 0);
        }
        orderedVoteMap.put(candidate, orderedVoteMap.get(candidate)+ 1);

        //Updating tree map
        sortedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0)+1);
    }

    // Display results in sorted order (by candidate name)
    public void displaySortedResults() {
        System.out.println("Election Results (Sorted by Candidate Name): " + sortedVoteMap);
    }

    // Display results in order of voting
    public void displayVotesInOrder() {
        System.out.println("Votes in Order Cast: " + orderedVoteMap);
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Voting votingSystem = new Voting();

        // Casting votes
        votingSystem.castVote("Surbhi");
        votingSystem.castVote("Surbhi");
        votingSystem.castVote("Yuvi");
        votingSystem.castVote("Deep");
        votingSystem.castVote("Deep");
        votingSystem.castVote("Surbhi");

        // Displaying results
        votingSystem.displaySortedResults();  // Sorted results
        votingSystem.displayVotesInOrder();   // Order of voting
    }
}