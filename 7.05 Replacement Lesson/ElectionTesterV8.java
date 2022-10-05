
/**
 * Purpose: To create a mock election to demonstrate traversal and replacement algorithms
 *
 * @author Zuha Hassen
 * @version 4/14/2022
 */
import java.util.*;
public class ElectionTesterV8
{
    public static void main(String[] args)
    {
          List<Candidate> election = new ArrayList<Candidate>();
          
          election.add(new Candidate("George Washington", 1123));
          election.add(new Candidate("John Adams", 2094));
          election.add(new Candidate("Thomas Jefferson", 1256));
          election.add(new Candidate("Abraham Lincoln", 3582));
          election.add(new Candidate("Donald Trump", 1011));
          
          System.out.printf("%s%n%n", "Raw Election Data: ");
          printElection(election);
          System.out.println();
          
          //Original Results
          System.out.printf("%s%n%n", "Original Election Results: ");
          electionTable(election, countVotes(election));
          System.out.println();
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
        
          //change name
          System.out.printf("%s%n%n", "<< Changing Abraham Lincoln to Barack Obama >>");
          changeName(election,"Abraham Lincoln", "Barack Obama");
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
          //change vote
          System.out.printf("%s%n%n", "<< Changing John Adam votes to 3471 >>");
          changeVote(election, "John Adams", 3471);
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
              
          
          //change name and vote
          System.out.printf("%s%n%n", "<< Changing Donald Trump to Joe Biden and changing votes to 4598 >>");
          changeElement(election, "Donald Trump", "Joe Biden", 4598); 
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
          //insert a candidate1
          System.out.printf("%s%n%n", "<< In position 3, add George Bush, 2751 >>");
          insertCandidate1(election, 3, "George Bush", 2751);
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
          //insert a candidate2 
          System.out.printf("%s%n%n", "<< Before John Adams, add Bill Clinton, 3982 >>");
          insertCandidate2(election, "John Adams", "Bill Clinton", 3982);
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
          //delete a candidate by position
          System.out.printf("%s%n%n", "<< Delete position 2 >>");
          deleteByLoc(election, 2);
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
          //delete a candidate by name
          System.out.printf("%s%n%n", "<< Delete George Washington >>");
          deleteByNam(election, "George Washington");
          electionTable(election, countVotes(election));
          System.out.println("\n");
          
          System.out.println("The total number of votes is: " + countVotes(election));
          System.out.println("\n");
          
          
    }
       
    public static void printElection(List<Candidate> votes){
        for(Candidate vote: votes){
            System.out.println(vote);
        }
    }
    
    public static int countVotes(List<Candidate> votes){
        int sum = 0;
        
        for(int i = 0; i < votes.size(); i++){
            sum += votes.get(i).getVotes();
        }
        
        return sum;
    }
    
    public static void electionTable(List<Candidate> votes, double voteTotal){
        System.out.println("Candidate       Votes Recieved    % of Total Votes");
        System.out.println("=======================================================");
           
        for(int i = 0; i < votes.size(); i++){
           System.out.printf("%17s %6d %18.2f %n", votes.get(i).getName(), votes.get(i).getVotes(), (((votes.get(i).getVotes()/voteTotal)* 100)));
        }
    }
    
    public static void changeName(List<Candidate> votes, String find, String replace){
        for(int i = 0; i < votes.size(); i++){
            if(votes.get(i).getName().equals(find)){
                votes.get(i).setName(replace);
            }
        }
    }
    
    public static void changeVote(List<Candidate> votes, String find, int replace){
        for(int i = 0; i < votes.size(); i++){
            if(votes.get(i).getName().equals(find)){
                votes.get(i).setVotes(replace);
            }
        }
    }
    
    public static void changeElement(List<Candidate> votes, String find, String replaceNam, int replaceVote){
        for(int i = 0; i < votes.size(); i++){
            if(votes.get(i).getName().equals(find)){
                votes.get(i).setName(replaceNam);
                votes.get(i).setVotes(replaceVote);
            }
        }
    }
    
    public static void insertCandidate1(List<Candidate> votes, int location, String addN, int addV){
        votes.add(location, new Candidate(addN, addV));
    }
    
    public static void insertCandidate2(List<Candidate> votes, String find, String addN, int addV){
        int location = 0;
        
        for(int i = 0; i < votes.size(); i++){
            if(votes.get(i).getName().equals(find)){
                location = i;
            }
        }
        
        votes.add(location, new Candidate(addN, addV));
    }
    
    public static void deleteByLoc(List<Candidate> votes, int location){
        votes.remove(location);
    }
    
    public static void deleteByNam(List<Candidate> votes, String find){
        int location = 0;
        int i;
        
        for (i = 0; i < votes.size(); i++){
            if(votes.get(i).getName().equals(find)){
                location = i;
                break;
            }
        }
        
        if(i != votes.size()){
            votes.remove(location);
        }
    }
    
}
