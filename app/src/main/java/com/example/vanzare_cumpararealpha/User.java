package com.example.vanzare_cumpararealpha;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String name;
    private String county;
    private String postalCode;
    private String city;
    private String bl;
    private String et;
    private String ap;
    private String series;
    private String seriesNr;
    private String cnp;
    private String phone;
    private String sector;
    private String streetNr;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String street;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public User(String name, String county, String postalCode, String city, String bl, String et, String ap, String series, String seriesNr, String cnp, String phone, String sector, String streetNr, String street) {
        this.name = name;
        this.county = county;
        this.postalCode = postalCode;
        this.city = city;
        this.bl = bl;
        this.et = et;
        this.ap = ap;
        this.series = series;
        this.seriesNr = seriesNr;
        this.cnp = cnp;
        this.phone = phone;
        this.sector = sector;
        this.streetNr = streetNr;
        this.street = street;
    }

    protected User(Parcel in) {
        name = in.readString();
        county = in.readString();
        postalCode = in.readString();
        city = in.readString();
        bl = in.readString();
        et = in.readString();
        ap = in.readString();
        series = in.readString();
        seriesNr = in.readString();
        cnp = in.readString();
        phone = in.readString();
        sector = in.readString();
        street = in.readString();
        streetNr = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getEt() {
        return et;
    }

    public void setEt(String et) {
        this.et = et;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeriesNr() {
        return seriesNr;
    }

    public void setSeriesNr(String seriesNr) {
        this.seriesNr = seriesNr;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", county='" + county + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", bl='" + bl + '\'' +
                ", et='" + et + '\'' +
                ", ap='" + ap + '\'' +
                ", series='" + series + '\'' +
                ", seriesNr='" + seriesNr + '\'' +
                ", cnp='" + cnp + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(county);
        dest.writeString(postalCode);
        dest.writeString(city);
        dest.writeString(bl);
        dest.writeString(et);
        dest.writeString(ap);
        dest.writeString(series);
        dest.writeString(seriesNr);
        dest.writeString(cnp);
        dest.writeString(phone);
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }
}
