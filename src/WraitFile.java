import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

public class WraitFile {
    static ArrayList<String> lessonFile2() {
        ArrayList<String> lessonFile = new ArrayList();
        try {
            Scanner filt = new Scanner(new File("lesson.txt"));

            while (filt.hasNextLine()) {

                String fi = filt.nextLine();
                lessonFile.add(fi);
            }
            filt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lessonFile;
    }


    static ArrayList<GetSet> learEnglRussLish() {
        ArrayList<GetSet> eng = new ArrayList<>();
        for (String s : lessonFile2()) {
            String[] s2 = s.split("-" , 2);
            GetSet getSet = new GetSet();
            getSet.setEnglish(s2[0]);
            getSet.setRusian(s2[1]);
            eng.add(getSet);
        }
        return eng;
    }

}
