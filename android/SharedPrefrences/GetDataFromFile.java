SharedPreferences prefs = getSharedPreferences( MY_PREFS_FILENAME, MODE_PRIVATE );
            String password = prefs.getString("password", "");

            personname.setText( password );
