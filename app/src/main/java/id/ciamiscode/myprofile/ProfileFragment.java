package id.ciamiscode.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

public class ProfileFragment extends Fragment {

    private CardView cardView;
    private AppCompatDialog dialog;
    WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile,null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cardView = getActivity().findViewById(R.id.find_me);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                startActivity(intent);
            }
        });

        cardView = getActivity().findViewById(R.id.about);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               dialog_about();
            }
        });

        cardView = getActivity().findViewById(R.id.contact);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_contact();
            }
        });
    }

    public void dialog_contact(){

        dialog = new AppCompatDialog(getContext());
        dialog.setContentView(R.layout.dialog_contact);

        ImageView whatsapp = dialog.findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "082316369078";
                Intent wa = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+phoneNumber));
                startActivity(wa);

                dialog.dismiss();
            }
        });

        ImageView facebook = dialog.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(getActivity(),FbActivity.class);
                startActivity(fb);

                dialog.dismiss();
            }
        });

        ImageView gmail = dialog.findViewById(R.id.gmail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mail = new Intent(getActivity(),EmailActivity.class);
                startActivity(mail);

                dialog.dismiss();
            }
        });

        if(!dialog.isShowing()){
            dialog.show();
        }
    }

    public void dialog_about(){
        dialog = new AppCompatDialog(getContext());
        dialog.setContentView(R.layout.dialog_about);
        dialog.show();
    }


}
