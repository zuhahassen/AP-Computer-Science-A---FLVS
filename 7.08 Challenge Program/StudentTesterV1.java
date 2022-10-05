/**
 * Purpose: To design a program that will traverse, replace, insert, and delete items within a grade book
 *
 * @author Zuha Hassen
 * @version 04/14/2022
 */

import java.util.ArrayList;
public class StudentTesterV1 {

   public static void main(String[] args) {
       // array list to organize the students
       ArrayList<Student> studentList = new ArrayList<>();
      
       Student st1 = new Student("Jacob");
       Student st2 = new Student("Bob");
       Student st3 = new Student("Emily");
       Student st4 = new Student("Grace");
       Student st5 = new Student("Malia");
       

       int[] score1 = {62, 74, 88, 56, 80};
       int[] score2 = {92, 87, 97, 90, 84};
       int[] score3 = {75, 80, 78, 64, 86};
       int[] score4 = {98, 84, 95, 83, 90};
       int[] score5 = {69, 94, 78, 93, 85};


       for (int i = 0; i < 5; i++) {
           st1.setScore(i+1, score1[i]);
           st2.setScore(i+1, score2[i]);
           st3.setScore(i+1, score3[i]);
           st4.setScore(i+1, score4[i]);
           st5.setScore(i+1, score5[i]);
       }

       
       studentList.add(st1);
       studentList.add(st2);
       studentList.add(st3);
       studentList.add(st4);
       studentList.add(st5);
       
      

       // print
       System.out.println("Starting Gradebook: ");
       System.out.println();
       printStudent(studentList);
       System.out.println();
       

       // replace student name with new one
       System.out.println("<< Replacing Jacob with John >>");
       System.out.println();
       replaceName(studentList, "Jacob", "John");
       printStudent(studentList);
       System.out.println();
       

       // replace score with new score
       System.out.println("<< Replacing Emily's first quiz grade to 100 >>");
       System.out.println();
       replaceScore(studentList, "Emily", 1, 100);
       printStudent(studentList);
       System.out.println();


       // replace student with another one
       System.out.println("<< Replacing Bob with Alan and Alan's scores >>");
       System.out.println();
       int[] score6 = { 45, 69, 81, 74, 70 };
       replaceStudent(studentList, "Bob", "Alan", score6);
       printStudent(studentList);
       System.out.println();
       

       // insert student before another
       System.out.println("<< Inserting Rose before Grace >>");
       System.out.println();
       int[] score7 = {96, 91, 100, 89, 83};
       insertStudent(studentList, "Grace", "Rose", score7);
       printStudent(studentList);
       System.out.println();


       // delete student
       System.out.println("<< Removing Malia >>");
       System.out.println();
       deleteStudent(studentList, "Malia");
       printStudent(studentList);
       System.out.println();

   }

   
   // traverse and print 
   private static void printStudent(ArrayList<Student> studentList) {
       System.out.println("Student Name\tQ1\tQ2\tQ3\tQ4\tQ5\t");
       System.out.println("-------------------------------------------------------------");
       for (Student s : studentList) { 
           System.out.println(s); 
       }
   }
   
   
   // replace student name 
   private static void replaceName(ArrayList<Student> studentList, String find, String newName) {
       for (Student s : studentList) { 
           if (s.getName().equals(find)){ 
               s.setName(newName);
            }
       }
   }
   
   
   // replace score
   private static void replaceScore(ArrayList<Student> studentList, String find, int num, int newScore) {
       for(int i = 0; i < studentList.size(); i++){
           if(studentList.get(i).getName().equals(find)){
               studentList.get(i).setScore(num, newScore);
           }
       }
   }
   
   
   // replace a student
   private static void replaceStudent(ArrayList<Student> studentList, String find, String newName, int[] scores) {
       for (Student s : studentList) { 
           if (s.getName().equals(find)) { 
               s.setName(newName); 
               for (int i = 0; i < 5; i++) {
                   s.setScore(i, scores[i]); 
               }
           }
       }
   }
   
   
   // delete student
   private static void deleteStudent(ArrayList<Student> studentList, String find) {
       for (int i = 0; i < studentList.size(); i++) {
           if (studentList.get(i).getName().equals(find)) { 
               studentList.remove(studentList.get(i)); 
           }
       }
   }

 
   // insert student   
   public static void insertStudent(ArrayList<Student> studentList, String find, String newName, int[] score){
        int location = 0;
        
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getName().equals(find)){
                location = i;
            }
        }
        
        Student st = new Student(newName);
        for(int i = 0; i < 5; i++){
            st.setScore(i+1, score[i]);
        }
        
        studentList.add(location, st);
    }
   
}