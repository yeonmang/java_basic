package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        Member m  = new Member();
        m.changeName("박영희");
        m.changeName("홍길동");
        m.printName();
        m.information();
    }
}
