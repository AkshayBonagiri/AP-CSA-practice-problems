import java.util.ArrayList;

public class WordChecker
{
  /** Initialized in the constructor and contains no null elements */
  private ArrayList<String> wordList;

  /**
   * Returns true if each element of wordList (except the first) contains the previous
   * element as a substring and returns false otherwise, as described in part (a)
   * Precondition: wordList contains at least two elements.
   * Postcondition: wordList is unchanged.
   */

  public static boolean isWordChain(ArrayList<String> wordList)
  { 
      /* to be implemented in part (a) */ 
      for(int i = 1 ; i < wordList.size() - 1 ; i++){
        String current = wordList.get(i);
        String next = wordList.get(i+1);

        if(next.indexOf(current) == -1){
            return false;
        }
      }
      return true;
  }

  /**
   * Returns an ArrayList<String> based on strings from wordList that start
   * with target, as described in part (b). Each element of the returned ArrayList has had
   * the initial occurrence of target removed.
   * Postconditions: wordList is unchanged.
   *                 Items appear in the returned list in the same order as they appear in wordList.
   */
  public ArrayList<String> createList(String target)
  { 

    ArrayList<String> answer = new ArrayList<>();


      /* to be implemented in part (b) */ 
      for(int i = 0 ; i < wordList.size() ; i++){
        String current = wordList.get(i);

        if(current.indexOf(target) == 0){
            answer.add(current.substring(target.length()));
        }
      }
      return answer;
  }

  public static void main(String[] args){
    ArrayList<String> arr = new ArrayList<>();

    arr.add("to");
    arr.add("too");
    arr.add("stool");
    arr.add("tools");

    System.out.println(isWordChain(arr));

  }
  // There may be instance variables, constructors, and methods that are not shown.
}