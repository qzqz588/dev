package Ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "노무 재밌노 이기야";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃타임";
        abouttime.review = "너무 슬프고 감동적임";

        MovieReview[] movieReviews = {inception,abouttime};

        for (MovieReview s : movieReviews) {
            System.out.println(s.title + s.review);
        }
    }
}
