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

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoryName;
	private String categoryImage;

	@OneToMany(mappedBy = "category")

	private Collection<Review> heroCollective;

	public Category() {

	}

	public Category(long id, String categoryName, String categoryImage, Collection<Review> heroCollective) {
		this.id = id;
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
		this.heroCollective = heroCollective;
	}

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
		return heroCollective;
	}

}
