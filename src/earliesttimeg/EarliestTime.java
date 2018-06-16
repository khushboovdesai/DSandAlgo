package google;

/**
 * Created by khush on 5/3/2018.
 */
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class EarliestTime {
    public String solutions(String S) {
        // write your code in Java SE 8
        int hour = Integer.parseInt(S.substring(0,2));
        int mins = Integer.parseInt(S.substring(3,5));

        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();

        for(int i=0;i<S.length();i++){
            if(hashMap.containsKey(S.charAt(i)))
                hashMap.put(S.charAt(i),hashMap.get(S.charAt(i))+1);
            else
                hashMap.put(S.charAt(i),1);
        }

        HashMap<Character,Integer> newHashMap = new HashMap<Character,Integer>();
        while(true){

            if(++mins==60){
                mins=0;
                ++hour;
                hour%=24;
            }

            String T = String.format("%02d:%02d",hour,mins);
            for(int i=0;i<T.length();i++){
                if(newHashMap.containsKey(T.charAt(i)))
                    newHashMap.put(T.charAt(i),newHashMap.get(T.charAt(i))+1);
                else
                    newHashMap.put(T.charAt(i),1);
            }
            boolean existsDigit = true;

            for(int i=0;i<T.length();++i){


                if((S.indexOf(T.charAt(i))<0) ){
                    existsDigit = false;

                    newHashMap.clear();
                    break;
                }

                if(hashMap.get(T.charAt(i)) != newHashMap.get(T.charAt(i))){

                    existsDigit = false;

                    newHashMap.clear();
                    break;
                }

            }

            if(existsDigit)
                return T;
        }
    }
}