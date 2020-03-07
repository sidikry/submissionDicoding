package com.timkontrakan.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rvProduct;
    private ProductAdapter productAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Product> productsList;

    private ImageView tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tentang = findViewById(R.id.tentang);

        createProductData();
        showRecyclerView();
        setTentang();
    }

    public void createProductData(){
        productsList = new ArrayList<>();
        productsList.addAll(ProductData.getListData());
    }

    public void showRecyclerView(){
        rvProduct = findViewById(R.id.rv_product);
        rvProduct.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);

        productAdapter = new ProductAdapter(productsList);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(productAdapter);

        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent = new Intent(HomeActivity.this, MainDetail.class);
                intent.putExtra("Product_Name", productsList.get(position));
                startActivity(intent);
                finish();
//                Toast.makeText(HomeActivity.this, "Kamu Memilih", Toast.LENGTH_SHORT).show();
//
            }
        });
    }

    public void setTentang(){
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, TentangActivity.class));
                finish();
            }
        });
    }



}
