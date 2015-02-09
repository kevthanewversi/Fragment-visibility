//This method runs automatically each time a fragment is shown
@Override
	public void setUserVisibleHint(boolean isVisibleToUser){
		super.setUserVisibleHint(isVisibleToUser);
		if(isVisibleToUser){
	   	//Code to be run whenever fragment becomes visible to the user
			Log.d(getTag(), "WORKS LIKE A CHARM"); //just to test if it's working
			}
		else{}
	}
