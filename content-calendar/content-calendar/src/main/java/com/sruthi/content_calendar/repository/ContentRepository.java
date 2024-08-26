package com.sruthi.content_calendar.repository;
import org.springframework.data.repository.ListCrudRepository;
import java.util.List;
import com.sruthi.content_calendar.model.Content;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);
} 