package demo.com;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import demo.com.adapter.Adapter_video_comment;
import demo.com.adapter.Entity_video_comment;

public class VideoActivity extends AppCompatActivity {
    List<Entity_video_comment> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        list=new ArrayList<>();
        initData();
        ListView lv = findViewById(R.id.lv_comments);
        lv.setAdapter(new Adapter_video_comment(list,this));
        RelativeLayout imgback =findViewById(R.id.imgback);
        VideoView vv = findViewById(R.id.video);
        //通过getAssets()获取assets里面的资源
        AssetManager assets = getAssets();
        try {
            //设置要播放的音频
            vv.setVideoPath("/data/fatezero01.mp4");
            //开始准备播放
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        vv.start();
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initData() {
        for(int i=0;i<10;i++){
            Entity_video_comment e = new Entity_video_comment();
            e.setHead(R.mipmap.pic);
            e.setTitle("我是个流氓"+i);
            e.setContent("用户就是父母"+i);
            e.setTime("06:1"+i);
            e.setLike(false);
            list.add(e);
        }
    }

}
