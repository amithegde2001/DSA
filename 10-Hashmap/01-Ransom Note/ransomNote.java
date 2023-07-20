//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
import java.util.HashMap;

public class ransomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) < 1) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
