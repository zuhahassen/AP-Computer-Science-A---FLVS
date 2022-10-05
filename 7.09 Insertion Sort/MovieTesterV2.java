
/**
 * Purpose: To sort a list of movies (descending or ascending order)
 *
 * @author Zuha Hassen 
 * @version 04/14/2022
 */
public class MovieTesterV2
{
   public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        
        movies[0] = new Movie("Frozen", 2013, "Disney");
        movies[1] = new Movie("Caroline", 2009, "Laika");
        movies[2] = new Movie("Finding Nemo", 2003, "Pixar");
        movies[3] = new Movie("Eternals", 2021, "Marvel");
        movies[4] = new Movie("Batman", 2022, "DC Comics");
        movies[5] = new Movie("Jumanji", 1995, "Blackhall");
        movies[6] = new Movie("Titanic", 1997, "Paramount");
        movies[7] = new Movie("Hunger Games", 2012, "Color Force");
        movies[8] = new Movie("Mulan", 1998, "Disney");
        movies[9] = new Movie("The Last Airbender", 2010, "Nickelodeon");
        
        System.out.println("<< Before Sort >>\n");
        printMovies(movies);
        
        System.out.println();
        System.out.println();
        
        //ascending order
        System.out.println("<< After Sort >>");
        System.out.println("<< by year, ascending order >>\n");
        movies = insertionYear(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by title, ascending order >> \n");
        movies = insertionTitle(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by studio, ascending order >> \n");
        movies = insertionStudio(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println();
        
        //descending order
        System.out.println("<< After Sort >>");
        System.out.println("<< by year, descending order >> \n");
        movies = insertionYear(movies, 2);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by title, descending order >> \n");
        movies = insertionTitle(movies, 2);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by studio, descending order >> \n");
        movies = insertionStudio(movies, 2);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
    }
    
    
   public static void printMovies(Movie[] movies){
       for(Movie m : movies){
           System.out.println(m);
       }
   }
   
   
   public static Movie[] insertionTitle(Movie[] source, int Num){
       Movie[] dest = new Movie[source.length];
       for(int i = 0; i < source.length; i++){
           Movie next = source[i];
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
       return dest;
   }
   
   
   public static Movie[] insertionStudio(Movie[] source, int Num){
       Movie[] dest = new Movie[source.length];
       for(int i = 0; i < source.length; i++){
           Movie next = source[i];
           int insertIndex = 0;
           int k = i;
           while(k > 0 && insertIndex == 0){
               if(Num == 1 && next.getStudio().compareTo(dest[k-1].getStudio()) > 0){
                   insertIndex = k;
               }
               else if(Num == 2 && next.getStudio().compareTo(dest[k-1].getStudio()) < 0){
                   insertIndex = k;
               }
               else{
                   dest[k] = dest[k-1];
               }
               k--;
           }
           dest[insertIndex] = next;
       }
       return dest;
   }
   

   public static Movie[] insertionYear(Movie[] source, int Num){
       Movie[] dest = new Movie[source.length];
       for(int i = 0; i < source.length; i++){
           Movie next = source[i];
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
       return dest;
   }
   
   
   
}
