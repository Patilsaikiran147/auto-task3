
package com.bppayout.model.post;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Datum {

    @SerializedName("agent")
    private String mAgent;
    @SerializedName("invoice_number")
    private String mInvoiceNumber;
    @SerializedName("month")
    private Long mMonth;
    @SerializedName("weight_update")
    private Boolean mWeightUpdate;
    @SerializedName("year")
    private Long mYear;

    public String getAgent() {
        return mAgent;
    }

    public void setAgent(String agent) {
        mAgent = agent;
    }

    public String getInvoiceNumber() {
        return mInvoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        mInvoiceNumber = invoiceNumber;
    }

    public Long getMonth() {
        return mMonth;
    }

    public void setMonth(Long month) {
        mMonth = month;
    }

    public Boolean getWeightUpdate() {
        return mWeightUpdate;
    }

    public void setWeightUpdate(Boolean weightUpdate) {
        mWeightUpdate = weightUpdate;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
