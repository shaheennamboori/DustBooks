package com.astabits.dustbooks;

public class ExampleItem {
    private String mtitle;
    private String mauthor;
    private String msubcode;
    private String mprice;
    private String mcollege;

    public ExampleItem(String title,String author,String subcode,String price,String college){
        mtitle = title;
        mauthor = author;
        msubcode = subcode;
        mprice = price;
        mcollege = college;
    }

    public String getMtitle() {
        return mtitle;
    }

    public String getMauthor() {
        return mauthor;
    }

    public String getMsubcode() {
        return msubcode;
    }

    public String getMprice() {
        return mprice;
    }

    public String getMcollege() {
        return mcollege;
    }
}
