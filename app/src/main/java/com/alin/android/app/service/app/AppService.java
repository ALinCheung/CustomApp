package com.alin.android.app.service.app;

import com.alin.android.app.model.App;
import com.alin.android.app.model.Banner;
import io.reactivex.Observable;
import ren.yale.android.retrofitcachelibrx2.anno.Mock;
import retrofit2.http.GET;

import java.util.List;

/**
 * @Description 应用接口
 * @Author zhangwl
 * @Date 2021/7/16 17:59
 */
public interface AppService {

    @Mock(assets = "json/app_list.json")
    @GET("/app/list")
    Observable<List<App>> getAppList();

    @Mock(assets = "json/banner_list.json")
    @GET("/banner/list")
    Observable<List<Banner>> getBannerList();
}
