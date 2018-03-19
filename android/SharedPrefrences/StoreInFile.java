//Before oncreate Function

public static final String MY_PREFS_FILENAME = "tk.onethinkcode.medicalplus.password";

// After On create or on another function

SharedPreferences.Editor editor = getSharedPreferences( MY_PREFS_FILENAME, MODE_PRIVATE ).edit();
editor.putString( "password", password);
editor.commit();
