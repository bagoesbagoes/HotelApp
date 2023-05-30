package com.chrisantusbagus202102312.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageview1 = (ImageView) findViewById(R.id.imageview1);

        String imageURL = "https://i.postimg.cc/N0D6fDnq/queenofthesouth-resort-6086822216450602789613433927370283910000485n.jpg";
        Picasso.with(this).load(imageURL).into(_imageview1);
    }
}