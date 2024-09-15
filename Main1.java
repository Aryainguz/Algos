import java.util.*;

class LinearSearch{

    public static int FindIndexIntArr(int target) {
       int[] arr = {1,3,56,23,7,3};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int FindIndexCharArr(char target) {
       String s = "hello";
       for(int i=0;i<s.length();i++){
        if(target == s.charAt(i)){
            return i;
        }
       }
       return -1;
     }
}

class Main1{
    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        System.out.println(search.FindIndexIntArr(7));
        System.out.println(search.FindIndexCharArr('o'));
    }
}