package com.example.fragment;

import com.example.helloworld.R;
import com.example.fragment.SimpleTextInputCellFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForGotPasswordFargment extends Fragment {
	SimpleTextInputCellFragment fragEmail;
	View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		if(view==null){
			view = inflater.inflate(R.layout.activity_forgot_password1, null);
			
			fragEmail = (SimpleTextInputCellFragment) getFragmentManager().findFragmentById(R.id.input_email);
			
			view.findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					goNext();
				}
			});	
		}
		
		return view;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		fragEmail.setLabelText("” œ‰");
		fragEmail.setHintText(" ‰»Î” œ‰");
	}
	
	public static interface OnGoNextListener{
		void onGoNext();
	}
	
	OnGoNextListener onGoNextListener;
	
	public void setOnGoNextListener(OnGoNextListener onGoNextListener) {
		this.onGoNextListener = onGoNextListener;
	}
	
	void goNext(){
		if(onGoNextListener!=null){
			onGoNextListener.onGoNext();
		}
	}
}
