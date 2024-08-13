package com.jobmanager.job.manager.repository;

import java.util.List;

import com.jobmanager.job.manager.model.Post;

public interface SearchRepository {

   List<Post> findByText(String text);
}
