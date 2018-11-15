package com.example.utsav.beercheer;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable
{

    public final int foodName;
    public final int foodImage;

    public Food(int foodImage, int foodName) {
        this.foodName = foodName;
        this.foodImage = foodImage;
    }

    protected Food(Parcel in) {
        foodName = in.readInt();
        foodImage = in.readInt();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(foodName);
        dest.writeInt(foodImage);
    }
}
