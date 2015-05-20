package com.example.amado.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Amado on 19/05/2015.
 */
public class AudioPlayer {

    private MediaPlayer mPlayer;

    public void stop(){
        if(mPlayer!=null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play (Context c){
        if(mPlayer != null&&mPlayer.isPlaying()){
            mPlayer.pause();

        }else {


            if(mPlayer==null) {
                mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
            }
            mPlayer.start();
            mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stop();
                }
            });
            mPlayer.start();

        }
    }
}
