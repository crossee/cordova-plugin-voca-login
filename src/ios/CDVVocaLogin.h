//
//  CDVVocaLogin.h
//
//  Created by crossee on 2017. 11. 2..
//

#import <Cordova/CDV.h>

@interface CDVVocaLogin : CDVPlugin

@property NSString* userId;
@property NSString* userName;
@property NSString* userClass;
@property NSString* userCid;

- (void) inputUserInfo:(CDVInvokedUrlCommand *)command;

@end
