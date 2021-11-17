package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

public class BookShelfSpecTest {

    private BookShelfSpecTest(TestInfo testInfo) {
        System.out.println("Working on test " + testInfo.getDisplayName());
    }


    @Test
    public void shelfEmptyWhenNoBookAdded() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty() , () ->"BookShelf should be empty");
    }
}
