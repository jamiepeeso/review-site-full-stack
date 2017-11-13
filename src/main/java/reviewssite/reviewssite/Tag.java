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

	public String name;

	@ManyToMany(mappedBy = "allTags")
	private Set<Review> reviewTags;

	public Tag() {
	}

	public Tag(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public Set<Review> getReviewTags() {
		return reviewTags;
	}

	public String getTag() {
		return name;
	}

}
