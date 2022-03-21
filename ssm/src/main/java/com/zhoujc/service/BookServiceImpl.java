package com.zhoujc.service;

import com.zhoujc.dao.BookMapper;
import com.zhoujc.pojo.Books;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author zhoujc
 * @Date 2022/3/17
 */
@Service
public class BookServiceImpl extends SqlSessionDaoSupport implements BookService {

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
