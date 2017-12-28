package com.youotech.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class SpittleBean {

    private Long id;
    private String msg;
    private Date time;
    private Double latitude;
    private Double longitude;

    public SpittleBean(Long id,String msg, Date time, Double longitude, Double latitude){
        this.id = id;
        this.msg = msg;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Long getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this,obj,"id","time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
