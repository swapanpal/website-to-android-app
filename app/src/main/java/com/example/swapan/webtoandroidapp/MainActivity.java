package com.example.swapan.webtoandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.web_view);

        // store settings(javascript) in a variable and enable javascript
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // To load all pate of the website in same browser
        webView.setWebViewClient(new WebViewClient());

        // load a website in a variable
        webView.loadUrl("https://office.link3.net/mis/ClientSide/frm_login.aspx");
    }

}
