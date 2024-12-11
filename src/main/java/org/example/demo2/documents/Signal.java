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

    @Field("ang")
    private int ang;

    @Field("alt")
    private int alt;

    @Field("loc")
    private Location loc;

    @Field("prms")
    private Map<String, Object> prms;

    @Field("vLoc")
    private int vLoc;

    @Field("vCon")
    private int vCon;

    @Field("ip")
    private String ip;

    @Field("rl")
    private int rl;

    @Field("mdu")
    private int mdu;

    @Field("eidl")
    private int eidl;

    @Field("fc")
    private int fc;

    @Field("acc")
    private int acc;

    @Indexed
    @Field("imei")
    private String imei;

    @Field("sdu")
    private int sdu;

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

    public int getAng() {
        return ang;
    }

    public void setAng(int ang) {
        this.ang = ang;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public Map<String, Object> getPrms() {
        return prms;
    }

    public void setPrms(Map<String, Object> prms) {
        this.prms = prms;
    }

    public int getVloc() {
        return vLoc;
    }

    public void setVloc(int vloc) {
        this.vLoc = vloc;
    }

    public int getvCon() {
        return vCon;
    }

    public void setvCon(int vCon) {
        this.vCon = vCon;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getRl() {
        return rl;
    }

    public void setRl(int rl) {
        this.rl = rl;
    }

    public int getMdu() {
        return mdu;
    }

    public void setMdu(int mdu) {
        this.mdu = mdu;
    }

    public int getEidl() {
        return eidl;
    }

    public void setEidl(int eidl) {
        this.eidl = eidl;
    }

    public int getFc() {
        return fc;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getSdu() {
        return sdu;
    }

    public void setSdu(int sdu) {
        this.sdu = sdu;
    }

    public Map<String, String> getAddr() {
        return addr;
    }

    public void setAddr(Map<String, String> addr) {
        this.addr = addr;
    }


}
