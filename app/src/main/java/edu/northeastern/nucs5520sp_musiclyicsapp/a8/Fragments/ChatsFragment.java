package edu.northeastern.nucs5520sp_musiclyicsapp.a8.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.northeastern.nucs5520sp_musiclyicsapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChatsFragment} factory method to
 * create an instance of this fragment.
 */
public class ChatsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false);
    }
}