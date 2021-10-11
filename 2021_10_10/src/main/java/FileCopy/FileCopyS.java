package FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileCopyS {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
	    System.out.println("만들 txt파일의 이름을 넣어주세요.");
		String Copy = scn.nextLine();
		Writer writer = new FileWriter("C://Temp/Test/" + Copy + ".txt");

		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a);
		writer.write(b);
		writer.write(c);

		writer.flush();
		writer.close();

		System.out.println("복사할 프로그램의 이름을 적어주세요.");
		String Copy1 = scn.nextLine();
		
		String before = "C://Temp/Test/" + Copy + ".txt";
		String after = "C://Temp/Test/" + Copy1 + "1" + ".txt";

		FileInputStream fis = new FileInputStream(before);
		FileOutputStream fos = new FileOutputStream(after);

		int data;
		byte[] readBy = new byte[100];
		while ((data = fis.read(readBy)) != -1) {
			fos.write(readBy, 0, data);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사완료");
	}
}
