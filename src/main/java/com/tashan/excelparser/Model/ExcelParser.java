package com.tashan.excelparser.Model;

/**
 * Created by TCOTASHAN on 21.6.2017.
 */
public class ExcelParser {
    private String siraNo;
    private String duzenleyen;
    private String kampanyaBslgncBts;
    private String cekilisTarihi;
    private String ilanTarihi;
    private String gazete;

    public ExcelParser(String siraNo, String duzenleyen, String kampanyaBslgncBts, String cekilisTarihi, String ilanTarihi, String gazete){
        this.siraNo = siraNo;
        this.duzenleyen = duzenleyen;
        this.kampanyaBslgncBts = kampanyaBslgncBts;
        this.cekilisTarihi = cekilisTarihi;
        this.ilanTarihi = ilanTarihi;
        this.gazete = gazete;
    }

    public String getSiraNo() {
        return siraNo;
    }

    public String getDuzenleyen() {
        return duzenleyen;
    }

    public String getKampanyaBslgncBts() {
        return kampanyaBslgncBts;
    }

    public String getCekilisTarihi() {
        return cekilisTarihi;
    }

    public String getIlanTarihi() {
        return ilanTarihi;
    }

    public String getGazete() {
        return gazete;
    }
}
