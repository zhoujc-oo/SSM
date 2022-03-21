package com.zhoujc.dao;


import com.zhoujc.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.awt.print.Book;

/**
 * @Author zhoujc
 * @Date 2022/3/17
 */
@Mapper
public interface BookMapper {
    int addBook(Books books);

    int deleteBookById(@Param("bookId") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookId") int id);

    List<Books> queryAllBook();


}
