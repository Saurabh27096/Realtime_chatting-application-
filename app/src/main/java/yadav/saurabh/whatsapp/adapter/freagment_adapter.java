package yadav.saurabh.whatsapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import yadav.saurabh.whatsapp.fragments.History;
import yadav.saurabh.whatsapp.fragments.Orders;
import yadav.saurabh.whatsapp.fragments.chat;

public class freagment_adapter extends FragmentPagerAdapter {


    public freagment_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new chat();
            case 1: return new Orders();
            case 2: return new History();
            default: return new chat();
        }

        //return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0){
            title = "Chats";
        }
        if (position == 1){
            title = "Orders";
        }
        if (position == 2){
            title = "History";
        }


         return title;
        //return super.getPageTitle(position);
    }
}
