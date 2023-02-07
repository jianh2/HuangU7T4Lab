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
    public static void replaceWithCaps(ArrayList<String> wordList)
    {for (int i = 0; i< wordList.size(); i++){
    if (wordList.get(i).substring(wordList.get(i).length()-1).equals("s")){
        wordList.set(i, wordList.get(i).toUpperCase());
    }
    }

}
    public static int indexOfMinimum(ArrayList<Integer> intList) {
    int minimum = intList.get(0);
    for (int i = 0; i < intList.size(); i++){
        if (intList.get(i) < minimum){
            minimum = intList.get(i);
        }
    }

    for (int i = 0; i < intList.size(); i++){
        if (intList.get(i) == minimum){
            return i;
        }
    }
    return 1;
    }

}
