package kc;

import java.util.*;
public class Main {
    
    public static class Playlist
    {
        String data;
    }
        
 public static void main(String args[]) {
          //Songs
          LinkedList <String> songs = new LinkedList <> ();
          songs.add("Together");
          songs.add("Million Reasons");
          songs.add("The Climb");
          songs.add("Who You Are");
          songs.add("A Woman's Worth");
          System.out.println("Songs: " + songs);
       
         
          //Artist
          LinkedList <String> artist = new LinkedList <> (); 
          artist.add("Mariah Carey");
          artist.add("Lady Gaga");
          artist.add("Miley Cyrus");
          artist.add("Jessie J");
          artist.add("Alicia Keys");
          System.out.println("Artists:" + artist);
          System.out.print(System.lineSeparator());
          
          //PLaylist
          Playlist B1= new Playlist();  
          Playlist B2= new Playlist();  
          Playlist B3= new Playlist();  
          Playlist B4= new Playlist();  
          Playlist B5= new Playlist(); 
          B1.data="Mariah Carey";
          B2.data="Lady Gaga";
          B3.data="Miley Cyrus";
          B4.data="Jessie J";
          B5.data="Alicia Keys";

          Playlist A1= new Playlist();  
          Playlist A2= new Playlist();  
          Playlist A3= new Playlist();  
          Playlist A4= new Playlist();  
          Playlist A5= new Playlist();  
          A1.data="We Belong Together";
          A2.data="Million Reasons";
          A3.data="The Climb";
          A4.data="Who You Are";
          A5.data="A Woman's Worth";


          System.out.println(A1.data+" - "+B1.data);
          System.out.println(A2.data+" - "+B2.data);
          System.out.println(A3.data+" - "+B3.data);
          System.out.println(A4.data+" - "+B4.data);
          System.out.println(A5.data+" - "+B5.data);

             }

    
}
