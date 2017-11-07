var argscheck = require('cordova/argscheck'),
    utils = require('cordova/utils'),
    exec = require('cordova/exec');

var VocaLogin = function() {
};

VocaLogin.userid = null;
VocaLogin.username = null;
VocaLogin.userclass = null;
VocaLogin.usercid = null;

VocaLogin.inputUserInfo = function(arg) {
  var self = this;
  var params = object.assign({}, {
      userid:"",
      username:"",
      userclass:"",
      usercid:""
  }, arg||{});

  exec(function(winParam) {
    self.userid = winParam.userid;
    self.username = winParam.username;
    self.userclass = winParam.userclass;
    self.usercid = winParam.usercid;
  },
  function(error) { console.log(error); },
  "CDVVocaLogin",
  "inputUserInfo",
  [
      params.userid,
      params.username,
      params.userclass,
      params.usercid
  ]
  );
}

VocaLogin.getUserId = function() {
  exec(function(winParam) {
    return winParam;
  },
  function(error) { console.log(error); },
  "CDVVocaLogin",
  "getUserId",
  []
  );
}

VocaLogin.getUserName = function() {
  exec(function(winParam) {
    return winParam;
  },
  function(error) { console.log(error); },
  "CDVVocaLogin",
  "getUserName",
  []
  );
}

VocaLogin.getUserClass = function() {
  exec(function(winParam) {
    return winParam;
  },
  function(error) { console.log(error); },
  "CDVVocaLogin",
  "getUserClass",
  []
  );
}

VocaLogin.getUserCid = function() {
  exec(function(winParam) {
    return winParam;
  },
  function(error) { console.log(error); },
  "CDVVocaLogin",
  "getUserCid",
  []
  );
}

module.exports = VocaLogin;
