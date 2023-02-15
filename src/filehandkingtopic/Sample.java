package filehandkingtopic;
import java.io.File;
public class Sample {
public static void main(String[] args) {
	File f1=new File("C:\\Users\\Admin\\Desktop\\java");
	if(f1.mkdir())
	{
		System.out.println("u are there");
	}
	else
	{
		System.out.println("already thr");
	}
	if(f1.exists())
	{
		System.out.println("folder exist...");
	}
	else
	{
		System.out.println("folder doesnt exist..");
	}
//	if(f1.delete())
//	{
//		System.out.println("folder is delted");
//	}
//	else
//	{
//		System.out.println("folder is not deleted");
//	}
}
}
