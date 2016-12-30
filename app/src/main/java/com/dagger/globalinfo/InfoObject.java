package com.dagger.globalinfo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Harshit on 25/12/16.
 */

public class InfoObject implements Parcelable{
    private String title;
    private String url;
    private String description;
    private String author;

    public InfoObject() {
    }

    private String category;
    private String timestamp;

    public InfoObject(String title, String url, String description, String author, String category, String timestamp) {
        this.title = title;
        this.url = url;
        this.description = description;
        this.author = author;
        this.category = category;
        this.timestamp = timestamp;
    }

    protected InfoObject(Parcel in) {
        title = in.readString();
        url = in.readString();
        description = in.readString();
        author = in.readString();
        timestamp = in.readString();
    }

    public static final Creator<InfoObject> CREATOR = new Creator<InfoObject>() {
        @Override
        public InfoObject createFromParcel(Parcel in) {
            return new InfoObject(in);
        }

        @Override
        public InfoObject[] newArray(int size) {
            return new InfoObject[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(url);
        parcel.writeString(description);
        parcel.writeString(author);
        parcel.writeString(timestamp);
    }
}
