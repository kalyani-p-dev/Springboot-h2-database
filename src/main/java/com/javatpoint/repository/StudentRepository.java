/*package com.javatpoint.repository;

public class StudentRepository {

}*/

package com.javatpoint.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.javatpoint.model.Student;  
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  