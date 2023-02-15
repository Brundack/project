package filehandkingtopic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Test2 {
public static void main(String[] args) throws Exception {
	File f1=new File("C:\\Users\\Admin\\Desktop\\java\\wow.txt");
	FileReader fr=new FileReader(f1);
	char arr[]=new char[(int)f1.length()];
	fr.read(arr);
	String s1=new String(arr);
	System.out.println(s1);
}
}
