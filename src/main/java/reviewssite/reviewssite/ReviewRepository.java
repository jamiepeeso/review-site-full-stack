package reviewssite.reviewssite;

import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;

@Component
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
