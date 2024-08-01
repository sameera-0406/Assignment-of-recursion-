import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {

    assignment 1 

    public static void oddnum(int a,int b,int sum){
        if(a>b){
            System.out.println(sum);
            return;
        }
        sum+=a;
        oddnum(a+2,b,sum);
    }
    public static void main(String[] args) {
        oddnum(3,7,0);
    }

    public static int climbways(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        return climbways(n-1)+climbways(n-2)+climbways(n-3); 
    }
    public static void main(String[] args) {
        System.out.println(climbways(5));
    }


    public static void power(int n){
        if(n == 1){
            System.out.println("true");
            return;
        }
        if(n%2==0){
            power(n/2);
        }else{
            System.out.println("false");
            return;
        }
    }
    public static void main(String[] args) {
        power(15);
    }

    public static void print(int[] arr,int i){
        if(i<0) return;
        print(arr, i-1);
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        print(arr,arr.length-1);
    }

    public static void search(int[] arr,int target,int i){
        if (i==arr.length-1) {
            System.out.println(-1);
            return;
        }
        if (arr[i]==target) {
            System.out.println(i);
            return;
        }
        search(arr, target, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        search(arr,10,0);
    }

    public String countandsay(int n){
        if (n==1) {
            return "1";
        }
        String s = countandsay(n-1);
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if (s.charAt(i)==s.charAt(j)) {
                j++;
            }else{
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len=j-i;
        ans+=len;
        ans+=s.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4;
        String result = solution.countandsay(n);
        System.out.println("the number is : "+ n +"the result is : "+ result);
    }

    public static void sumTriangle(int[] arr){
        if (arr.length < 1) {
            return;
        }
        int[] nextlevel = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            nextlevel[i] = arr[i]+arr[i+1];            
        }
        System.out.println(Arrays.toString(arr));
        sumTriangle(nextlevel);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sumTriangle(arr);
    }

    public static void reverse(int n,int r){
        if (n<1) {
            return;
        }
        r = n % 10;
        n/=10;
        System.out.print(r);
        reverse(n, r);
    }
    public static void main(String[] args) {
        int n = 123;
        reverse(n,0);
    }

    assignment no.2

    ques 1 and 2

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        generateSubset(nums,res,0,new ArrayList<>());
        return res;
    }
    public static void generateSubset(int[] nums,List<List<Integer>> res,int index,List<Integer> subList){
            res.add(new ArrayList<>(subList));
        for (int i = index; i < nums.length; i++) {
            if (i>index && nums[i]==nums[i-1]) {
                continue;
            }
            subList.add(nums[i]);
            generateSubset(nums, res, i+1, subList);
            subList.remove(subList.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = subset(nums);
        for (List<Integer> subset : res) {
            System.out.println(subset);
        }
    }

    ques 3

    public static int common(String a,String b ,int i,int j,int count){
        if(j==b.length()){
            return count;
        }
        while(i < a.length()) {
            if(a.charAt(i)==b.charAt(j)){
                count = common(a, b, i+1, j+1, count+1);
                break;
            }else{
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String a = "zabce";
        String b = "abcee";
        int count=0;
        count=common(a,b,0,0,count);
        System.out.println("count is:"+count);
    }

    ques 4

    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial is: "+fact(n));
    }

    ques 5

    public static String binary(int n){
        if (n==0) {
            return "";
        }
        return binary(n/2)+(n%2);
    }
    public static void main(String[] args) {
        int n = 3;
        String s = binary(n);
        System.out.println("decimal of no. "+n+" is : "+s);
    }
    
}
