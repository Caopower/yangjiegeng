package demo.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GraphicActivity extends AppCompatActivity {//余松彦

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);
    }
    public void backclick(View v){
        Intent i=new Intent(this,IndexActivity.class);
        startActivity(i);
    }
}
