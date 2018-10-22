package examples.first.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 내가 만드는 클래스
public class CollectiuonSortTest {
    public static void main(String[] args){
        List<Book> list = new ArrayList<>();
        list.add(new Book("홍길동전", 3000));
        list.add(new Book("즐거운자바", 4000));
        list.add(new Book("jsp", 2000));

//        Collections.sort(list);
        Collections.sort(list, new BookComparator());

        for(Book book : list){
            System.out.println(book.getTitle() + ", " + book.getPrice());
        }

    }
}

class BookComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

// 홍길동이라는 사람이 만든 클래스.
class Book implements Comparable<Book>{
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        // Book type의 클래스가 가지는 메소드 안에서
        // 파라미터로 들어온 Book타입의 필드를 비교할 때는
        // private이어도 사용할 수 있다.
        return price - o.price;
    }
}
