package filehandkingtopic;

import java.io.File;
import java.io.IOException;

public class Demo {
public static void main(String[] args) throws Exception {
	File f1=new File("C:\\Users\\Admin\\Desktop\\java\\wow.txt");
	if(f1.createNewFile())
	{
		System.out.println("file created");
	}
	else
	{
		System.out.println("file not created");
	}
}
}
