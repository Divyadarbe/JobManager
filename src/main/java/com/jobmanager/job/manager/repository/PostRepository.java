package com.jobmanager.job.manager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobmanager.job.manager.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {
//if we have customized method then we can add here- methods which is not supported
}
