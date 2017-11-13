package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	private ReviewRepository reviewRepos;

	@Resource
	private CategoryRepository categoryRepos;

	@Resource
	private TagRepository tagRepos;

	@RequestMapping("/review")
	public String fetchReview(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelReview", reviewRepos.findOne(id));
		return "review-template";
	}

	@RequestMapping("/allreviews")
	public String showAll(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelCategory", categoryRepos.findOne(id));
		return "reviews-template";
	}

	@RequestMapping("/categories")
	public String findCategory(Model model) {
		model.addAttribute("modelCategories", categoryRepos.findAll());
		return "categories-template";
	}

	@RequestMapping("/onetag")
	public String fetchTag(@RequestParam("id") long id, Model model) {
		model.addAttribute("onetag", tagRepos.findOne(id));
		return "onetag";
	}

	@RequestMapping("/tags/create")
	public String createTag(@RequestParam String name) {
		Tag tag = new Tag(name);
		tagRepos.save(tag);
		return "redirect:/categories";
	}

	@RequestMapping("/tags/delete")
	public String deleteTag(@RequestParam long tagId) {
		Tag toBeDeleted = tagRepos.findOne(tagId);
		for (Review current : toBeDeleted.getReviewTags()) {
			current.removeTag(toBeDeleted);
			reviewRepos.save(current);
		}
		tagRepos.delete(toBeDeleted);
		return "redirect:/categories";
	}

	@RequestMapping("/review/tags/delete")
	public String untagReview(@RequestParam long tagId, @RequestParam long reviewId) {
		Tag toUntag = tagRepos.findOne(tagId);
		Review review = reviewRepos.findOne(reviewId);
		review.removeTag(toUntag);
		reviewRepos.save(review);
		return "redirect:/review?id=" + reviewId;
	}
}
