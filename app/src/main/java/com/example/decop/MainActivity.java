package com.example.decop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView par, insC, Ser, sms, acc, rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        final DrawerLayout drawerLayout = findViewById(R.id.accueil);
//              cote qui active la navigation
//        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawerLayout.openDrawer(GravityCompat.START);
//            }
//        });

//        NavigationView navigationView = findViewById(R.id.navue);
//        navigationView.setItemIconTintList(null);
//        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
//        NavigationUI.setupWithNavController (navigationView, navController);

        par = (ImageView) findViewById(R.id.parametre); //acce a l'image parametre
        insC = (ImageView) findViewById(R.id.compte); //acce a l'image connexion
        Ser = (ImageView) findViewById(R.id.serv); //acce a l'image service
        sms = (ImageView) findViewById(R.id.message);// acce a l'image message
        acc = (ImageView) findViewById(R.id.home); //acce a l'Image accueil
//        rec = (ImageView) findViewById(R.id.recherche); // acce a l'image

        FragmentManager fragmentManage = getSupportFragmentManager();

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManage.beginTransaction()
                        .replace(R.id.fragmentContainerView, message.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

//        par.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fragmentManage.beginTransaction()
//                        .replace(R.id.fragmentContainerView, settings.class, null)
//                        .setReorderingAllowed(true)
//                        .addToBackStack("name")
//                        .commit();
//            }
//        });



//        //Pour le parametre
        par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent i = new Intent(MainActivity.this, parametre.class);
                  startActivity(i);


            }
        });
//        par.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//
//                Toast i =Toast.makeText(MainActivity.this, "vous avez fait un long clic sur l'icone parametre", Toast.LENGTH_LONG);
//                i.show();
//                return true;
//            }
//        });
        //pour l'inscription client

        insC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent i = new Intent(MainActivity.this, clientdecorateur.class);
                  startActivity(i);


            }
        });

//        insC.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//
//                Toast i =Toast.makeText(MainActivity.this, "vous avez fait un long clic sur l'icone inscription client", Toast.LENGTH_LONG);
//                i.show();
//                return true;
//            }
//        });
//
        //pour les services

        Ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManage.beginTransaction()
                        .replace(R.id.fragmentContainerView, services.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
       acc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               fragmentManage.beginTransaction()
                       .replace(R.id.fragmentContainerView, accueil.class, null)
                       .setReorderingAllowed(true)
                       .addToBackStack("name")
                       .commit();
           }
       });
//
//       acc.setOnLongClickListener(new View.OnLongClickListener() {
//           @Override
//           public boolean onLongClick(View v) {
//
//               Toast i =Toast.makeText(MainActivity.this, "vous avez fait un long clic sur l'icone accueil", Toast.LENGTH_LONG);
//               i.show();
//               return true;
//           }
//       });
//
//       rec.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Toast i =Toast.makeText(MainActivity.this, "service recherche non disponible", Toast.LENGTH_LONG);
//               i.show();
//           }
//       });
//
//       rec.setOnLongClickListener(new View.OnLongClickListener() {
//           @Override
//           public boolean onLongClick(View v) {
//
//               Toast i =Toast.makeText(MainActivity.this, "vous avez fait un long clic sur l'icone recherche", Toast.LENGTH_LONG);
//               i.show();
//               return true;
//           }
//       });
//
    }
}