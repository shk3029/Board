package programmers;

import java.util.HashMap;
import java.util.Iterator;

public class Hash_level1 {

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
        String answer = "";
        
        HashMap<String, Integer> solutionMap = new HashMap<>();
        for(int i=0; i<participant.length; i++) {
        	solutionMap.put(participant[i], solutionMap.getOrDefault(participant[i],0) + 1);  
        }
        for(int i=0; i<completion.length; i++) {
        	solutionMap.put(completion[i], solutionMap.get(completion[i])-1);  
        }
             
        Iterator<String> iterator = solutionMap.keySet().iterator();
        while(iterator.hasNext()) {
        	String key = (String) iterator.next();

        	if(solutionMap.get(key) != 0) {
        		answer = answer + key;
        	}
        }
      
        return answer;
/*      
 * 		다른사람풀이  
 * 		HashMap<String, Integer> solutionMap2 = new HashMap<>();
        for(String player : participant) solutionMap.put(player, solutionMap.getOrDefault(player,0) + 1);       
        for(String player : completion) solutionMap.put(player, solutionMap.get(player) - 1);
        
        for(String key : solutionMap.keySet()) {
        	if(solutionMap.get(key) != 0) {
        		answer = key;
        	}
        }
        return answer;*/
    }

}
