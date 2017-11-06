package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepos;

	@Resource
	private CategoryReposirty categoryRepos;

	@Override
	public void run(String... args) throws Exception {

		// Category things
		Category DC = new Category("DC", "imageurl");
		Category Marvel = new Category("Marvel", "imageUrl");
		
		
		categoryRepos.save(DC);
		reviewRepos.save(Marvel);

	}

}
