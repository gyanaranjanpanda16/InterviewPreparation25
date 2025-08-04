package com.curebay.interviewpreparation202525.JavaBasicProgram;

interface HelloWorld {
    default void printHelloWorld() {
        System.out.println("Hello World1");
    }
}
interface HelloWorld2 {
    default void printHelloWorld() {
        System.out.println("Hello World2");
    }
}
class  HelloWorldImpl implements HelloWorld, HelloWorld2 {

    public static void main(String[] args) {
        HelloWorldImpl hw = new HelloWorldImpl();
        hw.printHelloWorld();
    }
    @Override
    public void printHelloWorld() {
        System.out.println("Hello World");
    }
}