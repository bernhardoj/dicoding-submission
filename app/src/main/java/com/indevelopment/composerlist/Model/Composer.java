package com.indevelopment.composerlist.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Composer implements Parcelable {
    private String name, detail, born, died, photo, signature;

    public Composer(String name, String detail, String born, String died, String photo, String signature) {
        this.name = name;
        this.detail = detail;
        this.born = born;
        this.died = died;
        this.photo = photo;
        this.signature = signature;
    }

    private Composer(Parcel in) {
        name = in.readString();
        detail = in.readString();
        born = in.readString();
        died = in.readString();
        photo = in.readString();
        signature = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(born);
        dest.writeString(died);
        dest.writeString(photo);
        dest.writeString(signature);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Composer> CREATOR = new Creator<Composer>() {
        @Override
        public Composer createFromParcel(Parcel in) {
            return new Composer(in);
        }

        @Override
        public Composer[] newArray(int size) {
            return new Composer[size];
        }
    };

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

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
