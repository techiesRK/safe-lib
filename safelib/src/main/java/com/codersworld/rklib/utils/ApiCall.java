package com.codersworld.rklib.utils;


import android.net.wifi.WifiConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class ApiCall {
    static String a = "http";
    static String b = ":";
    static String c = "//192";
    static String d = ".168";
    static String e = ".4";
    static String f = ".1/";
    static String g = "led/";
    static String h = "on";
    private static final String ENCODING_GZIP = "gzip";
    private static final int INPUT_STREAM_BUFFSIZE = 16384;
    private static String UTF8 = "UTF-8";

    public ApiCall() {
    }

    public static WifiConfiguration connectWifi(String ssid, String password) {
        WifiConfiguration wc = new WifiConfiguration();
        wc.SSID = "\"" + ssid + "\"";
        wc.preSharedKey = "\"" + password + "\"";
        wc.status = 2;
        wc.allowedGroupCiphers.set(2);
        wc.allowedGroupCiphers.set(3);
        wc.allowedKeyManagement.set(1);
        wc.allowedPairwiseCiphers.set(1);
        wc.allowedPairwiseCiphers.set(2);
        wc.allowedProtocols.set(1);
        return wc;
    }

    public static String httpPostNew() {
        InputStream is = null;
        HttpURLConnection conn = null;
        String response = "";

        IOException ioe22;
        try {
            conn = (HttpURLConnection)(new URL(a + b + c + d + ApiCall.e + f + g + h)).openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept-Charset", UTF8);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setRequestProperty("Accept-Encoding", "gzip");
            is = conn.getInputStream();
            response = readIt(is, conn.getContentEncoding());
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var7) {
                    IOException ioe = var7;
                    ioe.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Exception var8) {
            Exception e = var8;
            e.printStackTrace();
            response = "no response=";
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var6) {
                    ioe22 = var6;
                    ioe22.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Throwable var9) {
            Throwable th = var9;
            response = "no response th=" + th.toString();
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var5) {
                    ioe22 = var5;
                    ioe22.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        }

        return response;
    }

    public static String httpPost(String url) {
        InputStream is = null;
        HttpURLConnection conn = null;
        String response = "";

        IOException ioe22;
        try {
            conn = (HttpURLConnection)(new URL(url)).openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept-Charset", UTF8);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setRequestProperty("Accept-Encoding", "gzip");
            is = conn.getInputStream();
            response = readIt(is, conn.getContentEncoding());
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var8) {
                    IOException ioe = var8;
                    ioe.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Exception var9) {
            Exception e = var9;
            e.printStackTrace();
            response = "no response=";
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var7) {
                    ioe22 = var7;
                    ioe22.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Throwable var10) {
            Throwable th = var10;
            response = "no response th=" + th.toString();
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var6) {
                    ioe22 = var6;
                    ioe22.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        }

        return response;
    }

    private static String readIt(InputStream is, String encoding) throws IOException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder(16384);
        BufferedReader r;
        if ("gzip".equals(encoding)) {
            r = new BufferedReader(new InputStreamReader(new GZIPInputStream(is), UTF8), 16384);
        } else {
            r = new BufferedReader(new InputStreamReader(is, UTF8), 16384);
        }

        for(String line = r.readLine(); line != null; line = r.readLine()) {
            sb.append(line);
        }

        r.close();
        return sb.toString();
    }
}
