package MinimumDominoRotations;
// https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/
public class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int countTops[] = new int[7];
        int countBottoms[] = new int[7];
        int sameNumber[] = new int[7];

        for(int i=0; i < tops.length; i++){
            int topElement = tops[i];
            int bottomElement = bottoms[i];
            countTops[topElement] += 1;
            countBottoms[bottomElement] +=1;
            if(topElement == bottomElement ){
                sameNumber[topElement] += 1;
            }
        }
        for(int j = 0; j < 7 ; j++ ){
            if(countTops[j] + countBottoms[j] - sameNumber[j] == tops.length){
                return tops.length - Math.max(countTops[j], countBottoms[j]);
            }
        }
        return -1;
    }
}
