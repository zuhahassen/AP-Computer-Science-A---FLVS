
/**
 * Purpose: To perform a search in a collection of music
 *
 * @author Zuha Hassen
 * @version 4/15/2022
 */
public class MusicTesterV2
{
    public static void main(String[] args)
    {
        Music[] music = new Music[10];
        int sound;
        
        music[0] = new Music("7 Rings", 2019, "Ariana Grande");
        music[1] = new Music("Say My Name", 1999, "Beyonce");
        music[2] = new Music("24K Magic", 2016, "Bruno Mars");
        music[3] = new Music("Believer", 2017, "Imagine Dragons");
        music[4] = new Music("Roar", 2012, "Katy Perry");
        music[5] = new Music("No Tears Left to Cry", 2018, "Ariana Grande");
        music[6] = new Music("Drivers License", 2021, "Olivia Rodrigo");
        music[7] = new Music("Diamonds", 2012, "Rihanna");
        music[8] = new Music("Can't Feel My Face", 2015, "The Weeknd");
        music[9] = new Music("Chandelier", 2014, "Sia");
        
        printMusic(music);
        
        System.out.println("\n\nSearching for Ariana Grande: ");
        insertionArtist(music, 1);
        binarySearchArtist(music, "Ariana Grande");
        
        System.out.println("\n\nSearching for Drake: ");
        insertionArtist(music, 1);
        binarySearchArtist(music, "Drake");
        
        
        System.out.println("\n\nSearching for Roar: ");
        insertionTitle(music, 1);
        binarySearchTitle(music, "Roar");
    
        
        System.out.println("\n\nSearching for Hello, by Adele: ");
        insertionTitle(music, 1);
        binarySearchTitle(music, "Hello");
       
        
        
        System.out.println("\n\nSearching for Songs Released in 2012: ");
        insertionYear(music, 1);
        binarySearchYear(music, 2012);
        
        System.out.println("\n\nSearching for Songs Released in 2009: ");
        insertionYear(music, 1);
        binarySearchYear(music, 2009);


 
    }
    
    //print
   public static void printMusic(Music[] music){
       for(Music m : music){
           System.out.println(m);
       }
   }
    
   
   public static void binarySearchTitle(Music[] music, String toFind){
       int high = music.length;
       int low = -1;
       int probe;
       
       while(high - low > 1){
           probe = (high + low) /2;
           if(music[probe].getTitle().compareTo(toFind) > 0){
               high = probe;
           } else{
               low = probe;
               if(music[probe].getTitle().compareTo(toFind) == 0){
                   break;
               } 
           }
       }
       
       if((low >= 0) && (music[low].getTitle().compareTo(toFind) == 0)){
           linearPrintTitle(music, low, toFind);
       } else {
           System.out.println("Not found: " + toFind);
       }
   }
   
   
   public static void binarySearchArtist(Music[] music, String toFind){
       int high = music.length;
       int low = -1;
       int probe;
       
       while(high - low > 1){
           probe = (high + low) /2;
           if(music[probe].getArtist().compareTo(toFind) > 0){
               high = probe;
           } else{
               low = probe;
               if(music[probe].getArtist().compareTo(toFind) == 0){
                   break;
               }
           }
       }
       
       if((low >= 0) && (music[low].getArtist().compareTo(toFind) == 0)){
           linearPrintArtist(music, low, toFind);
       } else {
           System.out.println("Not found: " + toFind);
       }
   }
   
   
   public static void binarySearchYear(Music[] music, int toFind){
       int high = music.length;
       int low = -1;
       int probe;
       
       while(high - low > 1){
           probe = (high + low) /2;
           if(music[probe].getYear() != toFind){
               high = probe;
           } else{
               low = probe;
               if(music[probe].getYear() == toFind){
                   break;
               }
           }
       }
       
       if((low >= 0) && (music[low].getYear() == toFind)){
           linearPrintYear(music, low, toFind);
       } else {
           System.out.println("Not found: " + toFind);
       }
   }
   
   
   public static void linearPrintTitle(Music[] music, int low, String toFind){
       int i;
       int start = low;
       int end = low;
       i = low -1;
       while((i >= 0) && (music[i].getTitle().compareTo(toFind) == 0)){
           start = i;
           i--;
       }
       i = low +1;
       while((i < music.length) && (music[i].getTitle().compareTo(toFind) == 0)){
           end = i;
           i++;
       }
       for(i = start; i <= end; i++){
           System.out.println(music[i]);
       }
   }
   
   
   public static void linearPrintArtist(Music[] music, int low, String toFind){
       int i;
       int start = low;
       int end = low;
       i = low -1;
       while((i >= 0) && (music[i].getArtist().compareTo(toFind) == 0)){
           start = i;
           i--;
       }
       i = low +1;
       while((i < music.length) && (music[i].getArtist().compareTo(toFind) ==0)){
           end = i;
           i++;
       }
       for(i = start; i <= end; i++){
           System.out.println(music[i]);
       }
   }
   
   
   public static void linearPrintYear(Music[] music, int low, int toFind){
       int i;
       int start = low;
       int end = low;
       i = low -1;
       while((i >= 0) && (music[i].getYear() == toFind)){
           start = i;
           i--;
       }
       i = low +1;
       while((i < music.length) && (music[i].getYear() == toFind)){
           end = i;
           i++;
       }
       for(i = start; i <= end; i++){
           System.out.println(music[i]);
       }
   }
    
    
    public static void insertionTitle(Music[] source, int Num){
       Music[] dest = new Music[source.length];
       for(int i = 0; i < source.length; i++){
           Music next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getTitle().compareTo(dest[k-1].getTitle()) > 0){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getTitle().compareTo(dest[k-1].getTitle()) < 0){
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
    
   
   public static void insertionArtist(Music[] source, int Num){
       Music[] dest = new Music[source.length];
       for(int i = 0; i < source.length; i++){
           Music next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getArtist().compareTo(dest[k-1].getArtist()) > 0){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getArtist().compareTo(dest[k-1].getArtist()) < 0){
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
    
   
   public static void insertionYear(Music[] source, int Num){
       Music[] dest = new Music[source.length];
       for(int i = 0; i < source.length; i++){
           Music next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getYear() > dest[k-1].getYear()){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getYear() < dest[k-1].getYear()){
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

   
}
