package com.leoLW.javasestudy.day08.ObjectOriented;

public class Book {

    private String name;
    private int pageNum;

    public Book(){}

    public Book(int pageNum) { //在构造函数中调用setPageNum方法，控制book的pageNum属性,这样就不需要将控制语句写两边了
        setPageNum(pageNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("[系统]书本页数不能少于200页");
            this.pageNum = 200;
            return;
        } else {
            this.pageNum = pageNum;
        }
    }

    public void detail() {
        System.out.println("[系统]教材名称<" + getName() + ">页数<" + getPageNum() + ">");
    }
}
