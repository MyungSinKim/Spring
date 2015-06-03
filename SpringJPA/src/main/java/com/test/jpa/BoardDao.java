package com.test.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by JuHyun on 2015. 5. 31..
 */
public interface BoardDao  extends JpaRepository<Board, Long> {
}
