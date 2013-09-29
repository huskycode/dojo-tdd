package com.huskycode.dojo.tdd.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {

    private Grade grade = new Grade();

    @Test
    public void whenScoreIs80OrMore_gradeIs4() {
        assertEquals(4, grade.compute(81));
        assertEquals(4, grade.compute(80));
    }

    @Test
    public void whenScoreIs70OrMore_gradeIs3() {
        assertEquals(3, grade.compute(71));
        assertEquals(3, grade.compute(70));
    }

    @Test
    public void whenScoreIs60OrMore_gradeIs2() {
        assertEquals(2, grade.compute(61));
        assertEquals(2, grade.compute(60));
    }

    @Test
    public void whenScoreIs50OrMore_gradeIs1() {
        assertEquals(1, grade.compute(51));
        assertEquals(1, grade.compute(50));
    }

    @Test
    public void whenScoreIsLessThan50_gradeIs0() {
        assertEquals(0, grade.compute(49));
    }

    @Test(expected = Grade.Underflow.class)
    public void whenScoreIsLessThan0_ThrowUnderflow() {
        grade.compute(-1);
    }

    @Test(expected = Grade.Overflow.class)
    public void whenScoreIsMoreThan100_ThrowOverflow() {
        grade.compute(101);
    }
}
