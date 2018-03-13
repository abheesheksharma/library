Intent page = new Intent( Login.this, UserAfterLogin.class );
Intent myaccount = new Intent( Login.this,UserAfterLogin.class );
                    //This is for not go back again in login
myaccount.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
myaccount.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
startActivity( page );
finish(); // This is for back button
