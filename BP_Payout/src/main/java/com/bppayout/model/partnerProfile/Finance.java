package com.bppayout.model.partnerProfile;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Finance {

    @SerializedName("account_name")
    private String mAccountName;
    @SerializedName("account_number")
    private String mAccountNumber;
    @SerializedName("ifsc_code")
    private String mIfscCode;

    public String getAccountName() {
        return mAccountName;
    }

    public void setAccountName(String accountName) {
        mAccountName = accountName;
    }

    public String getAccountNumber() {
        return mAccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        mAccountNumber = accountNumber;
    }

    public String getIfscCode() {
        return mIfscCode;
    }

    public void setIfscCode(String ifscCode) {
        mIfscCode = ifscCode;
    }

}
