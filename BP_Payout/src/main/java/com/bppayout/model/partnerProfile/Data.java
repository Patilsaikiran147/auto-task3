
package com.bppayout.model.partnerProfile;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("address")
    private Address mAddress;
    @SerializedName("finance")
    private Finance mFinance;
    @SerializedName("gstdetails")
    private List<Gstdetail> mGstdetails;
    @SerializedName("pan")
    private Pan mPan;
    @SerializedName("profile")
    private Profile mProfile;

    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(Address address) {
        mAddress = address;
    }

    public Finance getFinance() {
        return mFinance;
    }

    public void setFinance(Finance finance) {
        mFinance = finance;
    }

    public List<Gstdetail> getGstdetails() {
        return mGstdetails;
    }

    public void setGstdetails(List<Gstdetail> gstdetails) {
        mGstdetails = gstdetails;
    }

    public Pan getPan() {
        return mPan;
    }

    public void setPan(Pan pan) {
        mPan = pan;
    }

    public Profile getProfile() {
        return mProfile;
    }

    public void setProfile(Profile profile) {
        mProfile = profile;
    }

}
