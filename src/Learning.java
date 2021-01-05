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

        // с таким раскладом пока не особо вижу смысел в лямдах, нужно будет еще раз по ним пройтись
        // x - как счетчик не считает, незнаю как правильно зделать, в лямде это по другому работает
//WraitFile.learEnglRussLish().stream().forEach((GetSet ii)->{
//    int y=0;y++;
//    System.out.println(ii.getRusian());
//    System.out.println("правельный ответ");
//    WraitFile.learEnglRussLish().stream().forEach((GetSet iu) ->  {
//        int x=0;
//        System.out.println(x+" "+iu.getEnglish());
//        x++;
//    });
//    String ss= sc.nextLine();
//    while (!ss.equals(String.valueOf(y))){
//        System.out.println("ответ не верный ");
//        System.out.println("попробуйте еще раз:");
//        ss=sc.nextLine();
//    }
//    System.out.println("ты молодец");
//});
    for (int i = 0; i< WraitFile.learEnglRussLish().size(); i++){
        System.out.println(WraitFile.learEnglRussLish().get(i).getEnglish());
        System.out.println("правельный ответ:");
        int x=0;
        for(GetSet s: WraitFile.learEnglRussLish()){
            x++;
            System.out.println(x+":"+s.getEnglish());
        }
        String ss =sc.nextLine();
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
