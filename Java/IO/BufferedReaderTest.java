package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		
		//BufferedReader 문자스트림을 버퍼에 모아 한줄씩 읽음, 문자 스트림 클래스를 생성자의 파라미터로 받음
		//문자 스트림 클래스 : Reader 추상클래스 
		// InputStreamReader : Reader를 상속받는 문자 스트림 클래스, 표준 입출력(바이트 스트림 클래스) 스트림을 생성자의 파라미터로 받음
		// System.in : 표준입력 java.lang 패키지의 System 클래스에 static 맴버로 선언되어있음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		// System.out : 표준 출력  java.lang 패키지의 System 클래스에 static 맴버로 선언되어있음
		System.out.println("입력받은 내용 : " + line);
	}

}
