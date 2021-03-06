package in.trydevs.sundar.walletoscreens.extras;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


public class MyApplication extends Application {

    private static final int JOB_ID = 1020;
    private static MyApplication mInstance;
//    JobInfo.Builder builder;
    SharedPreferences loginDetails;
//    private JobScheduler mJobScheduler;

    public static MyApplication getInstance() {
        return mInstance;
    }

    public static Context getAppContext() {
        return mInstance.getApplicationContext();
    }


    /*
     public void constructJob() {
         mJobScheduler = JobScheduler.getInstance(this);
         builder = new JobInfo.Builder(JOB_ID, new ComponentName(this, MyServiceChecker.class));
         long time = 1000 * 60 * 5;
         builder.setPeriodic(time)
                 .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
                 .setPersisted(true);
         mJobScheduler.schedule(builder.build());
     }

     public void schedule() {
         mJobScheduler.schedule(builder.build());
     }

     private boolean check() {
         // getting Logged in data
         int user_id;
         String unique_id;
         loginDetails = getSharedPreferences(UrlLinksNames.getLoginFileName(), 0);
         user_id = loginDetails.getInt("user_id", 0);
         unique_id = loginDetails.getString("unique_id", "");

         // Checking for discrepency
         return !(user_id == 0 || unique_id.equals(""));
     }
 */
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
       // if (check())
       //     constructJob();
    }

}
