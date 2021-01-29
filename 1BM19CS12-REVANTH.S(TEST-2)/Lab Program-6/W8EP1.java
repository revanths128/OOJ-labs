import cie.*;
import see.*;
import java.util.*;
class W8EP1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        externals[] e = new externals[2];
        internals[] in = new internals[2];
        for(int i=0;i<2;i++){
            int usn1 = input.nextInt();
            String name1 = input.next();
            int sem1 = input.nextInt();
            int[][] cie = new int[2][5];
            int[][] see = new int[2][5];
            for(int j=0;j<5;j++){
                cie[i][j] = input.nextInt();
            }
            for(int j=0;j<5;j++){
                see[i][j] = input.nextInt();
            }
            e[i] = new externals(usn1,name1,sem1,see[i]);
            in[i] = new internals(usn1,name1,sem1,cie[i]);
            int total = 0;
            System.out.println("Name: "+e[i].name);
            System.out.println("USN: "+e[i].usn);
            System.out.println("sem: "+e[i].sem);
            for(int j=0;j<5;j++){
                total = e[i].seeMarks[j]+in[i].cieMarks[j];
                System.out.print("Final marks: "+total+" ");
            }
            System.out.println();
        }
    }
}
