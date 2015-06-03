package com.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by JuHyun on 2015. 6. 3..
 */
@RestController
public class SimpleController {
    @Autowired BoardService boardService;

    @RequestMapping("/")
    public List<Board> index(){

        return  boardService.findBoardAll();
    }
}
