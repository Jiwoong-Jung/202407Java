package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
	private BookShelf bookShelf;
    private int index;
    
    public BookShelfIterator(BookShelf bookShelf) {  // 생성자
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    
	@Override
	public boolean hasNext() {  // 다음 책이 있나요
		if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
	}

	@Override
	public Book next() { // 다음 책을 가져올 때
		if (!hasNext()) {
            throw new NoSuchElementException(); // 예외 발생
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
	}

}
