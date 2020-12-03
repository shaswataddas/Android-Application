package com.example.numbershapeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void drawshape(View view)
    {
        EditText editNumber = (EditText) findViewById(R.id.editNumber);
        int side = Integer.parseInt(editNumber.getText().toString());
        checking(side);
    }
    void checking(int i) {
        if (i == 3) {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_triangle);
            Toast.makeText(this, "It's a Triangle", Toast.LENGTH_SHORT).show();
        }
        else if (i==4)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_square);
            Toast.makeText(this, "It's a Square", Toast.LENGTH_SHORT).show();
        }
        else if (i==5)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_pentagon);
            Toast.makeText(this, "It's a Pentagon", Toast.LENGTH_SHORT).show();
        }
        else if (i==6)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_hexagon);
            Toast.makeText(this, "It's a Hexagon", Toast.LENGTH_SHORT).show();
        }
        else if (i==7)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.heptagon);
            Toast.makeText(this, "It's a Heptagon", Toast.LENGTH_SHORT).show();
        }
        else if (i==8)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_octagon);
            Toast.makeText(this, "It's a Octagon", Toast.LENGTH_SHORT).show();
        }
        else if (i==9)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_nonagon);
            Toast.makeText(this, "It's a Nonagon", Toast.LENGTH_SHORT).show();
        }
        else if (i==10)
        {
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.modi_decagon);
            Toast.makeText(this, "It's a Decagon", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Can not draw shape with "+i+" side(s).", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}