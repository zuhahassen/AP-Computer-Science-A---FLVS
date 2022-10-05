
/**
 * Purpose: To perform searches in a contact collection
 *
 * @author Zuha Hassen
 * @version 4/15/2022
 */
public class ContactTesterV1
{
  public static void main(String[] args)
    {
        Contact[] contacts = new Contact[10];
        
        contacts[0] = new Contact("William Cook", "cousin","Feb 23", "172-824-0123", "thegreatestcook@yahoo.com");
        contacts[1] = new Contact("Susan Anthony", "aunt", "Aug 12", "653-982-9912", "susan872@microscoft.net");
        contacts[2] = new Contact("Maddie Grace", "niece", "May 18", "498-267-4721", "thecoolest@gmail.com");
        contacts[3] = new Contact("Emma Parker", "cousin", "Mar 26", "729-436-0332", "parker.emma@gmail.com");
        contacts[4] = new Contact("Noah Logan", "uncle", "Dec 9", "202-882-9221", "rangerover@yahoo.com");
        contacts[5] = new Contact("Olivia Miller", "sister", "Apr 2", "465-824-2658", "olive101@hotmail.com");
        contacts[6] = new Contact("Sophia Clarke", "cousin", "Jan 3", "395-672-9129", "sophiaclark@gmail.com");
        contacts[7] = new Contact("Nico Miller", "nephew", "Nov 20", "894-376-8822", "nicomiller#1@gmail.com");
        contacts[8] = new Contact("Rose Baker", "aunt", "July 28", "707-982-5443", "rosethebaker@yahoo.com");
        contacts[9] = new Contact("Jackson Carter", "uncle", "Feb 16", "202-882-9221", "jacksoncarter18@gmail.com");
        
        printContact(contacts);
        
        
        System.out.println("\n\nSearching for Rose Baker: ");
        insertionName(contacts, 1);
        binarySearchName(contacts, "Rose Baker");
        
        System.out.println("\n\nSearching for Grace Hoper: ");
        insertionName(contacts, 1);
        binarySearchName(contacts, "Grace Hoper");
        
        
        
        System.out.println("\n\nSearching for cousins: ");
        insertionRelation(contacts, 1);
        binarySearchRelation(contacts, "cousin");
        
        System.out.println("\n\nSearching for mother: ");
        insertionRelation(contacts, 1);
        binarySearchRelation(contacts, "mother");
        
        
        
        System.out.println("\n\nSearching for brithday's in Feb: ");
        findBday(contacts, "Feb");
        
        System.out.println("\n\nSearching for brithday's in Oct: ");
        findBday(contacts, "Oct");
        
        
        
        System.out.println("\n\nSearching for 202-882-9221: ");
        findPhoneNum(contacts, "202-882-9221");
        
        System.out.println("\n\nSearching for 202-771-8237: ");
        
        findPhoneNum(contacts, "202-771-8237");
        
        
        
        System.out.println("\n\nSearching for thecoolest@gmail.com: ");
        findEmail(contacts, "thecoolest@gmail.com");
        
        System.out.println("\n\nSearching for cookie370@gmail.com: ");
        findEmail(contacts, "cookie370@gmail.com");
    }
    
    
  public static void printContact(Contact[] contacts){
      System.out.println("Name                      Relation        Birthday        Phone Number        Email");
      System.out.println("-----------------------------------------------------------------------------------------------");

      
      for(Contact c : contacts){
           System.out.println(c);
       }
   }
   
   
  //insertion
   
