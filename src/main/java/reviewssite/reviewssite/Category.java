package reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Category {

	
	// Variables
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoryName;
	private String categoryImage;

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	// used for JPA

	public Category() {

	}

	public Category(String categoryName, String categoryImage) {
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
	}

	// Getters

	public long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getCategoryImage() {
		return categoryImage;
	}

	public Collection<Review> getHeroCollective() {
		return reviews;
	}

}
