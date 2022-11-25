package searching_algorithms.lenear_search;

public class StringSearch {
    public static void main(String[] args){
        String name = "Shanto";
        char target = 'a';
        boolean ans = search2(name, target);
        System.out.println(ans);
    }

    // using for each loop and convert the string toCharArray()
    private static boolean search2(String str, char target){
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }

    private static boolean search(String str, char target){
        for (int i = 0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
