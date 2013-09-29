package com.huskycode.dojo.tdd.lesson1;

public class Grade {
    public int compute(int score) {
        if(score < 0) throw new Underflow();
        if(score > 100) throw new Overflow();

        if (score >= 80) return 4;
        if (score >= 70) return 3;
        if (score >= 60) return 2;
        if (score >= 50) return 1;
        return 0;
    }

    class Underflow extends RuntimeException {}
    class Overflow extends RuntimeException {}
}
