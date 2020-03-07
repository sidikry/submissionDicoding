package com.timkontrakan.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
    private String name, detail, materi;
    private int photo;

    public Product(String name, String detail, String materi, int photo) {
        this.name = name;
        this.detail = detail;
        this.materi = materi;
        this.photo = photo;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getMateri() {
        return materi;
    }

    public void setMateri(String materi) {
        this.materi = materi;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public static Creator<Product> getCREATOR() {
        return CREATOR;
    }

    protected Product(Parcel in) {
        name = in.readString();
        detail = in.readString();
        materi = in.readString();
        photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(materi);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
}
