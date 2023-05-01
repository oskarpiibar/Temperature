package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter{
    private static HashMap<String, Double> bookValues = new HashMap<>();
    static {
        bookValues.put("1", 10.0);
        bookValues.put("2", 45.0);
        bookValues.put("3", 20.0);
        bookValues.put("4", 35.0);
        bookValues.put("5", 50.0);
    }

    public double getBookPrice(String isbn){
        if (bookValues.containsKey(isbn)){
            return bookValues.get(isbn);
        } else {
            return 0;
        }
    }
}
