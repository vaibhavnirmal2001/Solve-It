import java.net.Inet4Address;
import java.util.*;

class Solution{
//    public static boolean isPalindromeOne(String s){
//        for (int i = 0,j=s.length()-1; i < j; i++,j--) {
//            if (s.charAt(i)!=s.charAt(j))return false;
//
//        }
//        return true;
//    }
//     public static boolean isPalindrome(String s) {
//         s=s.replaceAll("[^a-zA-Z0-9]", "");
//         s=s.replaceAll("\\s", "");
//
//
//         return isPalindromeOne(s.toLowerCase());
//     }





//    static ArrayList<Integer> leaders(int arr[], int n){
//        // Your code here
//
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        if(n==0) return al;
//        if(n==1){
//            al.add(arr[0]);
//            return al;
//        }
//        int big = arr[n-1];
//        al.add(big);
//        for(int i=n-1;i>=0;i--){
//            if(arr[i]>big){
//                al.add(arr[i]);
//                big=arr[i];
//            }
//        }
//        Collections.reverse(al);
//        return al;
//    }





//    public static boolean isDistinct(String[] arr,int j ){
//        for(int i=0;i<arr.length;i++){
//            if(Objects.equals(arr[i], arr[j]) && i!=j) return false;
//        }
//        return true;
//    }
//    public static String kthDistinct(String[] arr, int k) {
//
//        String res="";
//        int dis=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(isDistinct(arr,i )){
//                dis++;
//                if(dis==k){
//                    return arr[i];
//                }
//            }
//        }
//        return res;
//
//
//    }



//    public static boolean isOdd(int[] a,int n){
//        int count=1;
//        for(int i=0;i<a.length;i++){
//            if(a[i]==a[n] && i!=n){
//                count++;
//            }
//        }
//        return count%2==0? false:true;
//    }
//    public static int getOddOccurrence(int[] arr, int n) {
//        ArrayList<Integer> al=new ArrayList<>();
//
//        for(Integer x: arr)al.add(x);
//
//        for(int i=0;i<n;i++){
//            if(isOdd(arr,i)) return arr[i];
//        }
//        return -1;
//    }





//    long findSwapValues(long A[], int n, long  B[], int m)
//    {
//        // Your code goes here
//
//        HashSet<Long> hs = new HashSet<>();
//
//        long diff = 0L;
//
//        for(long x : A){
//            diff += x;
//        }
//
//        for(long y : B){
//            diff -= y;
//            hs.add(y);
//        }
//
//        if(diff % 2 == 1) return -1;
//
//        for(long a : A){
//            if(hs.contains((long)((2*a - diff)/2))){
//                return 1;
//            }
//        }
//
//        return -1;
//    }



//
//    public static int calculateSetBits(String s){
//        int count=0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='1') count++;
//        }
//        return count;
//    }
//
//    public static boolean isPrime(int n){
//        if (n==0 || n==1) return false;
//        for (int i = 2; i <= n/2; i++) {
//            if(n%i ==0 ) return false;
//        }
////        System.out.println(n+" - ");
//        return true;
//    }
//
//    public static int countPrimeSetBits(int left, int right) {
//        int count=0;
//        for(int i=left;i<=right;i++){
//            String b= Integer.toBinaryString(i);
//
//            int n=calculateSetBits(b);
//
//            if(isPrime(n)) count++;
//        }
//        return count;
//    }






//    static long inversionCount(long arr[], long N)
//    {
//        // Your Code Here
//        if(N==0 || N==1) return 0;
//        long count=0;
//        for(int i=0;i<N-1;i++){
//            int j=i+1;
//            while (j<N) {
//                if(arr[i]>arr[j]) count++;
//                j++;
//            }
//        }
//        return count;
//
//    }




//    public static int lengthOfLIS(int[] nums) {
//        if (nums.length==0 || nums.length==1) return nums.length;
//
//        int count=1; int c;
//        for (int i = 0; i < nums.length-1; i++) {
//            c=1;
//            int temp=nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[j]>temp) {
//                    c++;
//                    temp=nums[j];
//                }
//            }
//            count= Math.max(count, c);
//        }
//        return count;
//
//    }




//    public static int josephus(int n, int k)
//    {
//        Queue<Integer> q = new ArrayDeque<>();
//        for(int i=1; i<=n; i++) q.add(i);
//
//        while(q.size()>1){
//            for(int i=1; i<=k-1; i++) q.offer(q.poll());
//            q.poll();
//        }
//        return q.peek();
//    }



//    public static int minIncrementForUnique(int[] A) {
//        if(A.length == 0) return 0;
//
//        int result = 0;
//        Arrays.sort(A);
//        int highestTillNow = A[0];
//
//        for(int i = 1; i<A.length; i++){
//            if(A[i] <= highestTillNow){
//                result += (highestTillNow-A[i]+1);
//                highestTillNow++;
//            }
//            else
//                highestTillNow = A[i];
//        }
//        return result;
//    }




//    public static int findClosestNumber(int[] nums) {
//        int smallestDis = nums[0];
//
//        for (int j = 1; j < nums.length; j++) {
//
//            if (Math.abs(smallestDis) == (nums[j])){
//                smallestDis = nums[j];
//            }
//            if(Math.abs(nums[j]) < Math.abs(smallestDis)){
//                smallestDis = nums[j];
//            }
//        }
//        return smallestDis;
//    }





//    public static int titleToNumber(String columnTitle) {
//        int n = columnTitle.length();
//
//        int columnNumber = 0;
//
//        for(int i = 0;i < n;i++){
//            int currentColumn = columnTitle.charAt(i) - 'A' + 1;
//            columnNumber = columnNumber * 26 + currentColumn;
//        }
//        return columnNumber;
//    }


//    public static List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String,List<String>> map=new HashMap<>();
//
//        for (String s : strs) {
//            char[] arr = s.toCharArray();
//            Arrays.sort(arr);
//            String str = new String(arr);
//
//            if (map.containsKey(str)) {
//                map.get(str).add(s);
//            } else {
//                map.put(str, new ArrayList<>());
//                map.get(str).add(s);
//            }
//        }
//        return new ArrayList<>(map.values());
//    }


//    public static boolean findTriplets(int arr[] , int n)
//    {
//
//        //add code here.
//        Arrays.sort(arr);
//        for(int i=0;i<n;i++){
//
//            int low=i+1;
//            int high=n-1;
//            while(low<high){
//                if(arr[low]+arr[high] +arr[i]==0){
//                    return true;
//                }
//                else if(arr[low]+arr[high] +arr[i]>0){
//                    high--;
//                }
//                else if(arr[low]+arr[high] +arr[i]<0){
//                    low++;
//                }
//            }
//        }
//        return false;
//    }




//    public static ArrayList<Integer> commonElements(int A[], int B[], int c[], int n1, int n2, int n3)
//    {
//        // code here
//        ArrayList<Integer> ans= new ArrayList<>();
//        ArrayList<Integer> a= new ArrayList<>();
//        ArrayList<Integer> b= new ArrayList<>();
//        ArrayList<Integer> ab= new ArrayList<>();
//        for(Integer x: A) if (!a.contains(x))a.add(x);
//        for(Integer x: B) if (!b.contains(x))b.add(x);
//        for(Integer x: c) if (!ab.contains(x)) ab.add(x);
//
//        for (Integer x : a) if (b.contains(x)&& ab.contains(x) && !ans.contains(x)) ans.add(x);
//
//        return ans;
//    }



//    public static int subtractProductAndSum(int n) {
//        int s=0;
//        int p=1;
//        while(n>0){
//            int temp=n%10;
//            p=p*temp;
//            s+=temp;
//            n/=10;
//        }
//        return p-s;
//    }



//    public static int maximum69Number (int num) {
//        String s= String.valueOf(num);
//        char[] c= s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (c[i]=='6'){
//                c[i]='9';
//                break;
//            }
//        }
//        return Integer.parseInt(new String(c));
//    }



