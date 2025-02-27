package com.example.donkeykong;

import androidx.appcompat.app.AppCompatActivity;
import br.ol.donkey.DonkeyGame;
import br.ol.donkey.infra.Display;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        public void run() {
            DonkeyGame game = new DonkeyGame();
            Display view = new Display(game);
            JFrame frame = new JFrame();
            frame.setTitle("Java Donkey Kong");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(view);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
            view.requestFocus();
            view.start();
        }

    });
}
    }
}
