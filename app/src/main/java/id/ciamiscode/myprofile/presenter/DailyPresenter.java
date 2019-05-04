package id.ciamiscode.myprofile.presenter;

import java.util.ArrayList;

import id.ciamiscode.myprofile.model.DailyModel;

public class DailyPresenter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 3/5/2019
     */

    public static String[][] data = new String[][]{
            {"ISOMA (Istirahat Solat & Makan)", "Jam : 05.00-07.00", "http://www.voa-islam.com/photos6/bataku/khusyu_ibadah.jpg"},
            {"Persiapan ke Kampus", "Jam :  07.00-08.30", "https://www.anakui.com/wp-content/uploads/2015/11/626401B0-E773-4A5E-BFC3-1D07FB9F49B6.jpg"},
            {"Kuliah & Riset di Divisi", "Jam :  09.00 - 17.00", "https://mamikos.com/info/wp-content/uploads/2018/08/kuliah.jpg"},
            {"ISOMA (Istirahat Solat & Makan)", "Jam :  17.30-19.30", "https://hellosehat.com/wp-content/uploads/2018/06/shutterstock_475622926.jpg"},
            {"Belajar & Nugas", "Jam :  08.00-10.30", "https://quipper-video-wordpress.s3.amazonaws.com/images/2017/09/Tips-Belajar-Online-agar-Konsentrasi-Tetap-Full.png"},
            {"Tidur", "Jam :  10.30-04.30", "https://hellosehat.com/wp-content/uploads/2018/08/kurang-tidur-tekanan-darah-naik.jpg"},
            {"Repeat", "-", "https://img.freepik.com/free-vector/illustration-refresh-icon_53876-5630.jpg?size=338&ext=jpg"}
    };

    public static ArrayList<DailyModel> getListData(){
        DailyModel daily = null;
        ArrayList<DailyModel> list = new ArrayList<>();
        for(String[] aData : data){
            daily = new DailyModel();
            daily.setKegiatan(aData[0]);
            daily.setWaktu(aData[1]);
            daily.setPhoto(aData[2]);

            list.add(daily);
        }

        return list;
    }

}
