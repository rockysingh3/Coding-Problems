Given two strings - input1 and input2, determine if they are isomorphic.Two strings are isomorphic if the letters in one
string can be remapped to get the second string. Remapping a letter means replacing all occurrences of it with another letter.
The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same
form or overall shape. Target linear time and space complexity with your solution.


public static boolean isIsomorphic(String input1, String input2) {

    if(input2 == null || input1 == null || input1.length() != input2.length()) return false;

    HashMap<Character, Integer> result = new HashMap<>();

    for(int i=0; i<=input2.length()-1; i++){
        char c = input2.charAt(i);
        char t = input1.charAt(i);

        if(result.containsKey(c)){
            result.put(c, result.get(c)+1);
        }else{
            result.put(c, 1);
        }

        if(result.containsKey(t)){
            result.put(t, result.get(t)+1);
        }else{
            result.put(t, 1);
        }
    } // end of for loop


    for(int i=0; i<input1.length(); i++){
        char c = input2.charAt(i);
        char t = input1.charAt(i);

        if(result.get(c) != result.get(t)){
            return false;
        }
    }

    return true;
}
