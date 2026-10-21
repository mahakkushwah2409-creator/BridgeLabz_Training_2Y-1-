package Recursion.Basic;

public class euclid_algo {
    public static int gcd(int x , int y) {
        if(y==0){
          return x;
        }
        int small = gcd(y, x%y);
        return small;
    }
    public static int lcm(int x , int y){
        return (x / gcd(x,y) *y);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12 ,16));
        System.out.println(lcm(12 , 16));
    }
}
