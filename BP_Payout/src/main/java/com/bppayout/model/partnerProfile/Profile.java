
package com.bppayout.model.partnerProfile;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Profile {

    @SerializedName("city")
    private String mCity;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("havegst")
    private Boolean mHavegst;
    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("oracle_id")
    private Long mOracleId;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("pincode")
    private Long mPincode;
    @SerializedName("state")
    private String mState;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("unique_code")
    private String mUniqueCode;

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Boolean getHavegst() {
        return mHavegst;
    }

    public void setHavegst(Boolean havegst) {
        mHavegst = havegst;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getOracleId() {
        return mOracleId;
    }

    public void setOracleId(Long oracleId) {
        mOracleId = oracleId;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public Long getPincode() {
        return mPincode;
    }

    public void setPincode(Long pincode) {
        mPincode = pincode;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getUniqueCode() {
        return mUniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        mUniqueCode = uniqueCode;
    }

}
