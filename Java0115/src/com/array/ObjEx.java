package com.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Acc implements Serializable{
	int x;
	@Override
	public String toString() {
		
		
		return "Acc [x=" + x + ", y=" + y + "]";
	}
	String y;
}

public class ObjEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Acc acc = new Acc();
		acc.x = 100;
		acc.y = "가난다";
		System.out.println(acc);
		
		//여기부터 아래 이부분만 알아도 파일 등록 가능 implements Serializable이거는 적어야함 클래스에
		FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		oos.flush();
		oos.close();
		

		FileInputStream fis = new FileInputStream("c:/temp/acc.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 =(Acc) ois.readObject();
		System.out.println(acc2);
		
		
		
	}

}
