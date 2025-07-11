// Put the things that will be needing to import
package Paras_Karl;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
//Create the scanner and declare it all in the first part
public class MovieTime{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Queue<String> movies = new LinkedList<>();
    Queue<String> snacks = new LinkedList<>();
//Input 3 Movies that will be added
    for (int i=0;i<3;i++){
        System.out.printf("Enter Movie %d of 3: ",i+1);
        String movie = in.nextLine();
        movies.add(movie);
    }
//Input 3 snacks that will be added
    for (int i=0;i<3;i++){
        System.out.printf("Enter snack %d of 3: ",i+1);
        String snack = in.nextLine();
        snacks.add(snack);
    }
//This part will print the user's input
        System.out.println("Movies to watch: "+movies);
        System.out.println("Snacks to eat: "+snacks);

        System.out.println("Press S each time you finish a snack");
//This is where the snacks will be eaten by the user and will be displayed empty if there is no snacks
    while (!snacks.isEmpty()){
        String ch = in.nextLine();
    if(ch.equals("S"))snacks.remove();
        System.out.println(snacks);
    }
        System.out.println("No more snacks");
    }
}