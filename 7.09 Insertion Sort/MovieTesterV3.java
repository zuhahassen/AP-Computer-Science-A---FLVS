
/**
 * Purpose: To sort a list of movies (descending or ascending order)
 *
 * @author Zuha Hassen 
 * @version 04/14/2022
 */
public class MovieTesterV3
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
        selectionYear(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by title, ascending order >> \n");
        selectionTitle(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by studio, ascending order >> \n");
        selectionStudio(movies, 1);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println();
        
        //descending order
        System.out.println("<< After Sort >>");
        System.out.println("<< by year, descending order >> \n");
        selectionYear(movies, 2);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by title, descending order >> \n");
        selectionTitle(movies, 2);
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.println();
        
        System.out.println("<< After Sort >>");
        System.out.println("<< by studio, descending order >> \n");
        selectionStudio(movies, 2);
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
   
   
   public static void selectionYear(Movie[] source, int Num){
       int i;
       int k;
       int posMax;
       Movie temp;
       
       for( i = source.length - 1; i >= 0; i --){
           posMax = 0;
           for(k = 0; k <= i; k++){
               if(Num == 1 && source[k].getYear() > source[posMax].getYear()){
                   posMax = k;
               } 
               else if(Num == 2 && source[k].getYear() > source[posMax].getYear()){
                   posMax = k;
               }
           }
           
           temp = source[i];
           source[i] = source[posMax];
           source[posMax] = temp;
       }
   }
   
   public static void selectionStudio(Movie[] source, int Num){
       int i;
       int k;
       int posMax;
       Movie temp;
       
       for (i = source.length -1; i >= 0; i--){
           posMax = 0;
           for(k = 0 ; k <=i ; k++){
               if(Num == 1 && source[k].getStudio().compareTo(source[posMax].getStudio()) > 0){
                   posMax = k;
               } 
               else if(Num == 2 && source[k].getStudio().compareTo(source[posMax].getStudio()) < 0){
                   posMax = k;
               }
           }
           temp = source[i];
           source[i] = source[posMax];
           source[posMax] = temp;
       }
   }
   
   public static void selectionTitle(Movie[] source, int Num){
       int i;
       int k;
       int posMax;
       Movie temp;
       
       for (i = source.length -1; i >= 0; i--){
           posMax = 0;
           for(k = 0 ; k <=i ; k++){
               if(Num == 1 && source[k].getTitle().compareTo(source[posMax].getTitle()) > 0){
                   posMax = k;
               }
               else if(Num == 2 && source[k].getTitle().compareTo(source[posMax].getTitle()) < 0){
                   posMax = k;
               }
           }
           temp = source[i];
           source[i] = source[posMax];
           source[posMax] = temp;
       }
   }

}
