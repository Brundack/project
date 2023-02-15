package filehandkingtopic;

import java.io.*;

public class Test1 {
public static void main(String[] args)  throws Exception{
	File f1=new File("C:\\Users\\Admin\\Desktop\\java\\wow.txt");
	FileWriter fw=new FileWriter(f1);
	
	fw.write("summ");
	fw.write("coollll");
	fw.flush();
	System.out.println("Data is written");
}
}
