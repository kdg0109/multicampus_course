package com.example.student.p230;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainFragment main;
    LoginFragment login;
    RegisterFragment register;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = new MainFragment();
        login = new LoginFragment();
        register = new RegisterFragment();

        manager = getSupportFragmentManager();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(
                    R.id.container,
                    new MainFragment()).commit();
        }
    }

    public void clickBt(View v){
        if(v.getId() == R.id.Button){
            manager.beginTransaction().replace(
                    R.id.container,
                    main
            ).commit();
        }else if(v.getId() == R.id.login_bt){
            manager.beginTransaction().replace(
                    R.id.container,
                    login
            ).commit();
        }else if(v.getId() == R.id.register_bt){
            register.setType(1);
            manager.beginTransaction().replace(
                    R.id.container,
                    register
            ).commit();
        }else if(v.getId() == R.id.r_bt){
            register.setType(2);
            manager.beginTransaction().replace(
                    R.id.container,
                    register
            ).commit();

        }
    }
    public static class MainFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.mainlayout, container, false);
            return v;
        }
    }
    public static class LoginFragment extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.loginlayout, container, false);
            return v;
        }
    }
    public static class RegisterFragment extends Fragment {
        int type;

        public void setType(int type) {
            this.type = type;
        }
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.registerlayout, container, false);
            TextView tv = v.findViewById(R.id.textView2);
            if(type == 1) {
                tv.setText("FROM HOME");
            }else if(type == 2) {
                tv.setText("FROM LOGIN");
            }
            return v;
        }
    }
}

//
//import android.app.Fragment;
//        import android.support.annotation.Nullable;
//        import android.support.v4.app.FragmentManager;
//        import android.support.v7.app.AppCompatActivity;
//        import android.os.Bundle;
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.ViewGroup;
//        import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    MainFragment mainFragment;
//    LoginFragment loginFragment;
//    RegisterFragment registerFragment;
//
//    FragmentManager fragmentManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        initUI();
//
//        if(savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().add(R.id.cntn, new MainFragment()).commit();
//        }
//    }
//
//    public void initUI() {
//        mainFragment = new MainFragment();
//        loginFragment = new LoginFragment();
//        registerFragment = new RegisterFragment();
//
//        fragmentManager = getSupportFragmentManager();
//    }
//
//    public void onClickBtn(View v) {
//        switch (v.getId()) {
//            case R.id.btn :
//                fragmentManager.beginTransaction().replace(R.id.cntn, mainFragment).commit();
//                break;
//            case R.id.main_btn_login :
//                fragmentManager.beginTransaction().replace(R.id.cntn, loginFragment).commit();
//                break;
//            case R.id.main_btn_register :
//                registerFragment.setType(1);
//                fragmentManager.beginTransaction().replace(R.id.cntn, registerFragment).commit();
//                break;
//            case R.id.login_btn_register :
//                registerFragment.setType(2);
//                fragmentManager.beginTransaction().replace(R.id.cntn, registerFragment).commit();
//                break;
//        }
//    }
//    public static class MainFragment extends android.support.v4.app.Fragment{
//        @Nullable
//        @Override
//        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//            View v = inflater.inflate(R.layout.mainlayout, container, false);
//            return v;
//        }
//    }
//
//    public static class LoginFragment extends android.support.v4.app.Fragment {
//        @Nullable
//        @Override
//        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//            View v = inflater.inflate(R.layout.loginlayout, container, false);
//            return v;
//        }
//    }
//
//    public static class RegisterFragment extends android.support.v4.app.Fragment {
//
//        private int type;
//        private TextView rgstr_txtv;
//
//        public int getType() {
//            return type;
//        }
//
//        public void setType(int type) {
//            this.type = type;
//        }
//
//        @Nullable
//        @Override
//        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//            View v = inflater.inflate(R.layout.registerlayout, container, false);
//            rgstr_txtv = v.findViewById(R.id.rgstr_txtv);
//            rgstr_txtv.setText(String.valueOf(getType()));
//            return v;
//        }
//    }
//
//}