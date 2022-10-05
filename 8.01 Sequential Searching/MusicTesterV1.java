
/**
 * Purpose: To perform a search in a collection of music
 *
 * @author Zuha Hassen
 * @version 4/15/2022
 */
public class MusicTesterV1
{
    public static void main(String[] args)
    {
        Music[] music = new Music[10];
        
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
        findArtist(music, "Ariana Grande");
        
        System.out.println("\n\nSearching for Drake: ");
        findArtist(music, "Drake");
        
        System.out.println("\n\nSearching for Roar: ");
        findTitle(music, "Roar");
        
        System.out.println("\n\nSearching for Hello, by Adele: ");
        findTitle(music, "Hello");
        
        System.out.println("\n\nSearching for Songs Released in 2012: ");
        findYear(music, 2012);
        
        System.out.println("\n\nSearching for Songs Released in 2009: ");
        findYear(music, 2009);

 
    }
    
    //print
    public static void printMusic(Music[] music){
       for(Music m : music){
           System.out.println(m);
       }
    }
    
    //searching for title
    public static void findTitle(Music[] music, String toFind){
        int found = -1;
        for(int i = 0; i < music.length; i++){
            if(music[i].getTitle().compareTo(toFind) == 0){
                found = i;
                break;
            }
        }
        
        if(found != -1){
            System.out.println(music[found]);
        } else{
            System.out.println(toFind + " is not in the collection.");
        }
    }
    
    //searching for artist
    public static void findArtist(Music[] music, String toFind){
        int found = 0;
        
        for(int i = 0; i < music.length; i++){
            if(music[i].getArtist().compareTo(toFind) == 0){
                System.out.println(music[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println(toFind + " is not in the collection");
        }
    }
    
    //searching for year
    public static void findYear(Music[] music, int toFind){
        int found = 0;
        
        for(int i = 0; i < music.length; i++){
            if(music[i].getYear() == toFind){
                System.out.println(music[i]);
                found++;
            }
        }
        
        if(found == 0){
            System.out.println("Songs released in " + toFind + " is not in the collection");
        }
    }
   
}
