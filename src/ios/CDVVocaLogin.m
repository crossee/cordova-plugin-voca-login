//
//  CDVVocaLogin.m
//
//  Created by crossee on 2017. 11. 2..
//

#import "CDVVocaLogin.h"

@implementation CDVVocaLogin

- (void) inputUserInfo:(CDVInvokedUrlCommand *)command
{
    self.userId = [command.arguments objectAtIndex:0];
    self.userName = [command.arguments objectAtIndex:1];
    self.userClass = [command.arguments objectAtIndex:2];
    self.userCid = [command.arguments objectAtIndex:3];

    NSDictionary *jsonInfo = @{@"userid":self.userId,
                               @"username":self.userName,
                               @"userclass":self.userClass,
                               @"usercid":self.userCid
                               };

    CDVPluginResult* pluginResult = [ CDVPluginResult
                                     resultWithStatus    : CDVCommandStatus_OK
                                     messageAsDictionary : jsonInfo
                                     ];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
