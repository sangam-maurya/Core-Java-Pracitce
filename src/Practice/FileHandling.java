package Practice;

import java.io.*;

public class FileHandling  {
    public static void main(String[] args) throws IOException {
        File f = new File("S://Maurya/D.txt");
       FileWriter fw = new FileWriter(f);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write("hi");
       bw.newLine();
       bw.write("sangam " );
       bw.newLine();
       bw.write("Maurya");

       bw.close();
       FileReader fr = new FileReader(f);
       BufferedReader br = new BufferedReader(fr);
        char ch[] = new char[(char)f.length()];
        br.read(ch);
        for (char x:ch){
            System.out.println(x);
        }
       br.read();

    }
}
