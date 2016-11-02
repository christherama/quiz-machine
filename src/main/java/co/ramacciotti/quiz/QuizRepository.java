package co.ramacciotti.quiz;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface QuizRepository extends PagingAndSortingRepository<Quiz,Long> {
}
