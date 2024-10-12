package burp;

import java.util.Arrays;
import java.util.List;

/**
 * Project: fakeIP
 * Date:2021/5/21 上午11:56
 *
 * @author CoolCat
 * @version 1.0.0
 * Github:https://github.com/TheKingOfDuck
 * When I wirting my code, only God and I know what it does. After a while, only God knows.
 */
public class Config {
    public static List<String> HEADER_LIST = Arrays.asList(
            "X-Forwarded-For","X-Forwarded","Forwarded-For","Forwarded","X-Requested-With","X-Forwarded-Proto", "X-Forwarded-Host",
            "X-remote-IP","X-remote-addr","True-Client-IP","X-Client-IP","Client-IP","X-Real-IP",
            "Ali-CDN-Real-IP","Cdn-Src-Ip","Cdn-Real-Ip","CF-Connecting-IP","X-Cluster-Client-IP",
            "WL-Proxy-Client-IP", "Proxy-Client-IP","Fastly-Client-Ip","True-Client-Ip","X-Originating-IP",
            "X-Host","X-Custom-IP-Authorization","X-Api-Version"
    );

    public static List<String> IP_HEADER_LIST = Arrays.asList(
            "Real-Ip","X-Original-Remote-Addr","X-Host","X-Forwarded-Host","Akamai-Client-Ip","X-Forwarded-Server",
            "X-Http-Host-Override","X-True-IP","Forwarded-For","X-Http-Destinationurl","X-Requested-With","Cdn-Src-Ip",
            "X-Custom-IP-Authorization","Cdn-Real-IP","X-Forwarder-For","Request-Uri","Client-IP","Proxy-Client-IP",
            "X-Cluster-Client-IP","Base-Url","X-Forwarded-By","Cdn-Src-IP","True-Client-IP","X-Remote-IP",
            "X-Forward-For","True-Client-Ip","X-Real-IP","X-Forwarded-For-Original","X-Remote-Addr","X-Original-Url",
            "X-Forwarded","X-remote-addr","X-Forwarded-Proto","Ali-CDN-Real-IP","WL-Proxy-Client-IP","Url","Uri",
            "X-Rewrite-Url","Referer","Refferer","X-Real-Ip","X-Forwarded-For","X-Originating-IP","Fastly-Client-IP",
            "X-Api-Version","Redirect","Proxy-Host","Http-Url","Cdn-Real-Ip","Proxy-Url","X-Proxy-Url","X-Client-IP",
            "CF-Connecting-IP","SourceIp","X-remote-IP","Forwarded","Referrer","Fastly-Client-Ip"
            );

    public static boolean AUTOXFF_STAT = false;
    public static String AUTOXFF_KEY = "X-Forwarded-For";
    public static String AUTOXFF_VALUE = "$RandomIp$";
}
