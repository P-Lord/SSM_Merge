package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookService;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并返回到书籍展示页面
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("lsit",list);
        return "allBook";
    }
}
