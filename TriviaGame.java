public class TriviaGame 
{ 
    private int totalScore; 
    private int streak; 
 
    /** 
     * Checks if the player's answer matches the correct answer. 
     * Returns true if correct, false otherwise. 
     */ 
    public boolean checkAnswer(String answer) 
    { /* implementation not shown */ } 
 
    /** 
     * Processes the player's answer, updates the score and streak, 
     * and returns the points earned for this turn, as described in 
part (a). 
     * Precondition: answer is not null. 
     */ 
    public int processTurn(String answer) 
    { /* to be implemented in part (a) */ 
        int points = 0;
        if(checkAnswer(answer)){
            totalScore += 50;
            points += 50;
            if(streak >= 1){
                totalScore += 10 * streak;
                points += 10 * streak;
            }
            streak++;
        }
        else{
            streak = 0;
        }
        return points;
    } 
 
    /** 
     * Generates a hint by masking certain characters in the answer, 
     * as described in part (b). 
     * Precondition: answer contains only uppercase letters. 
     */ 
    public String generateHint(String answer) 
    { /* to be implemented in part (b) */ 
        String ans = "";
        String vowels = "AEIOU";

        for(int i = 0 ; i < answer.length() ; i++){
            String letter = answer.substring(i,i+1);
            if(vowels.indexOf(letter) == -1){
                ans += "*";
            }
            else{
                ans += letter;
            }
        }
        return ans;
    } 
 
    /* There may be instance variables, constructors, and methods 
       that are not shown. */ 
}