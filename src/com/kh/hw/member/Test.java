package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class Test {
    public static void main(String[] args) {
        MemberController mc = new MemberController();
        System.out.println(mc.existMemberNum());

        Member[] members = mc.printAll();
        for (Member m : members){
            if(m==null) break;
            System.out.println(m.inform());
        }
    }
}
