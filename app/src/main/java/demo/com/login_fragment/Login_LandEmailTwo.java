package demo.com.login_fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import demo.com.R;
public class Login_LandEmailTwo extends Fragment {
    private TextView textView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_landemailtwo, null);
        textView=view.findViewById(R.id.emailtext);
        Button next = view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Login_LandEmailThree landing = new Login_LandEmailThree();
                transaction.add(R.id.loginFrag, landing);
                transaction.commit();
            }
        });
        return view;
    }
}
