package com.alimama.server;

import javax.sound.midi.Soundbank;

/**
 * Created by jx on 2019/8/6.
 */
public class TestHello {
    public static void main(String[] args) {
        System.out.println(digui(5));
        noDiGui(5);
    }

    public static Integer digui(Integer integer){
        if (integer ==1){
            return integer;
        }else{
            return integer * digui(integer - 1);
        }
    }

    public static void noDiGui(Integer n){
        Integer total = 1 ;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println(total);
    }

}
