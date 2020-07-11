package top.linesoft.open2share;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("http://doc.linesoft.top/open2share/guide/");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("使用说明");
    }
}
