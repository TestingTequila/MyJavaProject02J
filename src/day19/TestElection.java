package day19;

public class TestElection {
    public static void main(String[] args) {

        Election elect = new Election();
        elect.age = 42;
        elect.hasVoterCard = true;
        elect.checkEligibilityToVote();

        System.out.println("====================================================");

        Election elect2 = new Election();
        elect2.age = 16;
        elect2.hasVoterCard = false;
        elect2.checkEligibilityToVote();

        System.out.println("====================================================");

        Election elect3 = new Election();
        elect3.age = 50;
        elect3.hasVoterCard = false;
        elect3.checkEligibilityToVote();
    }
}
