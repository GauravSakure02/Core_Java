package filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test05_DIS {
	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = 
				new DataInputStream(new FileInputStream("data.txt"));
		
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
		
		dis.close();
		
	}
}