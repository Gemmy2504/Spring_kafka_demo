package org.example.demo2.documents;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Document(collection = "signals")
public class Signal {

    @Id
    @Field("_id")
    private String id;

    @Field("uid")
    private String uid;

    @Field("dtt")
    private Long dateTimeTracker;

    @Field("dts")
    private Long dts;

    @Field("spd")
    private int speed;

    @Indexed
    @Field("imei")
    private String imei;


    @Field("addr")
    private Map<String, String> addr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getDateTimeTracker() {
        return dateTimeTracker;
    }

    public void setDateTimeTracker(Long dateTimeTracker) {
        this.dateTimeTracker = dateTimeTracker;
    }

    public Long getDts() {
        return dts;
    }

    public void setDts(Long dts) {
        this.dts = dts;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public Map<String, String> getAddr() {
        return addr;
    }

    public void setAddr(Map<String, String> addr) {
        this.addr = addr;
    }


}
