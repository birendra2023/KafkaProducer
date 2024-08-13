package com.singletontest;

public class SingleTone {
    private static SingleTone INS;
    private SingleTone(){}
    public static SingleTone getInstances(){
        if(INS==null){
            synchronized(SingleTone.class){
                if(INS==null){
                    return new SingleTone();
                }
            }

        }
return  INS;
    }
}
