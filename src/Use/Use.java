package Use;


import DataStructures.StringBuild;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Algorithms.Utility.swap;

public class Use {

    public static void solve(int n){
        StringBuild build = new StringBuild(10);
        build.append("Hello");
        System.out.println(build.getSize());
        System.out.println(build.getCapacity());
        build.append(" Balachandran");
        System.out.println(build);
        System.out.println(build.getSize());
        System.out.println(build.getCapacity());
        System.out.println();
    }

    public static int solve(String a, String b, int i, int j){
        if( i== a.length() ||j == b.length())
            return 0;
//        if()
//            return 0;
        int ans = 0;
        if(a.charAt(i) == b.charAt(j))
            ans = solve(a,b,i+1,j+1)+1;
        else
            ans =Math.max(solve(a,b,i+1,j),solve(a,b,i,j+1));
        return ans;
    }

    public static void swapAlternate(int[] arr){
        for(int i = 1; i< arr.length ;i +=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        for(int i : arr)
            System.out.print(i+", ");

        //int min = arr[0];

    }

    public static void findMinMax(int[] arr){
        int min = arr[0], max= arr[0];
        for(int i = 0; i< arr.length ;i++){
            min = min < arr[i]? min : arr[i];
            max = max > arr[i] ? max: arr[i];
        }

        //for(int i : arr)
            System.out.print("Min :"+ min+",  Max : "+max);

        //int min = arr[0];

    }
    public static void rotateBy1(int[] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-1; i>=1; i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
    }

    public static void rotateByk(int[] arr, int k){
        for (int j = 0; j < k; j++){
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i>=1; i--)
                arr[i] = arr[i-1];
            arr[0] = temp;
        }
    }

