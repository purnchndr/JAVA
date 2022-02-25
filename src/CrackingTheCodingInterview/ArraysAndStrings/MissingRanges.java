package CrackingTheCodingInterview.ArraysAndStrings;

//Given a sorted integer array nums, where the range of elements are in the inclusive range [lower, upper],
// return its missing ranges.
//        Example:
//        Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
//        Output: ["2", "4->49", "51->74", "76->99"]

public class MissingRanges {
    public static String giveRanges(int[] ranges, int start, int end){
        int s = start;
        for(int i =0; i < ranges.length;i++){
            if(s> ranges[i])
                continue;
            else if(s <= ranges[i]){

            }
        }

        return null;
    }
}
