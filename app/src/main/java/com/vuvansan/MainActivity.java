package com.vuvansan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.vuvansan.adapter.ItemDateAdapter;
import com.vuvansan.model.ItemData;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewMain;
    TextView tvCnow,tvstatusNow;

    List<ItemData> list=new ArrayList<>();
    ItemDateAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata();
        adapter =new ItemDateAdapter(this,list);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        recyclerViewMain=findViewById(R.id.rvMain);
        recyclerViewMain.setLayoutManager(layoutManager);
        recyclerViewMain.setAdapter(adapter);
        tvCnow=findViewById(R.id.tvCnow);
        tvstatusNow=findViewById(R.id.tvstatusNow);

    }
    public void getdata(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APImanager.DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APImanager apimanager=retrofit.create(APImanager.class);
        apimanager.getdata().enqueue(new Callback<List<ItemData>>() {
            @Override
            public void onResponse(Call<List<ItemData>> call, Response<List<ItemData>> response) {

                if(response.body()!=null){
                    list=response.body();
                    adapter.reLoadData(list);
                    response.code();
                    tvstatusNow.setText(list.get(0).getIconPhrase());
                    int Cnow= (int) list.get(0).getTemperature().getValue();
                    tvCnow.setText((Cnow+"°"));

                }
            }

            @Override
            public void onFailure(Call<List<ItemData>> call, Throwable t) {


                Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
            }
        });
    }

}