package Ex;

public class MovieReviewRef {
    public static void main(String[] args) {
        MovieReview Review1 = new MovieReview();
        Review1.title = "아이언장애인맨";
        Review1.review = "개꿀잼 ㅋㅋ";

        MovieReview Review2 = new MovieReview();
        Review2.title = "트랜스포머";
        Review2.review = "개십꿀잼 ㅋㅋ";

        MovieReview[] Reviews = {Review1, Review2};
        for (MovieReview s : Reviews) {
            System.out.println("제목 : " + s.title + "리뷰 :" + s.review);
        }
    }
}
