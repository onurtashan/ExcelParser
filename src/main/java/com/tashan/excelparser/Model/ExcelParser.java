package com.tashan.excelparser.Model;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
public class ExcelParser {
    private String baslik;
    private String icerik;
    private String baslangic_tarihi;
    private String bitis_tarihi;
    private String cekilis_tarihi;
    private String imgURL;

    public String getBaslik() {
        return baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public String getBaslangic_tarihi() {
        return baslangic_tarihi;
    }

    public String getBitis_tarihi() {
        return bitis_tarihi;
    }

    public String getCekilis_tarihi() {
        return cekilis_tarihi;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public void setBaslangic_tarihi(String baslangic_tarihi) {
        this.baslangic_tarihi = baslangic_tarihi;
    }

    public void setBitis_tarihi(String bitis_tarihi) {
        this.bitis_tarihi = bitis_tarihi;
    }

    public void setCekilis_tarihi(String cekilis_tarihi) {
        this.cekilis_tarihi = cekilis_tarihi;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
