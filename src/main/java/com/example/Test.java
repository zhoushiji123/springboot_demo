package com.example;

/**
 * Created by zsj on 2017/4/1.
 */
public class Test {

    public static void main(String[] args) {

        int x = Test.get();
        System.out.println(x);
    }


    public static int get(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return  3;
        }
    }



}
