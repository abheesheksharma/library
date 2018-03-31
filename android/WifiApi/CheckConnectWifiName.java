// Add All inside OnCreate or in andother function
@SuppressLint("WifiManagerLeak") WifiManager wifi = (WifiManager) getSystemService( Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifi.getConnectionInfo();
        wifiInfo.getSSID();
        Toast.makeText( this, wifiInfo.getSSID().replace("\"", ""), Toast.LENGTH_SHORT ).show();
