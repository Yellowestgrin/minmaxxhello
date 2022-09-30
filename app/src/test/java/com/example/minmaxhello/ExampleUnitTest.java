package com.example.minmaxhello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        minmax Main = new minmax();

        assertEquals(Main.maxx(20,50),50);
        assertEquals(Main.maxx(10,1),10);
        assertEquals(Main.maxx(15,5),15);
        assertEquals(Main.maxx(2,0),2);

        assertEquals(Main.minn(6,72),6);
        assertEquals(Main.minn(50,44),44);
        assertEquals(Main.minn(11,5),5);
        assertEquals(Main.minn(0,12),0);

    }
}