package org.apache.cordova.vocaLogin;

import org.apache.cordova.CordovaPlugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by imunsu on 2017. 11. 7..
 */

public class VocaLogin extends CordovaPlugin {
    private java.lang.String userId;
    private java.lang.String userName;
    private java.lang.String userClass;
    private java.lang.String userCid;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if (action.equals("inputUserInfo")) {
            this.userId = args.getString(0);
            this.userName = args.getString(1);
            this.userClass = args.getString(2);
            this.userCid = args.getString(3);

            String res = "{userid:" + this.userId
                    + ",username:" + this.userName
                    + ",userclass:" + this.userClass
                    + ",usercid:" + this.userCid
                    + "}";
            JSONObject obj = new JSONObject(res);
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, obj));
            return true;
        }

        return false;
    }

}
