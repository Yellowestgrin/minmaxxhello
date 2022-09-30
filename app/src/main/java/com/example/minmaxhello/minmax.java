package com.example.minmaxhello;

public class minmax {
    public int minn(int x, int y){
        if (x>y)
            return y;
        return x;
    }
    public int maxx(int x, int y){
        if (x>y)
            return x;
        return y;
    }
}
