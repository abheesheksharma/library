// below class name
private WebView myWebView;

// within oncreate function
myWebView = (WebView) findViewById(R.id.webView);
WebSettings webSettings = myWebView.getSettings();

webSettings.setJavaScriptEnabled( true ); // It enabls to eun javascript in app
