package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id; //实体类该有的字段
    private String cityName;  //记录省的名字
    private int cityCode;
    private  int provinceId; //记录省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
