package com.company;

// optimized solution, by using euclid algorithm i.e., gcd(a, b) = gcd(a-b, b),
// time complexity O(log(min(a,b)))

//public class GCD {
//    static int gcd(int a, int b)
//    {
//        if(b==0)
//            return a;
//
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        int a = 12, b = 15;
//
//        System.out.println(gcd(a, b));
//    }
//}

// non optimized solution, by using euclid algorithm i.e., gcd(a, b) = gcd(a-b, b)

//public class GCD {
//    static int gcd(int a, int b)
//    {
//        while(a!=b)
//        {
//            if(a > b)
//                a = a - b;
//            else
//                b = b - a;
//        }
//
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int a = 12, b = 15;
//
//        System.out.println(gcd(a, b));
//    }
//}

// naive solution, time complexity O(min(a,b)), it depends on minimum number

public class GCD {
    static int gcd(int a, int b) {
        int res = Math.min(a,b);
        while(res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res --;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println(gcd(a,b));
    }
}
