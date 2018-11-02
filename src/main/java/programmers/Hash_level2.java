package programmers;

import java.util.Arrays;

/*
 *  https://programmers.co.kr/learn/courses/30/lessons/42577
 *  합격 (테스트 o 효율성 o)
 */ 
public class Hash_level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");		
		String[] phone_book = {"97674223", "1195524421","112", "99", "97"};
		boolean result = solution(phone_book);
		System.out.println(result);
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(String phonebook : phone_book) System.out.println(">>>>>>>>>>>>" + phonebook);
        
        
   /*     List<String> list = new ArrayList<>();
        
        for(int i=0; i<phone_book.length; i++) {
        	if(i==0) {
        		list.add(phone_book[0]);
        	} else {
        		for(int j=0; j<list.size(); j++) {
        			if(phone_book[i].length() <= list.get(j).length()) {
                 		if(list.get(j).contains(phone_book[i]) && list.get(j).indexOf(phone_book[i]) == 0 && !list.get(j).equals(phone_book[i]) ) {
                 			answer = false;
                 		}
                 	} else {
                 		if(phone_book[i].contains(list.get(j)) && phone_book[i].indexOf(list.get(j)) == 0 && !list.get(j).equals(phone_book[i])) {
                 			answer = false;
                 		}
                 	}      			
        		}
        	}
        }*/
         
      /*  HashMap<String, Boolean> map = new HashMap<>();
        for(String number : phone_book) map.put(number, false);
 
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
        	String key = (String) iterator.next();
        	 for(int i=0; i<phone_book.length; i++) {
             	if(phone_book[i].length() <= key.length()) {
             		if(key.contains(phone_book[i]) && key.indexOf(phone_book[i]) == 0 && !key.equals(phone_book[i]) ) {
             			answer = false;
             		}
             	} else {
             		if(phone_book[i].contains(key) && phone_book[i].indexOf(key) == 0 && !key.equals(phone_book[i])) {
             			answer = false;
             		}
             	}
             }        	
        } */
        return answer;
    }

}
