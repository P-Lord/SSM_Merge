package dao;

import pojo.Books;

import java.util.List;

public interface BookMapper {

    //增
    int addBook(Books books);

    //删
    int deleteBookById(int id);

    //改
    int updateBook(Books books);

    //查
    Books queryBookById(int id);

    List<Books> queryAllBook();

}
