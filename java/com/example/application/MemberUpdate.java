package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_update);
        final Context _this = MemberUpdate.this;
        String[] arr = this.getIntent()
                .getStringExtra("spec")
                .split(",");
        /*
        * member.seq,member.name,
                                member.email,member.phone,
                                member.addr,member.photo
        * */
        ImageView profile = findViewById(R.id.profile);
        profile.setImageDrawable(
                getResources()
                        .getDrawable(
                                getResources()
                                        .getIdentifier(
                                                _this.getPackageName()+":drawable/"+arr[5],
                                                null,
                                                null
                                        )
                        )
        );
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.changeEmail);
        TextView phone = findViewById(R.id.changePhone);
        TextView addr = findViewById(R.id.changeAddress);
        name.setText(arr[1]);
        email.setText(arr[2]);
        phone.setText(arr[3]);
        addr.setText(arr[4]);
    }
}
