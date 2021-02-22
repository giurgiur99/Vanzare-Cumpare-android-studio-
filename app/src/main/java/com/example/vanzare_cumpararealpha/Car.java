package com.example.vanzare_cumpararealpha;

import android.os.Parcel;
import android.os.Parcelable;

public class Car implements Parcelable {
    private String manufacture;
    private String model;
    private String identificationNumber;
    private String capacity;
    private String licensePlate;
    private String nrCarte;
    private String manufactureYear;
    private String euroCo2;
    private String priceNr;
    private String priceLetters;

    public Car() {

    }

    protected Car(Parcel in) {
        manufacture = in.readString();
        model = in.readString();
        identificationNumber = in.readString();
        capacity = in.readString();
        licensePlate = in.readString();
        nrCarte = in.readString();
        manufactureYear = in.readString();
        euroCo2 = in.readString();
        priceNr = in.readString();
        priceLetters = in.readString();
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getNrCarte() {
        return nrCarte;
    }

    public void setNrCarte(String nrCarte) {
        this.nrCarte = nrCarte;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getEuroCo2() {
        return euroCo2;
    }

    public void setEuroCo2(String euroCo2) {
        this.euroCo2 = euroCo2;
    }

    public String getPriceNr() {
        return priceNr;
    }

    public void setPriceNr(String priceNr) {
        this.priceNr = priceNr;
    }

    public String getPriceLetters() {
        return priceLetters;
    }

    public void setPriceLetters(String priceLetters) {
        this.priceLetters = priceLetters;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(manufacture);
        dest.writeString(model);
        dest.writeString(identificationNumber);
        dest.writeString(capacity);
        dest.writeString(licensePlate);
        dest.writeString(nrCarte);
        dest.writeString(manufactureYear);
        dest.writeString(euroCo2);
        dest.writeString(priceNr);
        dest.writeString(priceLetters);
    }
}




