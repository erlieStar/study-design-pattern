package com.makenv.InterceptingFilter;

public class FirstFilter implements Filter {
    public void execute(String request) {
        System.out.println("FirstFilter " + request);
    }
}
