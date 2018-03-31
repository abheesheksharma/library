@SuppressLint("WifiManagerLeak") WifiManager wifi = (WifiManager) getSystemService( WIFI_SERVICE);
WifiInfo wifiInfo = wifi.getConnectionInfo();
String ipa = wifiInfo.getBSSID();
