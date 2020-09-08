package IO;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class FileIOTest {

	public static void main(String[] args) throws Exception {
		
		File file = new File("res/text.txt");
		
		if(!file.exists()) {
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0; i<10; i++) {
				String line = br.readLine()+"\n";
				dos.write(line.getBytes());
			}
			dos.close();
			fos.close();
		}
		else {
			FileInputStream fis = new FileInputStream(file);
			System.setIn(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				String read = br.readLine();
				if(read==null) break;
				System.out.println(read);
			}
			fis.close();
			br.close();
			file.delete();
		}
		
		
	}

}
