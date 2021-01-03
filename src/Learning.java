import java.util.ArrayList;
import java.util.Scanner;

public class Learning {
    static Scanner sc = new Scanner(System.in);



    public static void zadanie1(){
        WraitFile.lessonFile2().stream().forEach((String s)->{
            System.out.println(s);
            sc.nextLine();
        });
//    for (String s : WraitFile.lessonFile2()){
//    System.out.println(s);
//    sc.nextLine();}

    for (int i = 0; i< WraitFile.learEnglRussLish().size(); i++){
        System.out.println(WraitFile.learEnglRussLish().get(i).getEnglish());
        System.out.println("правельный ответ:");
        int x=0;
        for(GetSet s: WraitFile.learEnglRussLish()){
            x++;
            System.out.println(x+":"+s.getEnglish());

        }String ss =sc.nextLine();
        String z=String.valueOf(i+1);
        while (!ss.equals(z)) {
            System.out.println("ответ не верный");
            System.out.println("попробуйте еще раз");
            ss=sc.nextLine();
        }
        System.out.println("вы ответили верно ");
    }
}
}
