package day19;

public class Election {
    //WAP to identify if a person is eligible to vote or not

    int age;
    boolean hasVoterCard;

    public void checkEligibilityToVote()
    {
          if(age>=18)
          {
              System.out.println("The person is eligible to Vote....");
              if(hasVoterCard)
              {
                  System.out.println("S/He can Vote....");
              }
              else
              {
                  System.out.println("Is Eligible to Vote, but isn't carrying the voter card...");
              }
          }
          else
          {
              System.out.println("The person is a minor and hence can't Vote....");
          }
    }
}
