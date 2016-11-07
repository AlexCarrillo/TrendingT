/*-------------------------------------------------------------------------------------------------
*
*File: LoginActivity.java
* Autor: Jesús Alejandro Carrillo Arreola
* Contact: alexcarrilloar@gmail.com
* Date: October/27/2016
* Description: It is an application to see the trending topics, images and memes of your friends
*
*Last Modification
* Date                 Modified by                  Modification
*==================================================================================================
*October/28/2016    J. Alejandro Carrillo Arreola
*October/28/2016    J. Alejandro Carrillo Arreola   
*------------------------------------------------------------------------------------------------ */


package ma.alexcarrilloar.android.trendingt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.fabric.sdk.android.Fabric;
import ma.alexcarrilloar.android.trendingt.main.MainActivity;

public class LoginActivity extends AppCompatActivity {


    @Bind(R.id.twitterLoginButton)
    TwitterLoginButton twitterLoginButton;
    @Bind(R.id.container)
    RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(BuildConfig.TWITTER_KEY,BuildConfig.TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        if(Twitter.getSessionManager().getActiveSession() != null)
        {
            navigateToMainScreen();
        }
        twitterLoginButton.setCallback(new Callback<TwitterSession>() {
            @Override
            public void success(Result<TwitterSession> result) {
                navigateToMainScreen();
            }

            @Override
            public void failure(TwitterException e) {
                String msgError = String.format(getString(R.string.login_error_message),e.getLocalizedMessage());
                Snackbar.make(container,msgError,Snackbar.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        twitterLoginButton.onActivityResult(requestCode, resultCode, data);
    }

    private void navigateToMainScreen() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_NEW_TASK |
                Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);


    }
}
