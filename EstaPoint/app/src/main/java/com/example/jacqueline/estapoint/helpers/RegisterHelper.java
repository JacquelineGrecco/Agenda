package com.example.jacqueline.estapoint.helpers;

import android.widget.EditText;

import com.example.jacqueline.estapoint.R;
import com.example.jacqueline.estapoint.RegisterActivity;
import com.example.jacqueline.estapoint.model.User;
import com.vicmikhailau.maskededittext.MaskedFormatter;
import com.vicmikhailau.maskededittext.MaskedWatcher;

public class RegisterHelper {
    private final EditText register_name;
    private final EditText register_last_name;
    private final EditText register_email;
    private final EditText register_password;
    private final EditText register_birth;

    private User user;

    public RegisterHelper(RegisterActivity activity) {

        MaskedFormatter formatter = new MaskedFormatter("##/##/####");

        register_name      = activity.findViewById(R.id.form_register_name);
        register_last_name = activity.findViewById(R.id.form_register_last_name);
        register_email     = activity.findViewById(R.id.form_register_email);
        register_password  = activity.findViewById(R.id.form_register_password);
        register_birth     = activity.findViewById(R.id.form_register_birth);

        register_birth.addTextChangedListener(new MaskedWatcher(formatter,register_birth));

    }

    public void fillForm(User user) {
        register_name.setText(user.getName());
        register_last_name.setText(user.getLastname());
        register_email.setText(user.getEmail());
        this.user = user;
    }

    public User getUser() throws Exception {
        user.setName(register_name.getText().toString());
        user.setLastname(register_last_name.getText().toString());
        user.setPassword(register_password.getText().toString());
        user.setEmail(register_email.getText().toString());

        return user;
    }

}


