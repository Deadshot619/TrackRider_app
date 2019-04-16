package com.trackrider.android.trackrider.Remote;

import com.trackrider.android.trackrider.utils.MyResponse;
import com.trackrider.android.trackrider.utils.Request;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {

    @Headers({
        "Content-Type:application/json",
        "Authorization:key=AAAAYcw_yJQ:APA91bEtugp7Ojz-j4rbD6-qQdSctWhiD9HfVN3aNlwEq1Jk0BPMirfBnqR-IECG-GHSXkVZsG3cs-__jG0RAkXBJIEbV6QZYkbqmjVDNRdsl5E_gQOmg85Eg0AXlXKh1UmXJXfe1vva"
    })

    @POST("fcm/send")
    Observable<MyResponse> sendFriendRequestToUser(@Body Request body);

}
