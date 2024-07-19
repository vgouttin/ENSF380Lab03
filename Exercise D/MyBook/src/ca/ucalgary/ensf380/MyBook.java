/* *
 * <h1 > MyBook . java </ h1 >
 * <p >
 * This class is designed for processing XXX in Java .
 * It is part of Lab 3 Exercise D .
 *
 * <p > <b > Submission Date : </b > July 18th, 2024 </ p >
 *
 * @author Victor Gouttin
 *  * @version 1.0
 */

package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Create instances of Author
        Author author1 = new Author("J.K. Rowling", "Edinburgh", 58);
        Author author2 = new Author("George Orwell", "London", 46);
        System.out.println("Author1 name: " + author1.getName());
        System.out.println("Author2 name: " + author2.getName());
        System.out.println("J.K.'s address: " + author1.getAddress());
        System.out.println("George's address: " + author2.getAddress());
        System.out.println("J.K.'s age: " + author1.getAge());
        System.out.println("George's age: " + author2.getAge());
        
        // Create Books
        Book book1 = new Book("978-0747532743", 1);
        Book book2 = new Book("978-0451524935", 1);
        book1.setPublicationYear(1);
        book2.setPublicationYear(1);
        System.out.println("Book1 ISBN: " + book1.getIsbn());
        System.out.println("Book1 publication year: " + book1.getPublicationYear());
        System.out.println("Book1 page number: " + book1.getPages());
        System.out.println("Book2 ISBN: " + book2.getIsbn());
        System.out.println("Book2 publication year: " + book2.getPublicationYear());
        System.out.println("Book2 page number: " + book2.getPages());
        
        // Create Categories
        Category fictionCategory = new Category();
        fictionCategory.setCategory("Fiction");

        // Create subcategory
        Category fantasyCategory = new Category();
        fantasyCategory.setCategory("Fantasy");
        fantasyCategory.setSuperCategory(fictionCategory);

        // Link subcategory to the main category
        fictionCategory.setSubCategory(fantasyCategory);

        // Print category information
        System.out.println("Main Category: " + fictionCategory.getCategory());
        System.out.println("Subcategory: " + fantasyCategory.getCategory());
        System.out.println("Supercategory of Fantasy: " + fantasyCategory.getSuperCategory().getCategory());
        System.out.println("Subcategory of Fiction: " + fictionCategory.getSubCategory().getCategory());
        
        // Create Publisher
        Publisher publisher = new Publisher("Penguin Random House", "New York");
        Publisher publisher2 = new Publisher("HarperCollins", "London");
        System.out.println("publisher name: " + publisher.getName());
        System.out.println("publisher address: " + publisher.getAddress());
        System.out.println("publisher2 name: " + publisher2.getName());
        System.out.println("publisher2 address: " + publisher2.getAddress());

        // Create Classic
        Classic classic = new Classic();
        classic.setOrigPubYear(1897);
        classic.setTheAuthor(author1);
        classic.setBookPublisher(new Publisher[]{publisher});
        System.out.println("Classic Original Publication Year: " + classic.getOrigPubYear());
        System.out.println("Classic Author: " + classic.getTheAuthor().getName());
        System.out.println("Classic Publisher: " + classic.getBookPublisher()[0].getName());

        // Create Contract
        Contract contract = new Contract("2024-07-18", publisher, new Author[]{author1, author2});
        System.out.println("Contract Date: " + contract.getDate());
        System.out.println("Contract Publisher: " + contract.getPublisherInfo().getName());
        System.out.println("Contract Authors: " + contract.getAuthorInfo()[0].getName() + ", " + contract.getAuthorInfo()[1].getName());

        // Create Fiction
        Fiction fiction = new Fiction();
        System.out.println("Fiction: " + fiction.coverArt());
        System.out.println("Fiction Genre: " + fiction.genre());

        // Create Hardcover
        Hardcover hardcover = new Hardcover();
        System.out.println("Hardcover: " + hardcover.binding());

        // Create Paperback
        Paperback paperback = new Paperback();
        System.out.println("Paperback: " + paperback.coverArt());

        // Create Nonfiction
        Nonfiction nonfiction = new Nonfiction();
        nonfiction.setDeweyClassification(fictionCategory);
        System.out.println("Nonfiction: " + nonfiction.topic());
        System.out.println("Nonfiction Dewey Classification: " + nonfiction.getDeweyClassification().getCategory());

        // Create Series
        Series series = new Series();
        series.setSeriesName("Harry Potter Series");
        System.out.println("Series: " + series.theme());
        System.out.println("Series Name: " + series.getSeriesName());

        // Create Novel
        Novel novel = new Novel();
        novel.setTheAuthors(new Author[]{author1, author2});
        novel.setMySeries(series);
        System.out.println("Novel: " + novel.theme());
        System.out.println("Novel Authors: " + novel.getTheAuthors()[0].getName() + ", " + novel.getTheAuthors()[1].getName());
        System.out.println("Novel Series: " + novel.getMySeries().getSeriesName());

        // Create Story
        Story story1 = new Story();
        story1.setTheAuthors(new Author[]{author1});
        System.out.println("Story: " + story1.plot());
        System.out.println("Story Authors: " + story1.getTheAuthors()[0].getName());

        // Create Anthology
        Story story2 = new Story();
        story2.setTheAuthors(new Author[]{author2});
        Story[] stories = {story1, story2};
        Anthology anthology = new Anthology();
        anthology.setStories(stories);
        System.out.println("Anthology: " + anthology.storyOrder());
        System.out.println("Anthology Stories:");
        for (Story story : anthology.getStories()) {
            System.out.println(" - Story with Author: " + story.getTheAuthors()[0].getName());
        }
    }
}
