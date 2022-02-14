package ua.edu.chpt.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ua.edu.chpt.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
}
