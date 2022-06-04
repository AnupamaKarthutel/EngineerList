package com.example.engineerlist;
public class uploadinfo {

    public String imageName;
    public String imageURL;
    public String imgaddress;
    public  String imgqualification;
    public  String imgemail;
    public  String imgcontact;



    public uploadinfo(String name, String address, String qualification, String email, String contact, String url) {
        this.imageName = name;
        this.imageURL = url;
        this.imgaddress=address;
        this.imgaddress=qualification;
        this.imgemail=email;
        this.imgcontact=contact;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImgaddress() {
        return imgaddress;
    }
    public String getImgqualification() {
        return imgqualification;
    }
    public String getImgemail() {
        return imgemail;
    }
    public String getImgcontact() {
        return imgcontact;
    }
    public String getImageURL() {
        return imageURL;
    }
}