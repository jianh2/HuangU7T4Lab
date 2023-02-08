import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayListAlgorithms {
    /**
//     * Returns true if any of the elements in stringList contain
//     * target as a substring; false otherwise.  Use indexOf instead of contains
//     * for AP practice! (although in reality, contains is preferred)
//     * <p>
//     * Does NOT mutate (modify) elements of stringList.
//     * PRECONDITION: stringList.size() > 0
//     *
//     * @param stringList original arraylist of Strings
//     * @return true if target is found in any of the strings, false otherwise
//     */
//    public static boolean containsTarget(ArrayList<String> stringList, String target) {
//        for (int i = 0; i < stringList.size(); i++) {
//            if (stringList.get(i).indexOf(target) > 0 || stringList.get(i).equals(target)) {
//                    return true;
//            }
//        }
//        return false;
//    }
//
//    public static int belowAverage(ArrayList<Integer> intList)
//    {int count = 0;
//     double average = 0;
//    for (int i = 0; i < intList.size(); i++){
//        average+= intList.get(i);
//    }
//    average = average / intList.size();
//
//    for (int i = 0; i < intList.size(); i++){
//        if ( intList.get(i) < average){
//            count++;
//        }
//    }
//    return count;
//    }
//    public static void replaceWithCaps(ArrayList<String> wordList)
//    {for (int i = 0; i< wordList.size(); i++){
//    if (wordList.get(i).substring(wordList.get(i).length()-1).equals("s")){
//        wordList.set(i, wordList.get(i).toUpperCase());
//    }
//    }


//    public static int indexOfMinimum(ArrayList<Integer> intList) {
//    int minimum = intList.get(0);
//    for (int i = 0; i < intList.size(); i++){
//        if (intList.get(i) < minimum){
//            minimum = intList.get(i);
//        }
//    }
//
//    for (int i = 0; i < intList.size(); i++){
//        if (intList.get(i) == minimum){
//            return i;
//        }
//    }
//    return 1;
//    }
//    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
//    {
//       for (int i = 0; i < numList1.size(); i++){
//           if (numList1.get(i) != numList2.get(i)){
//               return false;
//           }
//       }
//       return true;
//    }

//    public static void removeOdds(ArrayList<Integer> numList) {
//
//        {
//            for (int i = 0; i < numList.size(); i++) {
//                if (numList.get(i) % 2 > 0) {
//                    numList.remove(i);
//                    i--;
//                }
//            }
//        }
//    }
//    public static void wackyVowels(ArrayList<String> wordList)
//    {
//    for (int i = 0; i < wordList.size(); i++){
//        if (wordList.get(i).contains("a") || wordList.get(i).contains("e") ||  wordList.get(i).contains("i") ||  wordList.get(i).contains("o")){
//            wordList.remove(i);
//            i--;
//        }else{
//            wordList.add(i,wordList.get(i));
//            i++;
//        }
//    }
//
//    }

//    public static void duplicateUpperAfter(ArrayList<String> wordList)
//    {for (int i = 0; i < wordList.size(); i++){
//    wordList.add(wordList.get(i).toUpperCase());
//    i++;
//    }
//    }
//    public static ArrayList<String> parseWordsAndReverse(String sentence) {
//        ArrayList<String> arr = new ArrayList<String>();
//        int count = 0;
//        if (sentence.indexOf(" ") < 0){
//            arr.add(sentence);
//            return arr;
//        }
//
//        String[] words = sentence.split(" ");
//        words.asList();
//
//            for (int i = words.length-1; i <= 0; i--){
//                arr.add(count,words[i]);
//                count++;
//            }
//
//
//        return arr;
//
//
//
//
//
//    }
    public static ArrayList<Integer> modes(int[] numList)
    {
        int mode = numList[0];
        int maxMode = 0;
        int count  = 0;
        int maxCount = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numList.length; i++){
            if (numList[i] == mode){
                count++;
                maxCount++;
                list.add(i)
            }else{
                if (count > maxCount)
                maxMode = mode;
                mode = numList[i];
            }

        }

    }
}
