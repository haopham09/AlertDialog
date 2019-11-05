package com.thohao.alertdialog_kp;

public class BanhMiFastFood implements BanhMiSetting {
    private String loai;
    private String salad;
    private String caChua;
    private String nuocSot;
    private String nuocUong;
//
    @Override
    public BanhMiSetting loai(String loai) {
        this.loai=loai;
        return this;
        //return lại chính BanhMiSetting
    }

    @Override
    public BanhMiSetting salad(String salad) {
        this.salad=salad;
        return this;
    }

    @Override
    public BanhMiSetting caChua(String caChua) {
        this.caChua=caChua;
        return this;
    }

    @Override
    public BanhMiSetting nuocSot(String nuocSot) {
        this.nuocSot=nuocSot;
        return this;
    }

    @Override
    public BanhMiSetting nuocUong(String nuocUong) {
        this.nuocUong=nuocUong;
        return this;
    }
//method tao ra banh mi
    @Override
    public BanhMi build() {
        return new BanhMi(loai, salad, caChua, nuocSot, nuocUong);
    }
}
