package com.company;

// inefficient solution time complexity O(a*b - max(a,b))

//public class LCM {
//    static int lcm(int a, int b) {
//        int res = Math.max(a,b);
//        while (true) {
//            if (res % a == 0 && res % b == 0) {
//                return res;
//            } else
//                res++;
//        }
//    }
//
//    public static void main(String[] args) {
//        int a = 10, b =15;
//        System.out.println(lcm(a,b));
//    }
//}

// efficient solution using euclid algorithm, time complexity as same as gcd because we are only
// doing some extra constant no. of operations only i.e., O(log(min(a,b)))

public class LCM {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b,a % b);
    }
    static int lcm (int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(lcm(a, b));
    }
}