   public static void insertionName(Contact[] source, int Num){
       Contact[] dest = new Contact[source.length];
     for(int i = 0; i < source.length; i++){
           Contact next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getName().compareTo(dest[k-1].getName()) > 0){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getName().compareTo(dest[k-1].getName()) < 0){
                   insertIndex = k;
               }
               else{
                   dest[k] = dest[k-1];
               }
               k--;
           }
           dest[insertIndex] = next;
       }
       for(int i = 0; i < dest.length; i++){
           source[i] = dest[i];
       }
  }
   
   
   public static void insertionRelation(Contact[] source, int Num){
       Contact[] dest = new Contact[source.length];
       for(int i = 0; i < source.length; i++){
           Contact next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getRelation().compareTo(dest[k-1].getRelation()) > 0){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getRelation().compareTo(dest[k-1].getRelation()) < 0){
                   insertIndex = k;
               }
               else{
                   dest[k] = dest[k-1];
               }
               k--;
           }
           dest[insertIndex] = next;
       }
       for(int i = 0; i < dest.length; i++){
           source[i] = dest[i];
       }
  }
  
  
  //binary
  public static void binarySearchName(Contact[] contacts, String toFind){
       int high = contacts.length;
       int low = -1;
       int probe;
       
       while(high - low > 1){
           probe = (high + low) /2;
           if(contacts[probe].getName().compareTo(toFind) > 0){
               high = probe;
           } else{
               low = probe;
               if(contacts[probe].getName().compareTo(toFind) == 0){
                   break;
               }
           }
       }
       
       if((low >= 0) && (contacts[low].getName() == toFind)){
           linearPrintName(contacts, low, toFind);
       } else {
           System.out.println("Not found: " + toFind);
       }
   }
   
  
  public static void linearPrintName(Contact[] contacts, int low, String toFind){
       int i;
       int start = low;
       int end = low;
       i = low -1;
       while((i >= 0) && (contacts[i].getName().compareTo(toFind) == 0)){
           start = i;
           i--;
       }
       i = low +1;
       while((i < contacts.length) && (contacts[i].getName().compareTo(toFind) == 0)){
           end = i;
           i++;
       }
       for(i = start; i <= end; i++){
           System.out.println(contacts[i]);
       }
   }
   
  
  public static void binarySearchRelation(Contact[] contacts, String toFind){
       int high = contacts.length;
       int low = -1;
       int probe;
       
       while(high - low > 1){
           probe = (high + low) /2;
           if(contacts[probe].getRelation().compareTo(toFind) > 0){
               high = probe;
           } else{
               low = probe;
               if(contacts[probe].getRelation().compareTo(toFind) == 0){
                   break;
               }
           }
       }
       
       if((low >= 0) && (contacts[low].getRelation() == toFind)){
           linearPrintRelation(contacts, low, toFind);
       } else {
           System.out.println("Not found: " + toFind);
       }
   }
  
  
  public static void linearPrintRelation(Contact[] contacts, int low, String toFind){
       int i;
       int start = low;
       int end = low;
       i = low -1;
       while((i >= 0) && (contacts[i].getRelation().compareTo(toFind) == 0)){
           start = i;
           i--;
       }
       i = low +1;
       while((i < contacts.length) && (contacts[i].getRelation().compareTo(toFind) == 0)){
           end = i;
           i++;
       }
       for(i = start; i <= end; i++){
           System.out.println(contacts[i]);
       }
   }
   
  
  //sequential search
  
  public static void findBday(Contact[] contacts, String toFind){
        int found = 0;
        
        for(int i = 0; i < contacts.length; i++){
            //String bday = contacts[i].getBday().substring(0, 2);
            if(contacts[i].getBday().substring(0, 3).compareTo(toFind) == 0){
                System.out.println(contacts[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println(toFind + " is not in the collection");
        }
    }
    
    
  public static void findPhoneNum(Contact[] contacts, String toFind){
        int found = 0;
        
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getPhoneNum().compareTo(toFind) == 0){
                System.out.println(contacts[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println(toFind + " is not in the collection");
        }
    }
    
  public static void findEmail(Contact[] contacts, String toFind){
        int found = 0;
        
        for(int i = 0; i < contacts.length; i++){
            if(contacts[i].getEmail().compareTo(toFind) == 0){
                System.out.println(contacts[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println(toFind + " is not in the collection");
        }
    }
  
}
