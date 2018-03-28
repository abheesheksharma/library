@Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            Toast.makeText( this, "Back Button Clicked", Toast.LENGTH_SHORT ).show();
            myWebView.goBack();
        }
        else
        {
            AlertDialog.Builder a_builder = new AlertDialog.Builder( this );
            a_builder.setMessage( "Do you really Want to Exit?" )
                    .setCancelable( false )
                    .setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    } )
                    .setNegativeButton( "No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    } );
            AlertDialog alert = a_builder.create();
            alert.setTitle( "Alert!!!" );
            super.onBackPressed();

        }
    }
