import java.util.Random;
import java.util.Scanner;
public class LabJava {
    public int count(){
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        return count;
    }
    public String generate() {
        Random random= new Random();
        String symbols = "QWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder randString = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        for(int i=0;i<count;i++)
            randString.append(symbols.charAt(random.nextInt(symbols.length())));
        System.out.println(randString);
        return randString.toString();
    }
    //}
    public static void main(String[] args) {
        //StringGenerator s = new StringGenerator();
        //s.generate();
        LabJava s=new LabJava();
        s.generate();
    }
}
