package reviewssite.reviewssite;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW") // look into this more
public class Review {

	// Variables

	@Id
	@GeneratedValue
	private long id;

	private String hero;
	private String alias;
	private String imageUrl;
	@Lob
	private String review;

	@ManyToOne
	private Category category;

	@ManyToMany
	private Set<Tag> allTags;

	// Review Constructor
	public Review(String hero, String alias, String imageUrl, Category category, String review, Tag... allTags) {
		this.hero = hero;
		this.alias = alias;
		this.imageUrl = imageUrl;
		this.category = category;
		this.review = review;
		this.allTags = new HashSet<>(Arrays.asList(allTags));
	}

	// making JPA happy
	public Review() {

	}
	// Getters

	public long getId() {
		return id;
	}

	public String getHero() {
		return hero;
	}

	public String getAlias() {
		return alias;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getReview() {
		return review;
	}

	public Category getCategory() {
		return category;
	}

	public Set<Tag> getAllTags() {
		return allTags;
	}

}
