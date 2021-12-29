package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{

    @Override
    public String toString() {
        return super.toString() +
                "coupon=" + coupon +
                '}';
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    private boolean coupon;
    CookBook(){

    }

    public boolean isCoupon() {
        return false;
    }
}
