package id.ciamiscode.myprofile.presenter;

import java.util.ArrayList;

import id.ciamiscode.myprofile.model.FriendModel;

public class FriendPresenter {

    /**
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Tanggal Pengerjaan : 4/5/2019
     */

    public static String[][] data = new String[][]{
            {"Enda Saeful", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Julandrian A", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Harry K", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Irsyad N", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Fahmi Ahmad", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Ahmad DN", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"M Jaariyah", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"},
            {"Adin Nuryadin", "https://smallimg.pngkey.com/png/small/49-498077_user-level-journey-tracking-contact-icon-png-transparent.png"}
    };

    public static ArrayList<FriendModel> getListData(){
        FriendModel fr = null;
        ArrayList<FriendModel> list = new ArrayList<>();
        for(String[] aData : data){
            fr = new FriendModel();
            fr.setNama(aData[0]);
            fr.setPhoto(aData[1]);

            list.add(fr);
        }

        return list;
    }

}
