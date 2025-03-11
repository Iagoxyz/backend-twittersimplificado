package tech.backend.twittersimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.twittersimplificado.entity.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
