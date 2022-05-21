package com.example.recylerviewb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    private RecyclerView _recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);

        AsyncHttpClient ahc = new AsyncHttpClient();
        String url = "https://stmikpontianak.net/0011100862/tampilanMahasiswa.php";

        ahc.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        })
    }
}