    public static String addBinary(String a, String b) {
        int n1=Integer.parseInt(a,2);
        int n2=Integer.parseInt(b,2);
        return Integer.toBinaryString(n1+n2);
    }




     public static void main(String[] args) {
//         System.out.println(leaders(new int[]{16 ,17 ,4 ,3 ,5 ,2},6));
        // System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
//         System.out.println(getOddOccurrence(new int[]{1, 2, 3, 2, 3, 1, 3},7));

//         System.out.println(countPrimeSetBits(6,10));

        // System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
//         System.out.println(josephus(5,3));

//         System.out.println(minIncrementForUnique( new int[]{3,2,1,2,1,7}));

//         System.out.println(findClosestNumber( new int[]{-4,-2,1,4,8}));

        // System.out.println(titleToNumber("ZY"));

         //System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

       //  System.out.println(findTriplets(new int[]{0 ,-1 ,2 ,-3 ,1},5));

//         int[] a = {1, 5, 10, 20, 40, 80};
//         int[] b = {6, 7, 20, 80, 100};
//         int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
//
//         System.out.println(commonElements(a,b,c, args.length,b.length,c.length));

//         System.out.println(subtractProductAndSum(234));

         //System.out.println(maximum69Number(9669));

         System.out.println(addBinary("11","1"));

     }
 }

