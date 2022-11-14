import java.util.*;


// class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class leetCode {
//    public static int firstUniqChar(String s) {
//        for(int i=0;i<s.length();i++){
//            boolean isFound=false;
//            for (int j = 0; j < s.length(); j++) {
//                if(s.charAt(i)==s.charAt(j)&& i!=j){
//                    isFound=true;
//                    break;
//                }
//            }
//            if (!isFound) return i;
//        }
//
//        return -1;
//    }

//    public static String defangIPaddr(String s) {
//        String res= "";
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)!='.'){
//                res+=s.charAt(i);
//            }else {
//                res+="[.]";
//            }
//        }
//        return res;
//    }



//    public static int finalValueAfterOperations(String[] s) {
//        int count=0;
//        for (String x: s){
//            if (x.charAt(1)=='-'){
//                count--;
//            }if (x.charAt(1)=='+'){
//                count++;
//            }
//        }
//        return count;
//    }



//    public int uniqueMorseRepresentations(String[] words) {
//        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//        HashSet<String> s = new HashSet<>();
//        for (String w : words) {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < w.length(); ++i) {
//                sb.append(d[w.charAt(i) - 'a']);
//            }
//            s.add(sb.toString());
//        }
//        return s.size();
//    }

//    public static boolean isPossible(int[] a) {
//        int n = a.length;
//        Map<Integer , Integer> frq = new HashMap<>();
//        for(int e : a){
//            frq.put(e , frq.getOrDefault(e , 0) + 1);
//        }
//        Map<Integer , Integer> hm = new HashMap<>(); // hypothetical map
//        for(int i = 0; i < n; i++){
//            if(frq.get(a[i]) == 0) continue;
//            if(hm.getOrDefault(a[i] , 0) > 0){ // if this number can be fit into previously started subsequence
//                hm.put(a[i] , hm.get(a[i]) - 1);
//                hm.put(a[i] + 1 , hm.getOrDefault(a[i] + 1 , 0) + 1);
//            }
//            else{ // need to start its own subsequence
//                int cnt = 0;
//                if(frq.getOrDefault(a[i] + 1 , 0) > 0){
//                    cnt++;
//                    frq.put(a[i] + 1 , frq.get(a[i] + 1) - 1);
//                }
//                if(frq.getOrDefault(a[i] + 2 , 0) > 0){
//                    cnt++;
//                    frq.put(a[i] + 2 , frq.get(a[i] + 2) - 1);
//                }
//                if(cnt != 2){
//                    return false;
//                }
//                hm.put(a[i] + 3 , hm.getOrDefault(a[i] + 3 , 0) + 1);
//            }
//            frq.put(a[i] , frq.get(a[i]) - 1);
//        }
//        return true;
//    }


//    public static boolean checkIfExist(int[] arr) {
//        ArrayList<Integer> al = new ArrayList<>();
//        for (Integer x: arr)al.add(x);
//
//        for (int i = 0; i < arr.length; i++) {
//            int j = arr[i];
//            if (al.contains(j) && (al.contains(j * 2) && j != 0)) return true;
//        }
//        return false;
//
//    }




//    public static int hammingWeight(int n) {
////         String s = Integer.toString(n);
//
////         int sum = 0;
////         for(int i=0;i<s.length();i++){
////             if(s.charAt(i)=='1') sum+=1;
////         }
////         return sum;
//
//        int ones = 0;
//        while(n!=0) {
//            ones = ones + (n & 1);
//            n = n>>>1;
//        }
//        return ones;
//
//    }




//    public static List<String> summaryRanges(int[] nums) {
//        ArrayList<String> al=new ArrayList<>();
//
//        for(int i=0;i<nums.length;i++){
//            int start=nums[i];
//            while(i+1<nums.length && nums[i]+1==nums[i+1]) {
//                i++;
//            }
//
//            if(start!=nums[i]){
//                al.add(""+start+"->"+nums[i]);
//            }
//            else{
//                al.add(""+start);
//            }
//        }
//        return al;
//    }



//    public static int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int max = Integer.MIN_VALUE, sum = 0;
//
//        for(int i=0;i<n;i++){
//            sum += nums[i];
//            max = Math.max(sum,max);
//
//            if(sum<0) sum = 0;
//        }
//
//        return max;
//    }




//    public static int[] twoSum(int[] nums, int target) {
//        int[] ans= {-1,-1};
//       Map<Integer, Integer> m= new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (m.containsKey(target-nums[i])){
//                return new int[]{m.get(target-nums[i]),i};
//            }
//            m.put(nums[i],i);
//        }
//        return ans;
//
//    }


//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
//        while (tail1 >= 0 && tail2 >= 0) {
//            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
//                    nums1[tail1--] : nums2[tail2--];
//        }
//
//        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
//            nums1[finished--] = nums2[tail2--];
//        }
//    }


//    public static int arraySign(int[] nums) {
//        double sum=1;
//        for(Integer x: nums) {
//            sum*=x;
//        }
//
//        if(sum>0) return 1;
//        else if(sum<0) return -1;
//        else return 0;
//    }


//    public static boolean isHappy(int n) {
//        if(n==1)return true;
//        if(n<9) return false;
//        int p=0;
//        while(n>=1){
//            int lastDigit=n%10;
//            p+=(lastDigit*lastDigit);
//            n/=10;
//        }
//        return isHappy(p);
//    }







//    public static boolean isPalindrome(ListNode head) {
//
//        ArrayList<Integer> al = new ArrayList<>();
//        ListNode curr = head;
//
//        while(curr!=null){
//            al.add(curr.val);
//            curr=curr.next;
//        }
//        for (int i = 0,j=al.size()-1; i < j; i++,j--) {
//            if (al.get(i)!=al.get(j)){
//                return false;
//            }
//        }
//        return true;
//    }



//    public static int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (Integer x: nums1){
//            int freq= hm.getOrDefault(x,0);
//            hm.put(x,freq+1);
//        }
//
//        ArrayList<Integer> al = new ArrayList<>();
//        for (Integer i: nums2){
//            if (hm.get(i)!=null && hm.get(i)>0){
//                al.add(i);
//                hm.put(i,hm.get(i)-1);
//            }
//        }
//
//        int[] ret = new int[al.size()];
//        for(int i = 0; i < al.size();i++){
//            ret[i] = al.get(i);
//        }
//        return ret;
//    }

//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        for (int j = 0; j < nums1.length; j++) {
//            int x = nums1[j];
//            boolean filled=false;
//            for (int i = getIndexOf(nums1[j],nums2); i < nums2.length; i++) {
//                if (nums2[i] > x) {
//                    ans[j]=nums2[i];
//                    filled=true;
//                    break;
//                }
//            }
//            if (!filled) ans[j]=-1;
//        }
//        return ans;
//    }
//    public static int getIndexOf(int k,int[] a){
//        for (int i = 0; i < a.length; i++) {
//            if (a[i]==k) return i;
//        }
//        return a.length;
//    }




//    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int count=0;
//        for(Integer x: arr1){
//            for (int i = 0; i < arr2.length; i++) {
//                if (x<= arr2.length) count++;
//            }
//            ans.add(count);
//        }
//        return ans;
//    }


//    public static boolean canConstruct(String s1, String s2) {
//
//        ArrayList<Character> al = new ArrayList<>();
//        for (int i = 0; i < s2.length(); i++) {
//            al.add(s2.charAt(i));
//        }
//        for (int i = 0; i < s1.length(); i++) {
//            if (!al.contains(s1.charAt(i))) return false;
//            else al.set(al.indexOf(s1.charAt(i)),' ');
//        }
//        return true;
//
//    }


//    public void moveZeroes(int[] nums) {
//        int count=0;
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int num : nums) {
//            if (num == 0) count++;
//            else al.add(num);
//        }
//        for (int i = 0; i < count; i++) {
//            al.add(0);
//        }
//        for (int i = 0; i < al.size(); i++) {
//            nums[i]=al.get(i);
//        }
//
//    }


//    public int maximumWealth(int[][] m) {
//        int maxAmount=0;
//        for (int i = 0; i < m.length; i++) {
//            int currSum=0;
//            for (int j = 0; j < m[0].length; j++) {
//                currSum+=m[i][j];
//            }
//            maxAmount=Math.max(currSum,maxAmount);
//        }
//        return maxAmount;
//    }


//    public static int diagonalSum(int[][] m) {
//        int sum=0;
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[0].length; j++) {
//                if (i==j) sum+=m[i][j];
//                if(j==m[0].length-1-i){
//                    if (j!=i)
//                        sum+=m[i][j];
//                }
//            }
//        }
//        return sum;
//    }

//    public static int[][] matrixReshape(int[][] nums, int r, int c) {
//        ArrayList<Integer> al= new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[0].length; j++) {
//                al.add(nums[i][j]);
//            }
//        }
//        int[][] reshaped = new int[r][c];
//        int k=0;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                reshaped[i][j]=al.get(k);
//                k++;
//            }
//        }
//
//        return reshaped;
//    }




//    public static String mergeAlternately(String s1, String s2) {
//        String res="";
//        String smaller = s1.length()<s2.length()?s1:s2;
//        String larger = s1.length()>s2.length()?s1:s2;
//
//        for (int i = 0; i < s1.length()&&i<s2.length(); i++) {
//            res+= s1.charAt(i);
//            res+= s2.charAt(i);
//        }
//        for (int i = smaller.length(); i < larger.length(); i++) {
//            res+=larger.charAt(i);
//        }
//
//        return res;
//
//    }



//    public static String interpret(String s) {
//        String res="";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='G') res+=s.charAt(i);
//            if (s.charAt(i)=='(' && s.charAt(i+1)==')') {
//                res+='o';
//                i++;
//            }
//            if (s.charAt(i)=='(' && s.charAt(i+1)=='a'){
//                res+="al";
//                i+=3;
//            }
//        }
//        return res;
//    }



    public static char findTheDifference(String s, String t) {
        char c= 0;

        for (Character i: s.toCharArray()) c^=i;
        for (Character i: t.toCharArray()) c^=i;
        return c;
    }


    public static void main(String[] args) {
        String s="abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));





        // System.out.println(interpret("G()()()()(al)"));






        //System.out.println(mergeAlternately("ab","pqrs"));








//        int[][] mat = {{1,2},{3,4}}; int r = 1, c = 4;
//        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));





//        System.out.println(diagonalSum(new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        }));



//        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
//        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));




        //
        //
        //
        // System.out.println(isHappy(19));
        //System.out.println(arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));


//        int[] a=new int[]{-1,0,0,3,3,3,0,0,0};
//        merge(a,6,new int[]{1,2,2},3);
//        System.out.println(Arrays.toString(a));


        //System.out.println(firstUniqChar("loveleetcode"));

        //System.out.println(defangIPaddr("1.1.1.1"));

        //System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        //System.out.println(isPossible(new int[]{1,2,3,3,4,5}));

        //System.out.println(checkIfExist(new int[]{0,0}));
        //System.out.println(hammingWeight(00000000000000000000000000001011));
        //System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        //System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        //System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

    }
}
