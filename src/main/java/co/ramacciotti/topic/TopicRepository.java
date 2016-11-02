package co.ramacciotti.topic;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TopicRepository extends PagingAndSortingRepository<Topic,Long> {
}
