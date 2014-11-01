package com.marin.godroid;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import go.godroid.Godroid;


public class Browser extends Activity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);

        Godroid.ListeAndServe();

        browser = (WebView)findViewById(R.id.browser);
        browser.loadUrl("http://localhost:8080");

    }
}
