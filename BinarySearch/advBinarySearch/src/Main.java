//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static long kthRoot(long n, int k){
        long ans = 1;

        long lo = 1 , hi = n;
        while(lo <= hi){
            long mid = (hi +lo)/2;
            if(Math.pow(mid ,k ) <= n){
                lo = mid + 1;
                ans = Math.max(mid , ans);
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("answer: " + kthRoot(44,4));
    }
}