package com.thohao.alertdialog_kp;

public class BanhMi {
    private String loai;
    private String salad;
    private String caChua;
    private String nuocSot;
    private String nuocUong;
    //alt insert
    //constructor ; method khoi tao object


    public BanhMi(String loai, String salad, String caChua, String nuocSot, String nuocUong) {
        this.loai = loai;
        this.salad = salad;
        this.caChua = caChua;
        this.nuocSot = nuocSot;
        this.nuocUong = nuocUong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getCaChua() {
        return caChua;
    }

    public void setCaChua(String caChua) {
        this.caChua = caChua;
    }

    public String getNuocSot() {
        return nuocSot;
    }

    public void setNuocSot(String nuocSot) {
        this.nuocSot = nuocSot;
    }

    public String getNuocUong() {
        return nuocUong;
    }

    public void setNuocUong(String nuocUong) {
        this.nuocUong = nuocUong;
    }
}
