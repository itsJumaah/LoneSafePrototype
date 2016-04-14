package io.github.xbazzu.lonesafe;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by buzz on 15/04/16.
 */
public class Request extends StringRequest {

    private static final String LOGIN_URL = "http://lonesafe.site88.net/login.php";

    private Map<String, String> params;

    public Request(String username, String password, Response.Listener<String> listener) {
        super(Request.Method.POST, LOGIN_URL, listener, null);

        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
