package Use;


import DataStructures.StringBuild;
import Exceptions.*;

import java.math.BigDecimal;
import java.util.*;

import static Algorithms.Utility.swap;

public class Use {
    int age;
    Use(){
        this.age = 10;
    }
    Use(int age){
        this.age = age;
    }
    
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
        if(arr.length < 2)
            return;
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

    public static int getIndex(String a, String b){
        if(a.length() < b.length())
            return -1;

        for(int i = 0; i< a.length() && i< b.length(); i++ ){
            int index = 0;
            boolean flag = false;
            if(a.charAt(i) == b.charAt(index)){
                flag = true;
                while(true){
                    if(a.charAt(index+i) != b.charAt(index)){
                        flag = false;
                        break;
                    }
                    index++;
                    if(index == b.length())
                        return i;
                }
            }
            if(flag)
                i = index;
        }
        return -1;
    }

    public static String removeString(String a, String b){
        while(a.contains(b)){
            int index = a.indexOf(b);
            a = a.substring(0,index)+a.substring(index+b.length());
        }
        return a;
    }

    private static void findSubsets(int array[]) {
        int numOfSubsets = 1 << array.length;

        for (int i = 0; i < numOfSubsets; i++) {
            int pos = array.length - 1;
            int bitmask = i;

            System.out.print("{");
            while (bitmask > 0) {
                if ((bitmask & 1) == 1)
                    System.out.print(array[pos] + ",");
                bitmask >>= 1;
                pos--;
            }
            System.out.print("}");
        }
    }
    private static class User implements Comparable<User> {
        int point;
        public User(int point) {
            this.point= point;
        }

        @Override
        public int compareTo(User user) {
            return this.point - user.point;
        }
        @Override
        public String toString( ) {
            return "Point = " + this.point;
        }
    }
    public static <T extends Comparable<T>> T getMax(T item1, T item2){
        return (item1.compareTo(item2) > 0)? item1 : item2;
    }

    public static <K, V> void print(K key, V value){
        System.out.println("Key : "+key + " || Value : "+value);
    }
    int fun(){
        return 20;
    }

    public static ArrayList<Integer> findAllPrimesTillN(int n){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2);
        boolean[] map = new boolean[n+1];
        for (int i = 3; i<=n; i++){
            if(map[i]) continue;
            if(isPrime(i)) {
                for (int j = i + i; j <= n; j = j + j)
                    map[j] = true;
                list.add(i);
            }
        }

        return list;
    }
    private static boolean isPrime(int num){
        if(num <1)
            return false;
        int count = 0;
        for (int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
                count++;
        }
        return count < 1;
    }

    public static ArrayList<Integer> findAllPrimesTillN2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i<=n; i++)
            if(isPrime(i))
                list.add(i);
        return list;
    }
    static int count1 =0;

    public static int fibbo(int n){
        if(n < 2)
            return n;
        count1++;
        return fibbo(n-1)+fibbo(n-2);
    }

    public static int fibboDP(int n){
        if(n < 2)
            return n;
        int first= 0;
        int second = 1;
        int currFibb = first + second;
        for(int i = 2; i <= n; i++){
            System.out.println(currFibb);
            count1++;
            currFibb = first + second;
            first = second;
            second = currFibb;
        }
        return currFibb;
    }

    public static void arrengeNum(int num)  {
        int start = 0;
        int end = num-1;

      int [] arr = new int[num];
      for(int i = 0; i< num;i++){
          if(i % 2 == 0){
              arr[start++] = i+1;
             // start +=2;
          }
          else {
              arr[end--] = i + 1;
              //end -=2;
          }

      }
        for (int i : arr)
            System.out.println(i);

    }


    public static int findUniqueNumber(int [] arr){
        if(arr == null || arr.length ==0)
            return Integer.MIN_VALUE;
        int res = 0;
        for (int j : arr)
            res = res ^ j;
        return res;
    }

    public static int findDuplicateNumber(int [] arr){
        if(arr == null || arr.length == 0)
            return Integer.MIN_VALUE;
        int n = arr.length;
        int res = 0;
        for (int j : arr)
            res +=  j;
        int sum = ((n-1)*(n-2))/2;
        return res-sum;
    }

    public static int findDuplicateNumber2(int [] arr){
        if(arr == null || arr.length == 0)
            return Integer.MIN_VALUE;

        int res = 0;
        for (int j : arr)
            res = res ^ j;
        int sum=0;
        for(int i = 0; i < arr.length-1; i++)
            sum = sum ^ i;
        return res^sum;
    }

    public static int binarySearch(int[] arr,int target){
        int start = 0,end = arr.length-1, mid = (start+end)/2;
        while(start <= end){
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]< target)
                start = mid+1;
            else
                end = mid-1;
            mid = (start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{1,2,4,5,7},4));
    }




}
