package org.example;

public class LibraryMedia {

    protected String title;
    protected int publicationYear;
    protected boolean available;

    public LibraryMedia(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void borrow(){
        if (this.available){
            this.available = false;
            System.out.println(this.title + " borrowed");
        }else{
            System.out.println(this.title + " has already been borrowed");
        }
    }

    public void returnMedia(){
        if (!this.available){
            this.available = true;
            System.out.println(this.title + " returned");
        }else{
            System.out.println(this.title + " was not borrowed");
        }
    }

    public void displayInformation(){
        System.out.println("Title: " + this.title
        + "\nPublication Year: " + this.publicationYear
        + "\nStatus: " + (available ? " Available" : " Borrowed"));
    }
}
