package com.zhoujc.service;

import com.zhoujc.pojo.Books;


import java.awt.print.Book;
import java.util.List;

/**
 * @Author zhoujc
 * @Date 2022/3/17
 */
public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
