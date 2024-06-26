package org.pattersonclippers.cyberlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    WebView websiteWV;
    Intent incomingIntent;
    String whichLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        incomingIntent = getIntent();
        whichLink = incomingIntent.getStringExtra("whichLink");
        websiteWV = (WebView) findViewById(R.id.websiteWV);

        if (whichLink.equals("link1")) {
            websiteWV.loadUrl("https://www.itgovernanceusa.com/blog/data-breaches-and-cyber-attacks-in-2024-in-the-usa");
        }
        if (whichLink.equals("link2")) {
            websiteWV.loadUrl("https://www.ekransystem.com/en/blog/best-cyber-security-practices");
        }
        websiteWV.getSettings().setJavaScriptEnabled(true);
        websiteWV.setWebViewClient(new WebViewClient());
    }
}