import java.util.*;
public class ScoreInfo
{
    private int score;
    private int numStudents;
    public ScoreInfo(int aScore)
    {
        score = aScore;
        numStudents = 1;
    }
    /** adds 1 to the number of students who earned this score
        */
    public void increment()
    { numStudents++; }
    /** @return this score
        */
    public int getScore()
    { return score; }
    /** @return the number of students who earned this score
        */
    public int getFrequency()
    { return numStudents; }
}

class Stats
{
    private ArrayList<ScoreInfo> scoreList;
        // listed in increasing score order; no two ScoreInfo objects contain the same score
    /** Records a score in the database, keeping the database in increasing score order. If no other
        * ScoreInfo object represents score, a new ScoreInfo object representing score
        * is added to the database; otherwise, the frequency in the ScoreInfo object representing
        * score is incremented.
        * @param score a score to be recorded in the list
        * @return true if a new ScoreInfo object representing score was added to the list;
        * false otherwise
        */
    public boolean record(int score)
    { /* to be implemented in part (a) */ 
        boolean notPresent = true;
        for(int i = 0 ; i < scoreList.size() ; i++){
            ScoreInfo current = scoreList.get(i);
            if(current.getScore() == score){
                current.increment();
                notPresent = false;
            }
        }
        if(notPresent){
            ScoreInfo newScore = new ScoreInfo(score);
            for(int i = 1 ; i < scoreList.size() ; i++){
                ScoreInfo current = scoreList.get(i);
                ScoreInfo before = scoreList.get(i - 1);

                if(score > current.getScore() && score < before.getScore()){
                    scoreList.add(i,newScore);
                }
            }
        }
        return notPresent;  
    }
    

    /** Records all scores in stuScores in the database, keeping the database in increasing score order
        * @param stuScores an array of student test scores
        */
    public void recordScores(int[] stuScores)
    { /* to be implemented in part (b) */ }
    // There may be instance variables, constructors, and methods that are not shown.
}