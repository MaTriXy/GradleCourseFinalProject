package com.udacity.gradle.builditbigger;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.udacity.gradle.builditbigger.MainActivity.ServletPostAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

  @Test
  public void testAsyncTask() throws InterruptedException {
    AsyncTask asyncTask = new ServletPostAsyncTask() {

      @Override
      protected void onPostExecute(String result) {
        assertNotNull(result);
        assertNotEquals(result, "");
      }
    };
    asyncTask.execute(InstrumentationRegistry.getContext());
  }

}
