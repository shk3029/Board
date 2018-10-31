package programmers;

import java.util.HashMap;
import java.util.Iterator;

public class Hash_level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis(); 
		System.out.println("start");		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String result = solution(participant, completion);
		System.out.println(result);
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + ( end - start ));
	}
	
	public static String solution(String[] participant, String[] completion) {
        boolean answer = "";
        
        return answer;
    }

}
