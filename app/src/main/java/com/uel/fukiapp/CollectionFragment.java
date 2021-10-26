package com.uel.fukiapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uel.fukiapp.adapter.ProductAdapter;
import com.uel.fukiapp.model.Product;

import java.util.ArrayList;

public class CollectionFragment extends Fragment {
    RecyclerView mRvNew, mRvPopular, mRvSale;
    ArrayList<Product> mProductList;

    public CollectionFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_collection, container, false);
        mRvNew = view.findViewById(R.id.rvNew);
        mRvPopular = view.findViewById(R.id.rvPopular);
        mRvSale = view.findViewById(R.id.rvSale);

        mRvNew.setNestedScrollingEnabled(false);
        mRvPopular.setNestedScrollingEnabled(false);
        mRvSale.setNestedScrollingEnabled(false);

        mRvNew.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRvPopular.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRvSale.setLayoutManager(new GridLayoutManager(getContext(), 3));

        mProductList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Product ob1 = new Product(R.drawable.product, "CUSTOM CASE", "$13.50");
            mProductList.add(ob1);
        }


        mRvNew.setAdapter(new ProductAdapter(mProductList));
        mRvPopular.setAdapter(new ProductAdapter(mProductList));
        mRvSale.setAdapter(new ProductAdapter(mProductList));

        return view;
    }

}