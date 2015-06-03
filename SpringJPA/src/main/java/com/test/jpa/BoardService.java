package com.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JuHyun on 2015. 5. 31..
 */
@Service
public class BoardService {
@Autowired
    BoardDao boardDao;

    public List<Board> findBoardAll(){
       return boardDao.findAll();
    }
}
