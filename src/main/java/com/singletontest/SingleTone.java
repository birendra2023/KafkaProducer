package com.singletontest;

public class SingleTone {
    private static SingleTone INS=new SingleTone();
    private SingleTone(){}
    public static SingleTone getInstances(){
        if(INS==null){
            synchronized(SingleTone.class){
                return new SingleTone();
            }

        }
return  INS;
    }
}
