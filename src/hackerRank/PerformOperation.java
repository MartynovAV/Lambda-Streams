package hackerRank;
//https://github.com/charles-wangkai/hackerrank/blob/master/java-lambda-expressions/Solution.java
//https://www.hackerrank.com/challenges/java-lambda-expressions/problem

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
    }
    PerformOperation isOdd() {
        return a -> a % 2==1;
    }
    PerformOperation isPrime() {
        return a -> {
            if (a <= 1)
                return false;
            // Check from 2 to n-1
            for (int i = 2; i < a; i++)
                if (a % i == 0)
                    return false;
            return true;
        };
    }
    PerformOperation isPalindrome() {
        return a ->{return Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());};
    }
}

class TestMain {
    public static void main(String[] args) {
        int n=744477;
        MyMath myMath = new MyMath();
        PerformOperation po;

        po=myMath.isPalindrome();
        boolean res=MyMath.checker(po,n);
        System.out.println(res);
    }

}