
/**
 * Purpose: To create a mock election to demonstrate traversal and replacement algorithms
 *
 * @author Zuha Hassen
 * @version 04/14/2022
 */
public class ElectionTesterV7
{
    public static void main(String[] args)
    {
          Candidate[] election = new Candidate[5];
          
          election[0] = new Candidate("George Washington", 1123);
          election[1] = new Candidate("John Adams", 2094);
          election[2] = new Candidate("Thomas Jefferson", 1256);
          election[3] = new Candidate("Abraham Lincoln", 3582);
          election[4] = new Candidate("Donald Trump", 1011);
          
          System.out.printf("%s%n%n", "Raw Election Data: ");
          printElection(election);
          System.out.println();
          
          
          //original results
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
       
    public static void printElection(Candidate[] votes){
        for(int i = 0; i < votes.length; i++){
            if(votes[i] != null){
                System.out.println(votes[i]);
            }
        }
    }
    
    public static int countVotes(Candidate[] votes){
        int sum = 0;
        
        for(int i = 0; i < votes.length; i++){
            if (votes[i] != null){
            sum += votes[i].getVotes();
            }
        }
        
        return sum;
    }
    
    public static void electionTable(Candidate[] votes, double voteTotal){
        System.out.println("Candidate       Votes Recieved    % of Total Votes");
        System.out.println("=======================================================");
           
        for(int i = 0; i < votes.length; i++){
          if(votes[i] != null){
            System.out.printf("%17s %6d %18.2f %n", votes[i].getName(), votes[i].getVotes(), ((votes[i].getVotes()/voteTotal)*100));
          }
        }
    }
    
    public static void changeName(Candidate[] votes, String find, String replace){
        for(int i = 0; i < votes.length; i++){
            if((votes[i] != null) && (votes[i].getName().equals(find))){
                votes[i].setName(replace);
            }
        }
    }
    
    
    public static void changeVote(Candidate[] votes, String find, int replace){
        for(int i = 0; i < votes.length; i++){
            if((votes[i] != null) && (votes[i].getName().equals(find))){
                votes[i].setVotes(replace);
            }
        }
    }
    
    
    public static void changeElement(Candidate[] votes, String find, String replaceNam, int replaceVote){
        for(int i = 0; i < votes.length; i++){
            if((votes[i] != null) && (votes[i].getName().equals(find))){
                votes[i].setName(replaceNam);
                votes[i].setVotes(replaceVote);
            }
        }
    }
    
    public static void insertCandidate1 (Candidate[] votes, int location, String addN, int addV){
        for(int i = votes.length -1; i > location; i--){
            if (votes[i] != null){
            votes[i] = votes[i-1];
            }
        }
        
        votes[location] = new Candidate(addN, addV);
    }
    
    public static void insertCandidate2(Candidate[] votes, String find, String addN, int addV){
        int location = 0;
        
        for(int i = 0; i < votes.length; i++){
            if((votes[i] != null) && (votes[i].getName().equals(find))){
                location = i;
            }
        }
        
        for(int index = votes.length - 1; index > location; index--){
            votes[index] = votes[index -1];
        }
        
        votes[location] = new Candidate(addN, addV);
    }
    
    public static void deleteByLoc(Candidate[] votes, int location){
        if((location > 0) && (location < votes.length)){
            for(int i = location; i < votes.length - 1; i++){
                votes[i] = votes[i + 1];
            }
            votes[votes.length - 1] = null;
        }
    }
    
    public static void deleteByNam(Candidate[] votes, String find){
        int location = 0;
        int i;
        
        for(i = 0; i < votes.length; i++){
            if((votes[i] != null) && (votes[i].getName().equals(find))){
                location = i;
                break;
            }
            else if(votes[i] == null){
                location = -1;
                break;
            }
        }
        
        if((i != votes.length) && (location >= 0)){
            for(i = location; i < votes.length -1; i++){
                votes[i] = votes[i + 1];
            }
            votes[votes.length - 1] = null;
        }
    }
    
    }




