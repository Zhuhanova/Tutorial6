package org.example;

public class Movie extends LibraryMedia{

    private String director;
    private int duration;

    public Movie(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInformation(){
        super.displayInformation();
        System.out.println("Director: " + director
        + "\nDuration: " + duration);
    }

    public void checkDuration(){
        if(duration > 120){
            System.out.println("It's a long movie, about " + duration + " minutes");
        }else{
            System.out.println("It's a standard movie, about " + duration + " minutes");
        }
    }
}
