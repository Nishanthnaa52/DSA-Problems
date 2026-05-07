import java.io.*;
import java.util.*;

class Reader {

	public static void main(String args[])  throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		

		String val = buff.readLine();

		System.out.println(val);
	}

}