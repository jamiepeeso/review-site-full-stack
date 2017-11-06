package reviewssite.reviewssite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	private String power;
	@Lob
	private String review;

	@ManyToOne
	private Category category;

	// Review Constructor

	public Review(long id, String hero, String alias, String imageUrl, String review, String power) {
		this.id = id;
		this.hero = hero;
		this.alias = alias;
		this.imageUrl = imageUrl;
		this.review = review;
		this.power = power;
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

	public String getPower() {
		return power;
	}

}
