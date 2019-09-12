package dk.easj.anbo.firebaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        TextView messageView = findViewById(R.id.RealMessageTextView);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null)
            messageView.setText("Welcome " + user.getEmail());
        else
            messageView.setText("FirebaseUser is null!?!?!");
    }

    public void logoutButtonClicked(View view) {
        FirebaseAuth.getInstance().signOut();
        finish();
    }
}
