package com.thohao.alertdialog_kp;

public interface BanhMiSetting {
    BanhMiSetting loai(String loai);
    BanhMiSetting salad(String salad);
    BanhMiSetting caChua(String caChua);
    BanhMiSetting nuocSot(String nuocSot);
    BanhMiSetting nuocUong(String nuocUong);
    BanhMi build();
}
