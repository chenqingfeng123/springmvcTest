package com.cqf.controller;

import com.cqf.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//定义表现层控制器bean
@RestController
@RequestMapping("/books")
public class BookController {

    //设置映射路径为/save，即外部访问路径
    @RequestMapping("/save")
    public String save(@RequestBody Book book){
        System.out.println(book.toString());
        return "{'info':'springmvc'}";
    }

    //设置映射路径为/delete，即外部访问路径
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("id");
        return "{'info':'springmvc'}";
    }

    //查询所有
    @RequestMapping("/getAll")
    public List<Book> getAll(){
        List<Book> list = new ArrayList<>();
        Book book1 = new Book("computer","c++ plus","c++ language learning");
        Book book2 = new Book("computer","java prime","java language learning");
        list.add(book1);
        list.add(book2);
        return list;
    }
}
