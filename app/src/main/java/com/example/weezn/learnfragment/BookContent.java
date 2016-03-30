package com.example.weezn.learnfragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BookContent
 *
 * @author: weezn
 * @time: 2016/3/29 22:43
 */
public class BookContent {

    public static class Book
    {
        public Integer id;
        public String title;
        public String desc;

        public Book(Integer id,String title,String desc){
            this.desc=desc;
            this.id=id;
            this.title=title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static List<Book> ITEMS=new ArrayList<Book>();

    public static Map<Integer,Book> ITEM_MAP =new HashMap<Integer,Book>();

    private static void addITem(Book book){
        ITEMS.add(book);
        ITEM_MAP.put(book.id,book);
    }

//    静态块
    static
    {
        addITem(new Book(1,"疯狂java讲义","就是一本书"));
        addITem(new Book(2,"数据库","还是一本书"));
        addITem(new Book(3,"电子技术","依旧是一本书"));
    }


}
