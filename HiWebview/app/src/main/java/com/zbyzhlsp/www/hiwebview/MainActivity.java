package com.zbyzhlsp.www.hiwebview;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private final static String TAG = "HiWebView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.hiWebview);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.getSettings().setUserAgentString("test");
//        webView.getSettings().setBlockNetworkImage(true);


//        webView.setWebChromeClient(new WebChromeClient(){
//        });
//
//
//
        webView.setWebViewClient(new WebViewClient(){
        });

//        webView.getSettings().setJavaScriptEnabled(true);

//        webView.addJavascriptInterface();
//        WebView.setWebContentsDebuggingEnabled(true);
//        webView.getSettings().setUseWideViewPort(true);
//        runOnUiThread();
    }

    @Override
    protected void onResume() {
        super.onResume();
        webView.loadUrl("http://www.baidu.com");
    }
}
