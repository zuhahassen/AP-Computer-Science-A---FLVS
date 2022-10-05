
/**
 * Purpose: To design a program that will traverse, replace, insert, and delete items within a grade book
 *
 * @author Zuha Hassen
 * @version 04/14/2022
 */
class Student {
   
   // instance variables
   private String name;
   private int[] scores;

   // constructor
   public Student(String name) {
       this.name = name;
       this.scores = new int[5];
   }

   
   public int getScore(int num) {
       if (num <= 5 && num > 0)
           return scores[num - 1];
       else
           return 0;
   }


   public void setScore(int num, int score) {
       if (num <= 5 && num > 0)
           scores[num - 1] = score;
   }

   
   public String getName() {
       return this.name;
   }


   public void setName(String name) {
       this.name = name;
   }


   // toString method 
   public String toString() {
       String score = "";
       for (int s : scores) {
           score += s + "\t";
       }
       return name + "\t\t" + score;
   }

}
