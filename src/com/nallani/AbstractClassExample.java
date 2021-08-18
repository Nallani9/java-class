package com.nallani;

public abstract class AbstractClassExample {

    private static final String abc = "abc";
    private final String xyz = "xyz";
    public String jan = "jan";

    public int add() {
        int x = 10;
        int y = 20;
        return x + y;
    }

    public void sub() {
    }

    private void div() {
    }

    protected void multiply() {
    }

    final void hello() {
    }

    static void hi() {
    }

    public int addAllNumbers() {
        int b;
        int a = 10;
        b = a++;
        return b;
    }
}
