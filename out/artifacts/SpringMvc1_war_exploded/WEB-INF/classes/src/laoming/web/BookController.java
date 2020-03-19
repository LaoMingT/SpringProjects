package laoming.web;

import laoming.entity.Book;
import laoming.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller    //@Controller注解：采用注解的方式定义该类为处理请求的Controller类

public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping ( "/hello" )
    public ModelAndView showView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "index" );

        Book b= bookService.getById("1");
        modelAndView.addObject( "msg" , " 对应的属性值，它是一个对象 "+b.getName() );
        return modelAndView;
    }

}

