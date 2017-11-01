package reviewssite.reviewssite;

public class Review {

	private long id;
	private String dish;
	private String imageUrl;
	private String cuisine;
	private String review;
	private String restaurant;
	private int rating;

	public Review(long id, String dish, String imageUrl, String cuisine, String review, String restaurant, int rating) {
		this.id = id;
		this.dish = dish;
		this.imageUrl = imageUrl;
		this.cuisine = cuisine;
		this.review = review;
		this.restaurant = restaurant;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public String getDish() {
		return dish;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCuisine() {
		return cuisine;
	}

	public String getReview() {
		return review;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public int getRating() {
		return rating;
	}
}
