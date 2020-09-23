package test;

import java.io.Serializable;

/**
 * @author hc
 * @create 2020/9/24 0024 0:38
 */
public class BookSerialization implements Serializable {

    private int bookId;

    private int bookNo;

    private String bookName;

    private double bookPrice;

    public BookSerialization() {
    }

    public BookSerialization(int bookId, int bookNo, String bookName, double bookPrice) {
        this.bookId = bookId;
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "BookSerialization{" +
                "bookId=" + bookId +
                ", bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
