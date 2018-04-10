package pw.cdmi.msm.activity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import pw.cdmi.msm.activity.model.entities.Activity;

public interface ActivityRepository extends PagingAndSortingRepository<Activity, String>,JpaRepository<Activity, String>{
	
	
}
