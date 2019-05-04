package id.ciamiscode.myprofile.presenter;

import java.util.ArrayList;

import id.ciamiscode.myprofile.model.GalleryModel;

public class GalleryPresenter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    public static String[][] data = new String[][]{
            {"", "", "https://pbs.twimg.com/profile_images/1088427957268373504/P_-G7ufe_400x400.jpg"},
            {"", "", "https://kuliahonline.info/wp-content/uploads/2017/04/gedungunikom.jpg"},
            {"", "", "http://blogs.biomedcentral.com/on-physicalsciences/wp-content/uploads/sites/14/2019/02/data-1-620x342.jpg"},
            {"", "", "https://insights.dice.com/wp-content/uploads/2017/07/Programming-Language-Popularity.jpg"},
            {"", "", "http://erg.unikom.ac.id/wp-content/uploads/2018/08/WhatsApp-Image-2018-08-15-at-15.47.41-2.jpeg"},
            {"", "", "http://erg.unikom.ac.id/wp-content/uploads/2019/03/covers.jpg"},
            {"", "", "https://cdn-images-1.medium.com/max/1600/1*CNNcukC5TDhzLf4gS1aNMg.jpeg"},
            {"", "", "https://www.hostinger.co.id/tutorial/wp-content/uploads/sites/11/2018/07/belajar-coding-online-gratis.jpg"}
    };

    public static ArrayList<GalleryModel> getListData(){
        GalleryModel gallery = null;
        ArrayList<GalleryModel> list = new ArrayList<>();
        for(String[] aData : data){
            gallery = new GalleryModel();
            gallery.setTitle(aData[0]);
            gallery.setDesc(aData[1]);
            gallery.setPhoto(aData[2]);

            list.add(gallery);
        }

        return list;
    }

}
