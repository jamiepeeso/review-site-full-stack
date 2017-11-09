package reviewssite.reviewssite;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id;

	public String tag;

	@ManyToMany(mappedBy = "allTags")
	private Set<Review> reviewTags;

	private Tag() {
	}

	public Tag(String tag) {
		this.tag = tag;
	}

	public long getId() {
		return id;
	}

	public Set<Review> getReviewTags() {
		return reviewTags;
	}

	public String getTag() {
		return tag;
	}

}
