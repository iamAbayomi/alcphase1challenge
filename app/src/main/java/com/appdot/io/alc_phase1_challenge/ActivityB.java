package com.appdot.io.alc_phase1_challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = myWebView.getSettings();
        myWebView.setWebViewClient( new MyWebViewClient());
        webSettings.setJavaScriptEnabled(true);

    }
}
