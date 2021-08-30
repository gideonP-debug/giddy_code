
/**
 * Write a description of class checkSound here.
 *
 * @author (Nguyen, Jackson. Amann, Rachel. Kime, Gideon)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class checkSound
{
    // instance variables
    Clip clip;
    
    AudioInputStream samp;
    static String file_name;
    
    // Method to construct Audio system from a file
    public checkSound() throws UnsupportedAudioFileException,IOException, 
    LineUnavailableException
    {
        // initialize instance variable for AudioInputStream
        samp = AudioSystem.getAudioInputStream(new File(file_name).getAbsoluteFile());
        
        //initialize instance variable for Audio clip
        clip = AudioSystem.getClip();
        
        //opening the file with audio clip
        clip.open(samp);           
        
    }
    
    //Method that plays audio clip
    public void play()
    {
        clip.start();               
    }
    
    //Method that stops the audio clip
    public void stop()
    {       
        clip.stop();
    }
    
   
   public static void main(String[] args)
   {
              
       //String array that contain alphabets that represent keyboard basic notes
       String[] note = {"A","B","C","D","E","F","G"};
       
       // Building scanner variable that we read user input
       Scanner sc = new Scanner(System.in);
       System.out.println("Play Keyboard note");
       
       //A condition that controls how many times the user will play the keyboard notes
       String n = "";
       for(int i=0; i<=16; i++)
       {
           n = sc.next(); 
       
     
           //condition that check each user input and play the audio file respectively
           if(n.equalsIgnoreCase(note[0]))
           {
               file_name = note[0]+".wav"; 
           
               try
               {
                   checkSound music_play = new checkSound();
           
                   music_play.play();              
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[1]))
            {
                file_name = note[1]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
                    
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[2]))
            {
                file_name = note[2]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
                    //music_play.stop();
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[3]))
            {
                file_name = note[3]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
                    //music_play.stop();
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[4]))
            {
                file_name = note[4]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
               
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[5]))
            {
                file_name = note[5]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
               
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase(note[6]))
            {
                file_name = note[6]+".wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
                    
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }

            }
            else if(n.equalsIgnoreCase("c5"))
            {
                file_name = "C5.wav"; 
           
                try
                {
                    checkSound music_play = new checkSound();
           
                    music_play.play();
                    
                }
                catch(Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
                }
            }
            else if(n.equalsIgnoreCase("stop"))
            {
                System.out.println("Hope you had fun! Play again next time");                
                break;
            }
            else
                System.out.println("Key not assigned");
       
                //end of session
                if(i==16)
      System.out.println("End of session! Welcome again next time");
           /* Scanner sc1 = new Scanner(System.in);
            String n1 = sc1.next();
            
            if(n1.equalsIgnoreCase("Yes"))
        {
             try
             {
                 checkSound cs = new checkSound();
                 //cs.lets_PlayPiano();
                }catch (Exception e)
                {
                    System.out.println("Error with playing sound."); 
                    e.printStackTrace(); 
          
                }
        
        }
        if(n1.equalsIgnoreCase("No"))
        {
            System.out.println("Hope you had fun! Play again next time");                
            System.exit(0);
        }*/

             
      }
 }
      
     
    
    
}
