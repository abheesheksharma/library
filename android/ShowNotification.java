Intent intent = new Intent();
        PendingIntent pIntent = PendingIntent.getActivity( MainActivity.this,0,intent,0 );
        Notification noti = new Notification.Builder( MainActivity.this )
                .setTicker( "This is Title" )
                .setContentTitle( "This is Content Titile" )
                .setContentText( "This is content text" )
                .setSmallIcon( R.drawable.ic_launcher_foreground )
                .setContentIntent(pIntent).getNotification();
        noti.flags = Notification.FLAG_AUTO_CANCEL;
        NotificationManager nm = (NotificationManager)getSystemService( NOTIFICATION_SERVICE );
        nm.notify( 0,noti );
