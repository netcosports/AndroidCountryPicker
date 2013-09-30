package com.countrypicker;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * POJO
 *
 */
public class Country implements Parcelable{
	private String code;
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Country(final Parcel in) {
        code = in.readString();
        name = in.readString();
    }

    public Country() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(code);
        parcel.writeString(name);
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        public Country createFromParcel(final Parcel in) {
            return new Country(in);
        }

        public Country[] newArray(final int size) {
            return new Country[size];
        }
    };
}