package org.phcglobal.firebasesimplevideoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    private Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/simple-video-app-d90f0.appspot.com/o/videoplayback.mp4?alt=media&token=987b689a-0877-4db9-902d-274d36ee2ed9");
        videoView.setVideoURI(uri);
        videoView.start();

    }
}
