package iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
	private Book[] books;
    private int last = 0;
    
	@Override
	public Iterator<Book> iterator() {  // 반복자 책들을 모두 가져 올 수 있도록 준비
		return new BookShelfIterator(this);
	}
	
	public BookShelf(int maxsize) {  // 생성자
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) { // 해당 인덱스의 책을 리턴
        return books[index];
    }

    public void appendBook(Book book) { // 책을 추가
        this.books[last] = book;
        last++;
    }

    public int getLength() { // 책들의 총 건수
        return last;
    }

}
