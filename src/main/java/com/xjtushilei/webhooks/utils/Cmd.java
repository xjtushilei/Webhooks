package com.xjtushilei.webhooks.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * @author shilei
 * @Date 2017/9/29.
 */
public class Cmd {

    public static String execWindowsCmd(String cmd) {
        int exitValue = -1;
        InputStream ins = null;
        String[] command = new String[] { "Cmd.exe", "/c", cmd }; // 命令
        try {
            Process process = Runtime.getRuntime().exec(command);
            ins = process.getInputStream(); // 获取执行cmd命令后的信息
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));

            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line); // 输出
                sb.append(line).append("\n");
            }
//            exitValue = process.waitFor();
            //			System.out.println("返回值：" + exitValue);
            ins.close();
            process.getOutputStream().close(); // 不要忘记了一定要关
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String execLinuxCmd(String cmd) {
        try {
            String[] cmdA = {"/bin/sh", "-c", cmd};
            Process process = Runtime.getRuntime().exec(cmdA);
            LineNumberReader br = new LineNumberReader(new InputStreamReader(
                    process.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            process.getOutputStream().close(); // 不要忘记了一定要关
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
