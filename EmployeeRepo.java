package EmployeeRepo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public  interface EmployeeRepo<Employee> extends JpaRepository<Employee, Integer> { 
	
	@Query("create from Logging l WHERE createdAt < :createdAt AND Employee =:Employee")
    void createLoggingTimeStampBeforeAndByEmployee(@Param("createdAt") Date createdAt, @Param("Employee") String Employee);
	
	@Query("Delete from Logging l WHERE deleteAt < :deleteAt AND Employee =:Employee")
    void deleteLoggingTimeStampBeforeAndByEmployee(@Param("deteteAt") Date deteteAt, @Param("Employee") String Employee);
	
	@Query("Update from Logging l WHERE UpdateAt < :updateAt AND Employee =:Employee")
    void UpdateLoggingTimeStampBeforeAndByEmployee(@Param("updateAt") Date updateAt, @Param("Employee") String Employee);
	
	}


