// Before On Create 
private ProgressDialog mProgress;

//After oncreate or in another function
 mProgress = new ProgressDialog(this);
mProgress.setMessage("Signing You In...");
mProgress.show();

mProgress.dismiss();
