 /* These two needs to add inside main class*/
 public DrawerLayout nDrawerLayout;
 public ActionBarDrawerToggle nToggle;
/* End both*/

/* It needs to include in onCreate Class*/
nDrawerLayout = (DrawerLayout) findViewById( R.id.drawerLayout );
nToggle =  new ActionBarDrawerToggle(this, nDrawerLayout, R.string.open, R.string.close );

nDrawerLayout.addDrawerListener( nToggle );
nToggle.syncState();

getSupportActionBar().setDisplayHomeAsUpEnabled( true ); //This is for show three lines on top
/* End of this*/

@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //This is for upper toggle three lines
        if(nToggle.onOptionsItemSelected( item )){
            return true;
        }
        return super.onOptionsItemSelected( item );
    }
