package com.example.luxury.projectfinal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 *
 * to handle interaction events.
 * Use the {@link ImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageFragment extends Fragment {
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    ListView listImage;

    public ImageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
     * @return A new instance of fragment ImageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ImageFragment newInstance() {
        ImageFragment fragment = new ImageFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_image, container, false);
        listImage = (ListView) v.findViewById(R.id.listImage);
        List<Image> images = new ArrayList<>();
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ 1",
                "11 Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ 2",
                "22 Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ 3",
                "33 Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ 4",
                "444 Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ",
                "Hổ sống trong rừng rậm.ssss s Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ",
                "Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ",
                "Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        images.add(new Image(
                1,
                3,
                "https://images.pexels.com/photos/145939/pexels-photo-145939.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "",
                "Con hổ 999",
                "999 Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm Hổ sống trong rừng rậm. Thường ở một mình, săn mồi vào ban đêm"));
        ImageAdapter adapter = new ImageAdapter(this, images);
        listImage.setAdapter(adapter);
        listImage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ImageFragment.super.getContext(), "Item clicked", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

//    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <a href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</a> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}