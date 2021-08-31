package com.bulat.SpringBootTest.repo;

import com.bulat.SpringBootTest.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
