package com.wenbin.myapplication3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/12.
 */
public class da {

    /**
     * name : 中国
     * province : [{"name":"黑龙江","cities":{"city":["哈尔滨","大庆"]}},{"name":"广东","cities":{"city":["广州","深圳","珠海"]}},{"name":"台湾","cities":{"city":["台北","高雄"]}},{"name":"新疆","cities":{"city":["乌鲁木齐"]}}]
     */

    private String name;
    /**
     * name : 黑龙江
     * cities : {"city":["哈尔滨","大庆"]}
     */

    private List<ProvinceBean> province;

    public static da objectFromData(String str) {

        return new Gson().fromJson(str, da.class);
    }

    public static da objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), da.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<da> arraydaFromData(String str) {

        Type listType = new TypeToken<ArrayList<da>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<da> arraydaFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<da>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProvinceBean> getProvince() {
        return province;
    }

    public void setProvince(List<ProvinceBean> province) {
        this.province = province;
    }

    public static class ProvinceBean {
        private String name;
        private CitiesBean cities;

        public static ProvinceBean objectFromData(String str) {

            return new Gson().fromJson(str, ProvinceBean.class);
        }

        public static ProvinceBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ProvinceBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ProvinceBean> arrayProvinceBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ProvinceBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ProvinceBean> arrayProvinceBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ProvinceBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CitiesBean getCities() {
            return cities;
        }

        public void setCities(CitiesBean cities) {
            this.cities = cities;
        }

        public static class CitiesBean {
            private List<String> city;

            public static CitiesBean objectFromData(String str) {

                return new Gson().fromJson(str, CitiesBean.class);
            }

            public static CitiesBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), CitiesBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<CitiesBean> arrayCitiesBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<CitiesBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<CitiesBean> arrayCitiesBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<CitiesBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public List<String> getCity() {
                return city;
            }

            public void setCity(List<String> city) {
                this.city = city;
            }
        }
    }
}
