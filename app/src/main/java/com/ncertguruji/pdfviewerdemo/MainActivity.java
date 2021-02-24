package com.ncertguruji.pdfviewerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {


    PDFView pdfView;
//    String pdfUrl = "https://ncertguruji.com/fess109.pdf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         pdfView = findViewById(R.id.pdfView);

        /**
         * This displays pdf from assets folder, for now this is in the scope
         */
        pdfView.fromAsset("ch9.pdf").load();

        /**
         * Now trying to display pdf from url
         */


//        new RetrivePDFfromUrl().execute(pdfUrl);

    }

//    class RetrivePDFfromUrl extends AsyncTask<String, Void, InputStream> {
//        @Override
//        protected InputStream doInBackground(String... strings) {
//            // we are using inputstream
//            // for getting out PDF.
//            InputStream inputStream = null;
//            try {
//                URL url = new URL(strings[0]);
//                // below is the step where we are
//                // creating our connection.
//                HttpURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
//                if (urlConnection.getResponseCode() == 200) {
//                    // response is success.
//                    // we are getting input stream from url
//                    // and storing it in our variable.
//                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
//                }
//
//            } catch (IOException e) {
//                // this is the method
//                // to handle errors.
//                e.printStackTrace();
//                return null;
//            }
//            return inputStream;
//        }
//        @Override
//        protected void onPostExecute(InputStream inputStream) {
//            // after the execution of our async
//            // task we are loading our pdf in our pdf view.
//            pdfView.fromStream(inputStream).load();
//        }
//    }
    /**
     *TODO: We are getting some ssl exception while loading it from a ssl url and the
     * fix is to provide the .pem file which in my case changes every three months
     * because I use open ssl free for three months
     */

}