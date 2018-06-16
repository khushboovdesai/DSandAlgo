package arrays.andStrings.CTCIproblems;

/**
 * Created by khush on 5/14/2018.
 */
public class Main {
    public static void main(String[] args){

        String str = "Khushboo";
        boolean isUnique = IsUniqueCharsInString(str);
        System.out.print(isUnique);
    }

/*Brute Force Solution:- Complexity = O(N^2)*/
    /*
    public static boolean IsUniqueCharsInString(String str){

        if(!(str!=null)){
            System.out.println("Null string in input");
            return false;
        }

        else if(str == "") {
            System.out.println("Empty string in input");
            return true;
        }

        else{
            for(int i=0; i<str.length()-1;i++){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        return false;
                    }
                }
            }
            return true;
        }

    }*/

    /*Optimized Solution:- Complexity = O(N)*/
    public static boolean IsUniqueCharsInString(String str){

        boolean[] charSet_flag = new boolean[128]; //as ASCII string has 128 chars=> represented as num between 0-127=> 65->A
        for(int i=0;i<str.length();i++){

            int charValue = str.charAt(i);      //gives ASCII integer of a particular string char
            if(charSet_flag[charValue])         //checks if flag at that position is true(a char exists)
                return false;                   //not unique
            else
                charSet_flag[charValue] = true; //if not present, change flag to true until next same char is encountered
        }
        return true;                            //if not encountered, its a unique string so return true

    }

}
