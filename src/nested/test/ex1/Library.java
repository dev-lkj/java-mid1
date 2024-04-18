package nested.test.ex1;

public class Library {
    //`Library` 클래스를 완성해라.
    //`LibraryMain` 과 실행 결과를 참고하자.
    //`Book` 클래스는 `Library` 내부에서만 사용된다. `Library` 클래스 외부로 노출하면 안된다.
    //`Library` 클래스는 `Book` 객체 배열을 사용해서 도서 목록을 관리한다

    //코드 작성
    private Book[] books;
    private int bookCount;
    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }
    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }
    private static class Book {
        private String title;
        private String author;
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
