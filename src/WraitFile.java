import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class WraitFile {
static ArrayList<String> lessonFile2(){
    ArrayList<String> lessonFile=new ArrayList<String>();

     // public static void filfil(){
      //  String fi = "";
       try {
           Scanner filt=new Scanner(new File("lesson.txt"));

           while (filt.hasNextLine()){

               String  fi= filt.nextLine();
               lessonFile.add(fi);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    return lessonFile;
}

    }
