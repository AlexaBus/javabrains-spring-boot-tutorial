package tutorial.javabrains.springbootstarter.course.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.zip.CheckedOutputStream;

public interface CourseRepository extends CrudRepository<Course,String> {

    //beacuse our interface implements the spring-jpa crud repository i can declare methods named the "find" logic convention and
    //spring-jpa will know to implement and use the method

    List<Course> findByName(String name);
    List<Course> findByDescription (String description);

    //in the case of looking for items based on a FPK you need to specify the object: Topic and the field within the class by which to do the search: Id
    List<Course> findByTopicId(String topicId);

}
