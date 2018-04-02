package tutorial.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//the interface crudrepo contains, out of the box, the 4 crud methods: create, retrieve, update, delete
//so, by extending it our interface gets all those methods
public interface TopicRepository extends CrudRepository<Topic,String> {
}
