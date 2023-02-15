package filehandkingtopic;
import java.io.*;
public class Cool {
public static void main(String[] args) throws Exception {
	File f1=new File("C:\\Users\\Admin\\Desktop\\java\\sum.txt");
	FileWriter fw=new FileWriter(f1);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hello");
	bw.newLine();
	bw.write("hii");
	bw.newLine();
	bw.flush();
	System.out.println("data is written");
	
}
}
