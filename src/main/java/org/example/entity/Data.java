
package org.example.entity;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private String last10m;
    private String last30m;
    private String last1h;
    private String last1d;
    private String prev10m;
    private String prev30m;
    private String prev1h;
    private String prev1d;
    private String accepted;
    private String stale;
    private String dupelicate;
    private String other;
    private Integer totalWorkers;
    private Integer activeWorkers;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param other
     * @param dupelicate
     * @param last10m
     * @param accepted
     * @param last30m
     * @param totalWorkers
     * @param last1d
     * @param prev1d
     * @param prev10m
     * @param stale
     * @param activeWorkers
     * @param last1h
     * @param prev30m
     * @param prev1h
     */
    public Data(String last10m, String last30m, String last1h, String last1d, String prev10m, String prev30m, String prev1h, String prev1d, String accepted, String stale, String dupelicate, String other, Integer totalWorkers, Integer activeWorkers) {
        super();
        this.last10m = last10m;
        this.last30m = last30m;
        this.last1h = last1h;
        this.last1d = last1d;
        this.prev10m = prev10m;
        this.prev30m = prev30m;
        this.prev1h = prev1h;
        this.prev1d = prev1d;
        this.accepted = accepted;
        this.stale = stale;
        this.dupelicate = dupelicate;
        this.other = other;
        this.totalWorkers = totalWorkers;
        this.activeWorkers = activeWorkers;
    }

    public String getLast10m() {
        return last10m;
    }

    public void setLast10m(String last10m) {
        this.last10m = last10m;
    }

    public String getLast30m() {
        return last30m;
    }

    public void setLast30m(String last30m) {
        this.last30m = last30m;
    }

    public String getLast1h() {
        return last1h;
    }

    public void setLast1h(String last1h) {
        this.last1h = last1h;
    }

    public String getLast1d() {
        return last1d;
    }

    public void setLast1d(String last1d) {
        this.last1d = last1d;
    }

    public String getPrev10m() {
        return prev10m;
    }

    public void setPrev10m(String prev10m) {
        this.prev10m = prev10m;
    }

    public String getPrev30m() {
        return prev30m;
    }

    public void setPrev30m(String prev30m) {
        this.prev30m = prev30m;
    }

    public String getPrev1h() {
        return prev1h;
    }

    public void setPrev1h(String prev1h) {
        this.prev1h = prev1h;
    }

    public String getPrev1d() {
        return prev1d;
    }

    public void setPrev1d(String prev1d) {
        this.prev1d = prev1d;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    public String getStale() {
        return stale;
    }

    public void setStale(String stale) {
        this.stale = stale;
    }

    public String getDupelicate() {
        return dupelicate;
    }

    public void setDupelicate(String dupelicate) {
        this.dupelicate = dupelicate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Integer getTotalWorkers() {
        return totalWorkers;
    }

    public void setTotalWorkers(Integer totalWorkers) {
        this.totalWorkers = totalWorkers;
    }

    public Integer getActiveWorkers() {
        return activeWorkers;
    }

    public void setActiveWorkers(Integer activeWorkers) {
        this.activeWorkers = activeWorkers;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
