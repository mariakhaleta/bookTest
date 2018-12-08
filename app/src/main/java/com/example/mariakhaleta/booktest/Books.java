package com.example.mariakhaleta.booktest;

public class Books {

    private Integer bookID;
    private String title;
    private String author;
    private String langOfPub;
    private String dateOfPub;
    private String description;
    private String audiobook;
    private String textpreview;
    private String binding;
    private String publisher;
    private String genre;
    private String vendorCode;
    private String cover;
    private Integer price;

    public Books(Integer bookID, String title, String author, Integer price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
//        this.langOfPub = langOfPub;
//        this.dateOfPub = dateOfPub;
//        this.description = description;
//        this.audiobook = audiobook;
//        this.textpreview = textpreview;
//        this.binding = binding;
//        this.publisher = publisher;
//        this.genre = genre;
//        this.vendorCode = vendorCode;
//        this.cover = cover;
        this.price = price;
    }


    public Books(String title, double price) {
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLangOfPub() {
        return langOfPub;
    }

    public String getDateOfPub() {
        return dateOfPub;
    }

    public String getDescription() {
        return description;
    }

    public String getAudiobook() {
        return audiobook;
    }

    public String getTextpreview() {
        return textpreview;
    }

    public String getBinding() {
        return binding;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public String getCover() {
        return cover;
    }
}