    public static void rotateByK(int[] arr, int k){

        int ind = 0;
        int n = arr.length;
        int[] temp = new int[k];
        for(int i = n-k; i< n; i++)
            temp[ind++] = arr[i];
        ind = n-1;
        for (int j = n-k-1; j >=0 ; j--)
            arr[ind] = arr[j];
        for (int j = 0;  j< temp.length ; j++)
                arr[j] = temp[j];

    }

    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int max = Math.max(A.length, Math.max(B.length, C.length));
        int a = 0;
        int b = 0;
        int c = 0;
        int k = 0;
        while( k < max){
            int ans = Integer.MAX_VALUE;
            if(a < n1) ans = Math.min(ans, A[a]);
            if(b < n2) ans = Math.min(ans, B[b]);
            if(c < n3) ans = Math.min(ans, C[c]);
            if(ans == A[a]) a++;
            else if(ans == B[b]) b++;
            else if(ans == C[c]) c++;
            if(k <= 1){
                res.add(ans);
                k++;
                continue;
            }

//            if(res.get(k-1) != ans)
//                res.add(ans);
//            k++;
        }
        return res;
    }

    public static void moveNegatives(int[] arr){
        int j = 0;
        for(int i = 0; i< arr.length; i++)
            if(arr[i] < 0 && i != j){
                int temp = arr[j];
                arr[j++] = arr[i];
                arr[i] = temp;
        }
    }

    public static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List < List < Integer >> result = new ArrayList < > ();
        for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
            // Skip all duplicates from left
            // num1Idx>0 ensures this check is made only from 2nd element onwards
            if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
                continue;
            }

            int num2Idx = num1Idx + 1;
            int num3Idx = nums.length - 1;
            while (num2Idx < num3Idx) {
                int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                if (sum == 0) {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));

                    num3Idx--;

                    // Skip all duplicates from right
                    while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1])
                        num3Idx--;
                }
                else if (sum > 0) {
                    // Decrement num3Idx to reduce sum value
                    num3Idx--;
                } else {
                    // Increment num2Idx to increase sum value
                    num2Idx++;
                }
            }
        }
        return result;
    }

    public static int getGcd(int num1, int num2){
        if(num1 == 0)
            return num2;
        if(num1 < 0 || num2 < 0)
            return 0;
        return getGcd(num1%num2, num2);
    }

    public static int getPow(int i, int j){
        int res = 1;
        for(int k = 1; k<= j; k++){
            res *= i;
        }
        return res;
    }

    public static int getFact(int num){
        if(num < 0) throw new IllegalStateException("Can't calculate Factorial of -ve number");
        if(num < 2) return num;
        return num * getFact(num-1);
    }

    public static boolean printCount(int num){
        if(num <= 0)return false;
        printCount(num-1);
        System.out.println(num);
        return false;
    }



    public static int getMax(int[] arr, int index, int max){
        if(index == arr.length)
            return max;
        if(arr[index] > max)
            max = arr[index];
        return  getMax(arr, index+1, max);
    }

    public static  int binarySearch(int[] arr, int start, int end, int target){
        if(start > end) return -1;
        int mid = start+(end-start)/2;
        int ans = -1;
        if(arr[mid] == target)  return mid;
        else if(arr[mid] < target) ans =  binarySearch(arr,mid+1,end,target);
        else   ans = binarySearch(arr,start,mid-1,target);
        return ans;
    }

    public static int getPowerOfTwo(int n){
        if(n == 0) return 1;
        int ans = getPowerOfTwo(n>>1);
        if((n&1) == 1)
            ans = ans * ans * 2;
        else ans = ans * ans;
        return ans;
    }

    public static int getSum(int[] arr, int index){
        if(index == 0)  return arr[index];
        return arr[index]+ getSum(arr, index-1);
    }

    public static String reverseStr(String str, int length){
        if(length == str.length()) return "";
        return reverseStr(str,length+1) + str.charAt(length);
    }

    public static void reverseStr(char[] str, int start){
        int end = str.length-1-start;
        if(start >= end) return;
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        reverseStr(str,++start);
    }

    public static boolean isPalindrome(String str1, int start){
        int end = str1.length()-1-start;
        if(start >= end) return true;
        if(str1.charAt(start) != str1.charAt(end)) return false;
        return isPalindrome(str1,++start);
    }

    public static int getPowOf(int num, int pow){
        if(pow == 0) return 1;
        else if(pow == 1) return num;
        num = getPowOf(num, pow/2);
        return (pow & 1) == 0 ? num * num : num * num * num;
    }

    public static int count = 0;
    public static void bubbleSort(int[] arr, int size){
        if (size < 2)
            return;
        count++;
        boolean isSorted = true;
        for (int i = 0; i <size-1; i++)
            if (arr[i] > arr[i+1]) {
                swap(arr, i, i + 1);
                isSorted = false;
            }
        if(isSorted) return;
        bubbleSort(arr,size-1);

    }

    public static void insertionSort(int[] arr, int i){
        if(i < 2)
            return;;
        int curr = arr[i];
        int j = i;
        for (; j > 0; j--){
            if(arr[j-1] >curr)
                arr[j] = arr[j-1];
            else break;
        }
        arr[j] = curr;
        insertionSort(arr, i-1);
    }

    public static ArrayList<String> printSubString(String str, int index, String res){
        if(index == str.length()) {
            ArrayList<String> arr =  new ArrayList<>();
            arr.add(res);
            return arr;
        }
        char c = str.charAt(index);
        ArrayList<String> arr =  new ArrayList<>();
        arr.addAll(printSubString(str,index+1, res));
        arr.addAll(printSubString(str,index+1, res+c));
        return arr;
    }

    public static void subString(String str, int index, String res){
        if(index == str.length()) {
            System.out.println(res);
            return;
        }
        char c = str.charAt(index);
        subString(str, index+1, res);
        subString(str, index+1, res+c);

    }

    public static void printPermutations(String inputString, String result){
        if(inputString.length() == 0){
            System.out.println(result);
            return;
        }

        for(int i = 0; i< inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            String newSubString = inputString.substring(0, i) + inputString.substring(i + 1);
            printPermutations(newSubString, result+currentChar);
        }

    }


    public static void main(String[] args){
        String str = "ab3";
        printPermutations(str, "");
    }
}
