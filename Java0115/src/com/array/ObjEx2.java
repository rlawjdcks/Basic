package com.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//이 아래는 파일 읽기 기능임  throws IOException, ClassNotFoundException 붙여주고 
		FileInputStream fis = new FileInputStream("c:/temp/acc.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 =(Acc) ois.readObject();
		System.out.println(acc2);

	}

}
