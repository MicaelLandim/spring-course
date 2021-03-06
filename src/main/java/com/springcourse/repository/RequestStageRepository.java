package com.springcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springcourse.domain.Request;
import com.springcourse.domain.RequestStage;
import com.springcourse.domain.enums.RequestState;

@Repository
public interface RequestStageRepository extends JpaRepository<RequestStage, Long> {
	
	public List<RequestStage> findAllByRequestId(Long id);
	
	@Query("UPDATE request_stage SET state = ?2 WHERE id = ?1")
	public Request updateStatus(Long id, RequestState state);

} 
