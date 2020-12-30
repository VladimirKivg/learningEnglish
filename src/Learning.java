import java.util.ArrayList;
import java.util.Scanner;

public class Learning {
    static Scanner sc = new Scanner(System.in);
static ArrayList<GetSet>learEnglRussLish(){
    ArrayList<GetSet> eng=new ArrayList<>();
    for (String s:WraitFile.lessonFile2()){
        String[] s2=s.split("\\-",2);
        GetSet getSet = new GetSet();
        getSet.setEnglish(s2[0]);
        getSet.setRusian(s2[1]);
        eng.add(getSet);
    }return eng;
}
//
//static ArrayList<String>rusian(){
//    ArrayList<String>ru=new ArrayList<>();
//        for (String s:WraitFile.lessonFile2()){
//            String[] s2=s.split("\\-",2);
//ru.add(s2[1]);
//    }return ru;
//}


//    public static void zadanie1(){
//    for (String s : WraitFile.lessonFile2()){
//    System.out.println(s);
//    sc.nextLine();}
//    for (int i=0;i<rusian().size();i++){
//        System.out.println(english().get(i));
//        System.out.println("правельный ответ:");
//        int x=0;
//        for(String s:rusian()){
//            x++;
//            System.out.println(x+":"+s);
//
//        }String ss =sc.nextLine();
//        String z=String.valueOf(i+1);
//        while (!ss.equals(z)) {
//            System.out.println("ответ не верный");
//            System.out.println("попробуйте еще раз");
//            ss=sc.nextLine();
//        }
//        System.out.println("вы ответили верно ");
//    }
//}
}
