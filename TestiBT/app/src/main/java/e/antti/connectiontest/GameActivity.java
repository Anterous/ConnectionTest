package e.antti.connectiontest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class GameActivity extends Activity {

    String connectedDevice;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Bundle extras = getIntent().getExtras();

        connectedDevice = extras.getString("Connected Device name");
        textView = findViewById(R.id.texter);
        textView.setText("This is game activity.  You are connected with device: " + connectedDevice);

    }
}
