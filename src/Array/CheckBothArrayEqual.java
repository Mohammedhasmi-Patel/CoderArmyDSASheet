package Array;

import java.util.Arrays;
import java.util.HashMap;

public class CheckBothArrayEqual {

    public static boolean checkEqual2(int[] a, int[] b) {

        if(a.length != b.length){
            return false;
        }

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int x : a){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for(int y:b){
            if(!freq.containsKey(y)){
                return false;
            }

            freq.put(y,freq.getOrDefault(y,0)-1);
            if(freq.get(y)==-1){
                return false;
            }
        }

        for(int key:freq.keySet()){
            if(freq.get(key) != 0){
                return false;
            }
        }

        return true;
    }

    public static boolean checkEqual(int[] a, int[] b) {
        // code here

        if(a.length != b.length){
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
