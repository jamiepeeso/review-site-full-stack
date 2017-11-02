package reviewssite.reviewssite;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class Review {

	private long id;
	private String hero;
	private String alias;
	private String imageUrl;
	private String brand;
	private String review;
	private String power;

	public Review(long id, String hero, String alias, String imageUrl, String brand, String review, String power) {
		this.id = id;
		this.hero = hero;
		this.alias = alias;
		this.imageUrl = imageUrl;
		this.brand = brand;
		this.review = review;
		this.power = power;
	}

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

	public String getBrand() {
		return brand;
	}

	public String getReview() {
		return review;
	}

	public String getPower() {
		return power;
	}

}
