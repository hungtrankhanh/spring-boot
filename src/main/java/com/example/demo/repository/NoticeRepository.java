package com.example.demo.repository;

import com.example.demo.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "from Notice n where NOW() BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();

}
