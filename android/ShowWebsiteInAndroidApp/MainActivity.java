// below class name
private WebView myWebView;

// within oncreate function
myWebView = (WebView) findViewById(R.id.webView);
WebSettings webSettings = myWebView.getSettings();
webSettings.setJavaScriptEnabled( true ); // It enabls to eun javascript in app
myWebView.setWebViewClient(new WebViewClient()); // It for open other links of website inside the app

//This is new function for backbutton
@Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
