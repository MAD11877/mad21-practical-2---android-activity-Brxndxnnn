package sg.edu.np.mad.Practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    User user123 = new User("Brandon", "Blue Red White Sheep", 1, false);

    public void followButton(View v){
        Button follow = findViewById(R.id.button);
        if(!user123.followed){
            follow.setText("Unfollow");
            user123.followed = true;
        }
        else{
            follow.setText("Follow");
            user123.followed = false;
        }

    }

   // User user123 = new User("Brandon", "Blue Red White Sheep", 1, false);



}